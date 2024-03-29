package com.atguigu05.exer.exer3;

import org.junit.Test;

import javax.swing.text.html.CSS;

/**
 * ClassName: Exer3
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 05:12
 * @Version 1.0
 */
public class Exer3 {
    @Test
    public void method1(){
       Person person=new Person("King",-1);
    }
    @Test
    public void method2(){
        Person person=new Person();
        person.setLifeValue(1);
        person.setLifeValue(-1);
    }
}
