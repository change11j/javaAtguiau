package com.atguigu05.method_more._04recursion;

/**
 * @author 尚硅谷-宋红康
 * @create 16:57
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest recursionTest=new RecursionTest();
        System.out.println(recursionTest.factorial(5));
        System.out.println(recursionTest.f(10));
    }

    /*
     * 举例2：计算n!
     * */
    public int factorial(int num){
        if(num==1){
            return 1;
        }else{
            return factorial(num-1)*num;
        }
    }
    /*
     * 举例5：斐波那契数列
     * 1  1  2    3   5   8   13  21  34  55  ...
     *
     * f(n) = f(n - 1) + f(n - 2)
     * */
    public int f(int num){
        if(num==1){
            return 1;
        }else if(num==2){
            return 1;
        }else {
            return f(num - 1) + f(num - 2);
        }
    }
    /*
     * 举例4：汉诺塔游戏
     * */

}
