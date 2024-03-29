package com.atguigu12.wrapper.exer1;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: Score
 * Package: com.atguigu12.wrapper.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/31/031 上午 10:08
 * @Version 1.0
 */
public class Score {
    public static void main(String[] args) {
        Vector v =new Vector();
        Score scoreinput=new Score();
        scoreinput.input(v);

    }

    public void input(Vector v){
        int maxScore=0;
        while (true) {
            Scanner scan =new Scanner(System.in);
            System.out.println("please input score");
            int scoreint=scan.nextInt();

            if (scoreint<0){
                break;
            }
            v.addElement(scoreint);
            if (maxScore<scoreint){
                maxScore=scoreint;
            }
        }


        for (int i = 0; i < v.size(); i++) {
            int score=(Integer) v.elementAt(i);
            char grade;
            if(maxScore-score<=10){
                grade='A';
            }else if (maxScore<=30){
                grade='B';
            }else {
                grade='C';
            }
            System.out.println("Student"+i+"'s grade is "+grade);
        }
    }

}
