package com.atguigu03.threadsafe.threadsafe;

/**
 * ClassName: SaleTicket
 * Package: com.atguigu03.threadsafe.threadsafe
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/3/29 10:24 AM
 * @Version 1.0
 */
public class SaleTicket extends Thread{
    static int ticket=100;
    static Object obj =new Object();
    public void run(){
        while (true){
            try {
                sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (SaleTicket.class) {
                //this會變成三個對象的各自 不唯一
                //obj 不加static也不行
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+
                            "售出，票號為："+ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}

class  Windows {
    public static void main(String[] args) {
        SaleTicket s1 =new SaleTicket();
        SaleTicket s2 =new SaleTicket();
        SaleTicket s3 =new SaleTicket();
        s1.setName("w1");
        s2.setName("w2");
        s3.setName("w3");

        s1.start();
        s2.start();
        s3.start();
    }



}
