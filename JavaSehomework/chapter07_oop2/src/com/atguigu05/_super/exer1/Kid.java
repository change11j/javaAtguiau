package com.atguigu05._super.exer1;

/**
 * ClassName: Kid
 * Package: com.atguigu04.override.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/17/017 下午 12:59
 * @Version 1.0
 */
public class Kid extends Mankind {
    int yearsOld;

    public Kid() {
    }

    public Kid(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    public void printAge(){
        System.out.println(yearsOld);
    }

    @Override
    public void employeed() {
        super.employeed();
        System.out.println("kid should study");
    }
}
