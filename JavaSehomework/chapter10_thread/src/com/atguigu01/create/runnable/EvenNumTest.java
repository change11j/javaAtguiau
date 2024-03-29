package com.atguigu01.create.runnable;

/**
 * ClassName: EvenNumTest
 * Package: com.atguigu01.create.runnable
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/12/012 下午 04:49
 * @Version 1.0
 */
public class EvenNumTest {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName()+" : " +
                            i);
                }
            }
        }).start();
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " +
                    i);
        }
    }
}
