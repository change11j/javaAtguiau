package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Exer4
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/29/029 下午 05:53
 * @Version 1.0
 */
public class Exer4 {
    /*
    在该方法中，每一个人先吃饭，然后上洗手间，然后如果是男人，随后抽根烟；如果是女人，随后化个妆
     */
    public static void meeting(Person ... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man){
                ((Man)ps[i]).smoke();
            }
            if (ps[i] instanceof Woman){
                ((Woman) ps[i]).makeup();
            }
            System.out.println();
        }
    }
    /*
    （2）public static void main(String[] args)
        在主方法中，创建多个男人和女人对象，并调用meeting()方法进行测试
     */
    public static void main(String[] args) {
        meeting(new Man(),new Person(),new Woman());
    }
}
