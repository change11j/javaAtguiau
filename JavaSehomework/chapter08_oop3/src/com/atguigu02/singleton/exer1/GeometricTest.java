package com.atguigu02.singleton.exer1;

/**
 * ClassName: GeometricTest
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型）。
 * @Author 張彥瑋
 * @Create 2023/12/24/024 下午 04:22
 * @Version 1.0
 */
public class GeometricTest {
    public boolean equalsArea(GeometricObject object1,GeometricObject object2){
        return object1.findArea()==object2.findArea();
    }
    public  void displayGeometricObject(GeometricObject object){
        System.out.println("Area is :"+object.findArea());
    }

    public static void main(String[] args) {
        GeometricTest geometricTest=new GeometricTest();
        Circle c1=new Circle("red",1.0,2);
        Circle c2=new Circle("black",1,3.3);
        geometricTest.displayGeometricObject(c1);
        geometricTest.displayGeometricObject(c2);

    }
}
