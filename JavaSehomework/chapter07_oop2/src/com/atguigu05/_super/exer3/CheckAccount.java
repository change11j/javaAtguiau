package com.atguigu05._super.exer3;

import javax.swing.plaf.basic.BasicLabelUI;

/**
 * ClassName: CheckAccount
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/19/019 下午 04:21
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overdraft;
    public CheckAccount(){
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(int amount) {
        if(amount<=getBalance()&&amount>0){
            super.withdraw(amount);
        }else if (amount>getBalance()&&amount>0){
            double overdraftAmount=amount-getBalance();
            if(overdraftAmount>overdraft){
                System.out.println("overdraft is insufficient");
                return;
            }
            balance=0;
            overdraft-=overdraftAmount;
        }

    }


}
