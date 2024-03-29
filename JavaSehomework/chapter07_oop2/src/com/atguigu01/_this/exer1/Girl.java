package com.atguigu01._this.exer1;

/**
 * ClassName: Girl
 * Package: com.atguigu01._this.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/3/003 下午 01:04
 * @Version 1.0
 */
public class Girl {
    private String name;
    private int age;
    public Girl(){

    }

    public Girl(String name, int age) {
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
    public void marry(Boy boy){
        if(this.age>=18){
            System.out.println("I want marry"+boy.getName());
        }
        boy.marry(this);
    }
    public int compare(Girl girl){
        if(this.age> girl.age){
            return 1;
        }else if(this.age<girl.age){
            return -1;
        }else {
            return 0;
        }
    }
}
