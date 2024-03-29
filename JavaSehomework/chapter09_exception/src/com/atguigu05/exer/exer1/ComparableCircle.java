package com.atguigu05.exer.exer1;

/**
 * ClassName: ComparableCircle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/21/021 下午 04:31
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) throws Exception{
        if (this==o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c=(ComparableCircle)o;
//            if (this.getRadius()-c.getRadius()>0){
//                return 1;
//            }else if(this.getRadius()-c.getRadius()<0){
//                return -1;
//            }else {
//                return 0;
//            }
            return Double.compare(this.getRadius(),c.getRadius());
        }else {
            throw new Exception("input incorrectly ");
        }

    }


}
