package com.atguigu03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe.runnablesafe
 * Description:
 *  同步方法解決
 * @Author 張彥瑋
 * @Create 2024/3/29 11:42 AM
 * @Version 1.0
 */
public class WindowTest implements Runnable{
        int ticket=100;
        boolean isFlag=true;
    @Override
    public void run() {
        while (isFlag){
            show();
        }
    }
    public synchronized void show(){//  此時的同步監視器是：this,此題目中即為s是唯一的
        if (ticket>0){

            System.out.println(Thread.currentThread().getName()+
                    "售票，票號"+ticket);
            ticket--;
        }else {
            isFlag=false;
        }
    }
}
class Window{
    public static void main(String[] args) {
        WindowTest s =new WindowTest();
        Thread w1 =new Thread(s);
        Thread w2 =new Thread(s);
        Thread w3 =new Thread(s);
        w1.setName("w1");
        w2.setName("w2");
        w3.setName("w3");
        w1.start();
        w2.start();
        w3.start();
    }
}