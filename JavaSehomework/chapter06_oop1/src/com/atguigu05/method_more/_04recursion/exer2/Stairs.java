package com.atguigu05.method_more._04recursion.exer2;

/**
 * ClassName: Stairs
 * Package: com.atguigu05.method_more._04recursion.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/26/026 上午 11:35
 * @Version 1.0
 */
public class Stairs {
    public static void main(String[] args) {
        Stairs stairs=new Stairs();
        System.out.println(stairs.methods(10));
    }
    public int methods(int stairs){
        if(stairs==1){
            return 1;
        }else if(stairs==2){
            return 2;
        }else {
            return methods(stairs-1)+methods(stairs-2);
        }

    }
}
