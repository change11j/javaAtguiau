package com.atguigu03._extends.exer1;

/**
 * ClassName: ManKind
 * Package: com.atguigu03._extends.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/14/014 下午 04:53
 * @Version 1.0
 */
public class ManKind {
    int sex;
    int salary;

    void manOrWoman(int sex){
        this.sex=sex;
        if(this.sex==1){
            System.out.println("man");
        }else if(this.sex==0){
            System.out.println("woman");
        }
    }
    void employeed(int salary){
        this.salary=salary;
        if(this.salary==0){
            System.out.println("no job");
        }else if(this.salary!=0){
            System.out.println("job");
        }
    }

}
