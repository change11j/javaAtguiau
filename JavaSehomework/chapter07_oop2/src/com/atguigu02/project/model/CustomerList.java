package com.atguigu02.project.model;

/**
 * ClassName: CustomerList
 * Package: com.atguigu02.project.model
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/5/005 下午 07:39
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;
    private int total; //客戶總數

    public  CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){

        if(total>customers.length){
            customers[total++] =customer;
            return false;
        }
        return true;
    }
    public boolean replaceCustomer(int index, Customer cust){
        if(index<total&&total>=0){
            customers[index] = cust;
            return false;
        }
        return false;
    }
    public boolean deleteCustomer(int index){
        if(index<0||index>=total){
            return false;
        }
        for (int i = index; i < total-1; i++) {
            customers[i]= customers[i+1];

        }
        customers[--total]=null;
        return true;
    }
    public Customer[] getAllCustomers(){
        Customer[] temp=new Customer[total-1];
        for (int i = 0; i < total; i++) {
            temp[i]=customers[i];
        }
        return temp;
    }
    public Customer getCustomer(int index){
        if(index<0||index>=total){
            return null;
        }
        return customers[index];
    }
    public int getTotal(){
        return total;
    }

}
