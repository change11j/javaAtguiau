package com.atguigu07.encapsulation.exer3;

/**
 * ClassName: Employee
 * Package: com.atguigu07.encapsulation.exer3
 * Description:
 *（1）声明员工类Employee，
 * - 包含属性：姓名、性别、年龄、电话，属性私有化
 * - 提供get/set方法
 * - 提供String getInfo()方法
 *
 * （2）在测试类的main中创建员工数组，并从键盘输入员工对象信息，最后遍历输出
 * @Author 張彥瑋
 * @Create 2023/11/28/028 上午 12:11
 * @Version 1.0
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char g){
        gender=g;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String pn){
        phoneNumber=pn;
    }
    public String getInfo(){
        return "姓名 : "+name+"\n性別 : "+gender+"\n年齡 : "+age+"\n電話 : "+phoneNumber;
    }
}
