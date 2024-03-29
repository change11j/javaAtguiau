package com.atguigu07._abstract.exer2;

/**
 * ClassName: PayrollSystem
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 * 利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @Author 張彥瑋
 * @Create 2024/1/20/020 下午 08:36
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps =new Employee[2];
        emps[0]=new SalariedEmployee("Wei",1001,new MyDate(1990,6,5),
                30000);
        emps[1]=new HourlyEmployee("Chang",1002,
                new MyDate(1990,1,1),200,160);
    }
}
