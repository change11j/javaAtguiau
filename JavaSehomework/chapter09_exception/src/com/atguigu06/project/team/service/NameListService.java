package com.atguigu06.project.team.service;

import com.atguigu06.project.team.domain.*;

import static com.atguigu06.project.team.service.Data.*;

/**
 * ClassName: NameListService
 * Package: com.atguigu06.project.team.service
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/2/5/005 上午 11:02
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees=new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id= Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary=Integer.parseInt(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type){
                case EMPLOYEE:
                    employees[i]=new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment=createEquipment(i);
                    employees[i]=new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment=createEquipment(i);
                    bonus=Integer.parseInt(EMPLOYEES[i][5]);
                    employees[i]=new Designer(id,name,age,salary,equipment,bonus);
                case ARCHITECT:
                    equipment=createEquipment(i);
                    bonus=Integer.parseInt(EMPLOYEES[i][5]);
                    stock=Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i]=new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }
    public Employee[] getAllEmployees(){
        return employees;
    }
    private Equipment createEquipment(int index){
        int type = Integer.parseInt(EQIPMENTS[index][0]);
        switch (type){
            case PC :
                return new PC(EQIPMENTS[index][1],EQIPMENTS[index][2]);
            case NOTEBOOK:
                int price = Integer.parseInt(EQIPMENTS[index][2]);
                return new NoteBook(EQIPMENTS[index][1],price);
            case PRINTER:
                return new Printer(EQIPMENTS[index][1],EQIPMENTS[index][2]);
        }
        return null;
    }
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId()==id){
                return employees[i];
            }
        }
        throw new TeamException("couldn't find this member");
    }
}
