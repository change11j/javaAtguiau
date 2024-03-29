package com.atguigu07.object.equals.exer2;

/**
 * ClassName: MyDate
 * Package: com.atguigu07.object.equals.exer2
 * Description:
 *MyDate m1 = new MyDate(14, 3, 1976);
 * @Author 張彥瑋
 * @Create 2023/12/31/031 下午 10:49
 * @Version 1.0
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof MyDate){
            return this.day==((MyDate) obj).day&&this.month==((MyDate) obj).month&&
                    this.year==((MyDate) obj).year;
        }
        return false;
    }
}
