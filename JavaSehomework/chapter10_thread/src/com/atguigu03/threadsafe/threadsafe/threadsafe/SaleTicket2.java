package com.atguigu03.threadsafe.threadsafe.threadsafe;

/**
 * ClassName: SaleTicket2
 * Package: com.atguigu03.threadsafe.threadsafe
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/3/29 10:24 AM
 * @Version 1.0
 */
public class SaleTicket2 extends Thread {
    static int ticket = 100;
    static Object obj = new Object();
    static boolean isFlag=true;

    public void run() {
        while (isFlag) {
            try {
                sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            show();

        }
    }
    public static synchronized void show(){//此時還是this w1 w2 w3 看情形 目前加靜態或是把if包起來
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() +
                    "售出，票號為：" + ticket);
            ticket--;
        } else {
            isFlag=false;
        }
    }
}

class Windows3 {
    public static void main(String[] args) {
        SaleTicket2 s1 = new SaleTicket2();
        SaleTicket2 s2 = new SaleTicket2();
        SaleTicket2 s3 = new SaleTicket2();
        s1.setName("w1");
        s2.setName("w2");
        s3.setName("w3");

        s1.start();
        s2.start();
        s3.start();
    }


}
