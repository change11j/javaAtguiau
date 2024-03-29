package com.atguigu07._abstract.exer2;

/**
 * ClassName: HourlyEmployee
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/20/020 下午 07:43
 * @Version 1.0
 */
public class HourlyEmployee extends Employee{
    private int wage;
    private int hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int earnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee" +
                super.toString();
    }
}
