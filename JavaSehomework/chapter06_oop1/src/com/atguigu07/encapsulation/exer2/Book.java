package com.atguigu07.encapsulation.exer2;

import com.atguigu05.method_more._04recursion.exer2.Stairs;

/**
 * ClassName: Book
 * Package: com.atguigu07.encapsulation.exer2
 * Description:
 *设定属性包括：
 * 书名bookName，
 * 作者author，
 * 价格price；
 *
 * 方法包括：
 * 相应属性的get/set方法，
 * 图书信息介绍等。
 * @Author 張彥瑋
 * @Create 2023/11/27/027 下午 09:52
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private int price;

    public void setBookName(String bookName1){
        bookName=bookName1;
    }
    public String getBookName(){
        return bookName;
    }
    public void setAuthor(String author1){
        author=author1;
    }
    public String getAuthor(){
        return author;
    }
    public void setPrice(int price1){
        if (price1>=0){
            price=price1;
        }else {
            System.out.println("invalid");
        }
    }
    public int getPrice(){
        return price;
    }
    public void showInfo(){
        System.out.println("bookName:"+bookName+"author:"+author+"price:"+price);
    }
}
