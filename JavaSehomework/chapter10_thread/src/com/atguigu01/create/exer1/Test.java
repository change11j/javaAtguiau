package com.atguigu01.create.exer1;

import com.sun.tools.javac.Main;

/**
 * ClassName: Test
 * Package: com.atguigu01.create.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/10/010 下午 04:15
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        OddNumberThread oddNumberThread=new OddNumberThread();
//        EvenNumberThread evenNumberThread=new EvenNumberThread();
//        oddNumberThread.start();
//        evenNumberThread.start();
//        new Thread(){
//            public void run() {
//                for (int i = 1; i <= 100; i++) {
//                    if (i%2!=0){
//                        System.out.println(Thread.currentThread().getName()+" : "+i);
//                    }
//                }
//            }
//        }.start();
//        new Thread(){
//            public void run() {
//                for (int i = 1; i <= 100; i++) {
//                    if (i % 2 == 0) {
//                        System.out.println(Thread.currentThread().getName()+" : "+i);
//                    }
//                }
//            }
//        }.start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName()+" : "
                        +i);
                    }
                }
            }
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i%2!=0){
                        System.out.println(Thread.currentThread().getName()+" : "
                                +i);
                    }
                }
            }
        }).start();
    }

}
class OddNumberThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }
    }
}
class EvenNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }
        }
    }
}


