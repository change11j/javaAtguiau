package com.atguigu02.project.model;


import com.sun.source.tree.CaseTree;

/**
 * ClassName: CustomerView
 * Package: com.atguigu02.project.model
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/6/006 上午 11:35
 * @Version 1.0
 */
public class CustomerView {
    private CustomerList customerList=new CustomerList(10);
    public void enterMainMenu(){
        boolean isflag=true;
        while (isflag){
            System.out.println("---------------------------CRM--------------------------\n");
            System.out.println("         1.Add Customer");
            System.out.println("         2.Modify ");
            System.out.println("         3.Delete");
            System.out.println("         4.Customer List");
            System.out.println("         5.Exit\n");
            System.out.print("         Please Chose(1-5) :");

            char key=CMUtility.readMenuSelection();

            switch(key){
                case '1':
                    addNewCustomer();
                    break;
                case'2':
                    modifyCustomer();
                    break;
                case'3':
                    deleteCustomer();
                    break;
                case'4':
                    listAllCustomer();
                    break;
                case'5':
                    isflag=false;
                    break;
            }
        }
    }
    private void addNewCustomer(){

        System.out.println("\n--------------------Add New Customer---------------");
        System.out.print("Name  : ");
        String name =CMUtility.readString(30);
        System.out.print("Gender(m/f): ");
        char gender = CMUtility.readChar();
        System.out.print("Age   : ");
        int age = CMUtility.readInt();
        System.out.print("Phone Number :");
        String phoneNum = CMUtility.readString(10);
        System.out.print("Email : ");
        String email = CMUtility.readString(500);
        customerList.addCustomer(new Customer(name,gender,age,phoneNum,email));



        System.out.println("---------------------------Completed-----------------------------\n\n");

    }
    private void modifyCustomer(){

        while (true){
            System.out.println("--------------------------Modify Customer-----------------------\n");
            System.out.print("Please select the index of customer(input -1 to exit) : ");
            int selection=CMUtility.readInt();
            if (selection>customerList.getTotal()+1||selection<-1||selection==0){
                System.out.println("invalid input,please select again");
                continue;
            }else if(selection==-1) {
                break;
            }
            Customer cust=customerList.getCustomer(selection-1);
            System.out.print("Name("+cust.getName()+") :");
            String name =CMUtility.readString(20,cust.getName());
            System.out.print("Gender(m/f)("+cust.getGender()+") : ");
            char gender = CMUtility.readChar(cust.getGender());
            System.out.print("Age("+cust.getAge()+") : ");
            int age = CMUtility.readInt(cust.getAge());
            System.out.print("Phone Number ("+cust.getPhone()+") : ");
            String phoneNum = CMUtility.readString(10,cust.getPhone());
            System.out.print("Email ("+cust.getEmail()+"): ");
            String email = CMUtility.readString(500,cust.getEmail());

            Customer replace=new Customer(name,gender,age,phoneNum,email);
            customerList.replaceCustomer(selection-1,replace);
            System.out.println("-------------------------done---------------");
            break;
        }



    }
    private void deleteCustomer(){
        System.out.println("------------------------Delete Customer------------------");
        System.out.print("Please input index of customer(input -1 to exit");
        int index = CMUtility.readInt();
        System.out.println("Please confirm deletion(Y/N)");
        char confirmation=CMUtility.readConfirmSelection();
        if (confirmation=='Y'){
            customerList.deleteCustomer(index-1);
        }
    }
    private void listAllCustomer(){
        System.out.println("---------------------------Customer list-------------------");
        System.out.println("Index\tName\tGender\tAge\tPhone Number\tEmail");

        for (int i = 0; i <customerList.getTotal(); i++) {
            System.out.print((i+1)+"\t");
            System.out.print(customerList.getCustomer(i).getName()+"\t");
            System.out.print(customerList.getCustomer(i).getGender()+"\t");
            System.out.print(customerList.getCustomer(i).getAge()+"\t");
            System.out.print(customerList.getCustomer(i).getPhone()+"\t");
            System.out.println(customerList.getCustomer(i).getEmail()+"\t");

        }
        System.out.println("----------------------done---------------");
    }

    public static void main(String[] args) {
        CustomerView customerview=new CustomerView();
        customerview.enterMainMenu();
    }
}
