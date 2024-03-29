package com.atguigu05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 05:34
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -338751698612529948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
