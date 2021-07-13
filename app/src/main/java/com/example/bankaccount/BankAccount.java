package com.example.bankaccount;

import java.util.Random;

public class BankAccount {

    private String AccNum;
    private double CheckBal;
    private double SavBal;
    private BankAccount [] acc ;
    private int size = 0;
    private double Total = 0;
    public BankAccount(String acc_num , double check_bal , double save_bal ){
        AccNum = acc_num;
        CheckBal = check_bal;
        SavBal = save_bal;
        acc = new BankAccount[size];
    }

    private void addAcc( double check_bal , double save_bal){
        Resize(acc);
        acc[size-1] = new BankAccount(Rand(),check_bal,save_bal);
        acc[size-1].setTotal(check_bal+save_bal);

    }
    public void Resize(BankAccount [] acc){
        size++;
        BankAccount [] accs = new BankAccount [size];
        for(int i = 0 ; i<acc.length ;i++){
            accs[i] = acc[i];
        }
        acc = accs;
    }
    public String Rand() {
        int m = (int) Math.pow(10, 9);
        return Integer.toString( m + new Random().nextInt(9 * m));
    }
    public void setTotal(double total){
        Total = total;
    }
    public double getTotal(){
        return Total;
    }

    public void setCheckBal(double check){
        CheckBal = check;
    }
    public double getCheckBal(){
        return CheckBal;
    }
    public void setSavBal(double sav){
        SavBal = sav;
    }
    public double getSavBal(){
        return SavBal;
    }
    public void Checkdeposit(double money){
        setCheckBal(getCheckBal()+ money);
        setTotal(getTotal()+money);
    }
    public void Savdeposit(double money){
        setSavBal(getSavBal()+ money);
        setTotal(getTotal()+money);
    }
    public void CheckWithDaw(double money){
        if(getTotal() < money && getCheckBal() < money){
            System.out.println("you don't have enough money");
        }
        else{
            setCheckBal(getCheckBal()- money);
            setTotal(getTotal()-money);
        }
    }
    public void SavWithDaw(double money){
        if(getTotal() < money && getSavBal() < money){
            System.out.println("you don't have enough money");
        }
        else{
            setSavBal(getSavBal()- money);
            setTotal(getTotal()- money);
        }
    }

}
