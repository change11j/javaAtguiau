package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: StudentUtil
 * Package: com.atguigu04.example.exer5_objarr1
 * Description:
 *1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * 年级[1,6] : (int)(Math.random() * 6 + 1)
 * 分数[0,100] : (int)(Math.random() * 101)
 * @Author 張彥瑋
 * @Create 2023/11/19/019 下午 06:35
 * @Version 1.0
 */
public class StudentUtil {
    /**
     *print 出指定年級的所有學生
     * @param students 指定的全體學生array
     * @param state 指定年級
     */
    public void print(Student[] students, int state){
        for (int i = 0; i < students.length; i++) {
            if(state==students[i].state){
                System.out.println(students[i].info());
            }
        }
    }

    /**
     * 排序指定的學生array
     * @param students 指定的學生array
     */
    public  void sort(Student[] students){
        for (int i = 0; i <students.length-1; i++) {
            for (int j = 0; j <students.length-1-i ; j++) {
                if(students[j].score>students[j+1].score){
                    Student temp = students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }
        }
    }

    /**
     * print出指定學生數組的全體學生
     * @param students 指定的學生數組
     */
    public void printAll(Student[] students){
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i].info());

        }
    }

}
