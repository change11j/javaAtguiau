package com.atguigu01.throwable;

/**
 * @author 尚硅谷-宋红康
 * @create 10:12
 */
public class ErrorTest {
    public static final int SP=1;
    public static final int SU=2;
    public static final int FA=3;
    public static final int WI=4;
    public static void main(String[] args) {
        int type = 1;
        switch (type){
            case SP :
                System.out.println("sp");
                break;
            case SU:
                System.out.println("SU");
                break;
            case FA:
                System.out.println("FA");
                break;
            case WI:
                System.out.println("WI");
                break;

        }



    }
}
