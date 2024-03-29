package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/26/026 下午 12:05
 * @Version 1.0
 */
public class InstanceTest {
    /*
    在method中:
(1)根据e的类型调用相应类的getInfo()方法。
(2)根据e的类型执行：
如果e为Person类的对象，输出：
“a person”;
如果e为Student类的对象，输出：
“a student”
“a person ”
如果e为Graduate类的对象，输出：
“a graduated student”
“a student”
“a person”
     */
    public static void main(String[] args) {
        Person person=new Person();
        Student student=new Student();
        Graduate graduate=new Graduate();
        InstanceTest instanceTest=new InstanceTest();
        instanceTest.Method(person);
        instanceTest.Method(student);
        instanceTest.Method(graduate);

    }
    public void Method(Person e){
        System.out.println(e.getInfo());
       if(e instanceof Graduate){
           System.out.println("a graduated student");
       }
       if(e instanceof Student){
           System.out.println("a student");
       }
       if(e instanceof Person){
           System.out.println("a person");
       }
    }

}
