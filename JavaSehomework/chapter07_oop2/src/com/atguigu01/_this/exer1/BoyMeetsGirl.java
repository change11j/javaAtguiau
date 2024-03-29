package com.atguigu01._this.exer1;

/**
 * ClassName: BoyMeetsGirl
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/4/004 下午 01:07
 * @Version 1.0
 */
public class BoyMeetsGirl {
    public static void main(String[] args) {
    Boy boy1 = new Boy("Jack",18);
    Girl girl1 = new Girl("Rose",18);
    girl1.marry(boy1);

    Girl girl2=new Girl("Net",30);

    }

}
