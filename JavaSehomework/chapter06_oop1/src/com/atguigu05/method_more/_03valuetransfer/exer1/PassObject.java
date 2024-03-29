package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *2. 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *      public void printAreas(Circle c, int time)。
 *
 * 3. 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *     例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * @Author 張彥瑋
 * @Create 2023/11/21/021 下午 01:10
 * @Version 1.0
 */
public class PassObject {
    public void printAreas(Circle c, int time){
        int i = 0;
        for (; i <=time ; i++) {
            if(i==0){
                System.out.println("Radius\t\t"+"Area");
            }else {
                c.radius=i;
                System.out.println(i+"\t\t\t"+c.findArea());
            }
        }
        c.radius=i;
    }

}
