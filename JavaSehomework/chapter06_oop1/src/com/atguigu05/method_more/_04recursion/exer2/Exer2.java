package com.atguigu05.method_more._04recursion.exer2;

/**
 * ClassName: Exer2
 * Package: com.atguigu05.method_more._04recursion.exer2
 * Description:
 *假设一对刚出生的小兔一个月后就能长成大兔，
 * 再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
 * 问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
 * @Author 張彥瑋
 * @Create 2023/11/25/025 下午 01:45
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        Exer2 exer2=new Exer2();
        System.out.println(exer2.rabbit(24));
    }
    public int rabbit(int mons){
        if(mons==1){
            return 1;
            
        }else if(mons==2){
            return 1;
        }else {
            return rabbit(mons-1)+rabbit(mons-2);
        }
    }
}
