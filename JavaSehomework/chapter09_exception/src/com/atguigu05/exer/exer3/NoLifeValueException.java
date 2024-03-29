package com.atguigu05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 02:27
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{
    static final long serialVersionUID = -7034897456357669635L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
    public NoLifeValueException(String message, Throwable cause) {
        super(message, cause);
    }


    public NoLifeValueException(Throwable cause) {
        super(cause);
    }
    protected NoLifeValueException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
