package com.atguigu07._abstract.exer2;

/**
 * ClassName: SalariedEmployee
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/20/020 下午 05:13
 * @Version 1.0
 */
public class SalariedEmployee extends Employee{
    private int monthlySalary;

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee "+
                super.toString();
    }
}
