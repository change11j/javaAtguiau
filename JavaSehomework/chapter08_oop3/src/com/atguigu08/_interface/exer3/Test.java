package com.atguigu08._interface.exer3;

/**
 * ClassName: Test
 * Package: com.atguigu08._interface.exer3
 * Description:
 *创建Vehicle[]数组，保存阿里工程师的三辆交通工具，并分别在工程师的takingVehicle()中调用。
 * @Author 張彥瑋
 * @Create 2024/1/26/026 下午 02:16
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Bicycle("Giant","silver");
        vehicles[1]=new ElectricVehicle("IAF","red");
        vehicles[2]=new Car("Benz","black","1234");
        Developer developer=new Developer("Tom",30);
        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);
            if(vehicles[i]instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }
    }
}
