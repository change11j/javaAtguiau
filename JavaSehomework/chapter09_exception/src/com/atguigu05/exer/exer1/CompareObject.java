package com.atguigu05.exer.exer1;

/**
 * ClassName: CompareObject
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/21/021 下午 04:29
 * @Version 1.0
 */
public interface CompareObject {
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o) throws Exception;
}
