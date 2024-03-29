package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: Args
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *练习：可变形参的方法
 *
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 * @Author 張彥瑋
 * @Create 2023/11/20/020 下午 12:57
 * @Version 1.0
 */
public class Args {
    public static void main(String[] args) {
        Args args1= new Args();
        String strs=args1.feedback("/","score","state");
        System.out.println(strs);
        Args args2= new Args();
        String strs1= args2.feedback("");
        System.out.println(strs1);

    }
    public String feedback(String operator,String ... strs){
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i==0){
                result += strs[i];
            }else {
                result+=operator+strs[i];
            }
        }
        return result;

    }

}
