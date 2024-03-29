package com.atguigu02.method_lifecycle.exer;

import java.awt.desktop.ScreenSleepEvent;
import java.awt.print.Printable;

/**
 * ClassName: CountDown
 * Package: com.atguigu02.method_lifecycle.exer
 * Description:
 *模拟新年倒计时，每隔1秒输出一个数字，依次输出10,9,8......1，最后输出：新年快乐！
 * @Author 張彥瑋
 * @Create 2024/3/28/028 下午 11:56
 * @Version 1.0
 */
public class CountDown implements Runnable {
    @Override
    public void run() {
        int countDown=10;
        for (int i = countDown; i >= 0; i--) {
            if(i==0){
                System.out.println("Happt new year");
                return;
            }
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        CountDown countDown = new  CountDown();
        countDown.run();
    }
}



