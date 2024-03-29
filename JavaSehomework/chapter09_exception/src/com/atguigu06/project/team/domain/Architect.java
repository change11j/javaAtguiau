package com.atguigu06.project.team.domain;

/**
 * ClassName: Architect
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 09:30
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment,
                     double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
