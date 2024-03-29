package com.atguigu05.exer.exer3;

/**
 * ClassName: Person
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/4/004 下午 03:25
 * @Version 1.0
 */
public class Person {
    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue<0){
            throw new NoLifeValueException("life value can't be below 0");
        }
        this.lifeValue = lifeValue;
    }
}
