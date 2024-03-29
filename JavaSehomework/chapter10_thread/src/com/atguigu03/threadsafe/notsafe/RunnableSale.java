package com.atguigu03.threadsafe.notsafe;

/**
 * ClassName: RunnableSale
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 *例题：开启三个窗口售票，总票数为100张。
 * @Author 張彥瑋
 * @Create 2024/3/29/029 上午 01:45
 * @Version 1.0
 */
public class RunnableSale implements  Runnable{
    int ticket=100;
    Object obj =new Object();
    @Override
    public void run() {
        while (true){

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            synchronized (this) { //s 是唯一的

                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"ticket number is " +ticket);
                    ticket--;

                }else {
                    return;
                }

            }
        }
    }

    public static void main(String[] args) {
        RunnableSale s= new RunnableSale();

        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        Thread t3=new Thread(s);

        t1.setName("w1");
        t2.setName("w2");
        t3.setName("w3");

        t1.start();
        t2.start();
        t3.start();

    }
}
