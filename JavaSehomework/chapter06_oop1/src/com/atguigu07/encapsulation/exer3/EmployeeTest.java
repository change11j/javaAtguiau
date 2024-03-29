package com.atguigu07.encapsulation.exer3;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu07.encapsulation.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/28/028 上午 12:26
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Employee[] employees=new Employee[2];
        for (int i = 0; i < employees.length; i++) {
            employees[i]=new Employee();
            System.out.println("---------------輸入第"+(i+1)+"個員工------------\n\n");
            System.out.print("姓名 : ");
            String name=scanner.next();
            System.out.print("性別 : ");
            char gender=scanner.next().charAt(0);
            System.out.print("年齡 : ");
            int age=scanner.nextInt();
            System.out.print("電話 : ");
            String phoneNumber = scanner.next();

            employees[i].setName(name);
            employees[i].setGender(gender);
            employees[i].setAge(age);
            employees[i].setPhoneNumber(phoneNumber);

        }

        System.out.println("---------------------員工列表-------------------------");
        System.out.println("編號\t姓名\t性別\t年齡\t電話");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i+1+"\t"+employees[i].getInfo());
        }
        System.out.println("---------------------員工列表完成-------------------------");

    }
}
