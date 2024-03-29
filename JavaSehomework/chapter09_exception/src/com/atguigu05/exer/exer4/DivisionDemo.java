package com.atguigu05.exer.exer4;

import java.lang.reflect.Method;
import java.util.DuplicateFormatFlagsException;

/**
 * ClassName: DivisionDemo
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 05:35
 * @Version 1.0
 */
public class DivisionDemo {
    public static double divide (int division,int equation)throws BelowZeroException{

        if(division<0||equation<0){
            throw new BelowZeroException("number below zero");
        }
        return division/equation;
    }

    public static void main(String[] args) {

        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            System.out.println(divide(m,n));
        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}

