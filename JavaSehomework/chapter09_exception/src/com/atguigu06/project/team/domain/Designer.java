package com.atguigu06.project.team.domain;

/**
 * ClassName: Designer
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 09:30
 * @Version 1.0
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
