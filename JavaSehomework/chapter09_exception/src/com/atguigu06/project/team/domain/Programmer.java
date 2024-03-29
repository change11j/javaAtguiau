package com.atguigu06.project.team.domain;

import com.atguigu06.project.team.service.Status;

/**
 * ClassName: Programmer
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 09:29
 * @Version 1.0
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
