package com.atguigu01._this.exer1;

/**
 * ClassName: Boy
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/3/003 下午 01:01
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boy() {
    }
    public void marry(Girl girl){
        System.out.println("I want Marry : "+girl.getName());
    }
    public void shout(){
        if(this.age>18){
            System.out.println("我可以結婚了");
        }else {
            System.out.println("繼續約炮ㄅ");
        }
    }
}
