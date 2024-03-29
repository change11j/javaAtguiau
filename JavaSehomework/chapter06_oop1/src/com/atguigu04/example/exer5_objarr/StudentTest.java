package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: StudentTest
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 *  * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 *  * 问题一：打印出3年级(state值为3）的学生信息。
 *  * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *  * 提示：
 *  * 1) 生成随机数：Math.random()，返回值类型double;
 *  * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 *  * 年级[1,6] : (int)(Math.random() * 6 + 1)
 *  * 分数[0,100] : (int)(Math.random() * 101)
 * @Author 張彥瑋
 * @Create 2023/11/17/017 下午 01:16
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        student[] stu = new student[20];
        //创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new student();
            stu[i].number= i + 1 ;
            stu[i].state=(int)(Math.random() * 6 + 1);
            stu[i].score=(int)(Math.random() * 101);
        }
        // 问题一：打印出3年级(state值为3）的学生信息。
        for (int i = 0; i < stu.length; i++) {
            if(stu[i].state==3){
                System.out.println(stu[i].info());
            }
        }
        for (int i = 0; i <stu.length ; i++) {
            System.out.println(stu[i].info());
        }
        System.out.println();
        System.out.println("**********");
        System.out.println();
//        问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

        for (int i = 0; i <stu.length-1 ; i++) {
            for (int j = 0; j <stu.length-i -1; j++) {
                if (stu[j].score>stu[j+1].score ){
                    student temp = stu[j];
                    stu[j]=stu[j+1];
                    stu[j+1]=temp;

                }
            }
        }
        for (int i = 0; i <stu.length ; i++) {
            System.out.println(stu[i].info());
        }

    }
}
