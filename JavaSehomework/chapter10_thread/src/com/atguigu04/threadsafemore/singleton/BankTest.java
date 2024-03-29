package com.atguigu04.threadsafemore.singleton;

import javax.xml.transform.Source;

/**
 * ClassName: BankTest
 * Package: com.atguigu04.threadsafemore.singleton
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/3/29 10:02 PM
 * @Version 1.0
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
        ;
    }
}

class Bank {
    private Bank() {
    }

    private static volatile Bank instance = null;

    //way 1
//    public static synchronized Bank getInstance(){ //同步監視器，默認為Bank class
//        if (instance ==null){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            instance = new Bank();
//        }
//        return instance;
//    }
    //way2
//    public static synchronized Bank getInstance() { //同步監視器，默認為Bank class
//        synchronized (Bank.class) {
//            if (instance == null) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                instance = new Bank();
//            }
//            return instance;
//        }
    //way3 way2的優化 效率更高 為了避免指令重排 需要將instance 聲明為volatile
    public static synchronized Bank getInstance() { //同步監視器，默認為Bank class
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    instance = new Bank();
                }
                return instance;
            }
        }
        return instance;
    }


}
