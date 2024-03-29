package com.atguigu04.override.exer1;

import com.atguigu03._extends.exer1.ManKind;

/**
 * ClassName: Mankind
 * Package: com.atguigu04.override.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/17/017 下午 12:59
 * @Version 1.0
 */
public class Mankind {
    private int sex;
    private int salary;

    public Mankind() {
    }

    public Mankind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void manOrWoman(){
        if(sex==1){
            System.out.println("man");
        }else if(sex==0){
            System.out.println("woman");
        }
    }
    public void employeed(){
        if(salary==0){
            System.out.println("no job");
        }else if(salary!=0){
            System.out.println("job");
        }
    }
}
