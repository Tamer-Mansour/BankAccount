package com.example.bankaccount;

import java.util.Random;

public class BankAccount {

    private String AccNum;
    private double CheckBal;
    private double SavBal;
    private BankAccount [] acc ;
    private int size = 0;
    private double TOTAL_AMOUNT_OF_MONEY = 0;
    private static int ACCOUNT_COUNT;
    public BankAccount(String acc_num , double check_bal , double save_bal ){
        AccNum = acc_num;
        CheckBal = check_bal;
        SavBal = save_bal;
        acc = new BankAccount[size];
        ACCOUNT_COUNT++;
    }

    private void addAcc( double check_bal , double save_bal){
        Resize(acc);
        acc[size-1] = new BankAccount(Rand(),check_bal,save_bal);
        acc[size-1].setTOTAL_AMOUNT_OF_MONEY(check_bal+save_bal);

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
    public void setTOTAL_AMOUNT_OF_MONEY(double TOTAL_AMOUNT_OF_MONEY){
        this.TOTAL_AMOUNT_OF_MONEY = TOTAL_AMOUNT_OF_MONEY;
    }
    public double getTOTAL_AMOUNT_OF_MONEY(){
        return TOTAL_AMOUNT_OF_MONEY;
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
        setTOTAL_AMOUNT_OF_MONEY(getTOTAL_AMOUNT_OF_MONEY()+money);
    }
    public void Savdeposit(double money){
        setSavBal(getSavBal()+ money);
        setTOTAL_AMOUNT_OF_MONEY(getTOTAL_AMOUNT_OF_MONEY()+money);
    }
    public void CheckWithDaw(double money){
        if(getTOTAL_AMOUNT_OF_MONEY() < money && getCheckBal() < money){
        }
        else{
            setCheckBal(getCheckBal()- money);
            setTOTAL_AMOUNT_OF_MONEY(getTOTAL_AMOUNT_OF_MONEY()-money);
        }
    }
    public void SavWithDaw(double money){
        if(getTOTAL_AMOUNT_OF_MONEY() < money && getSavBal() < money){
        }
        else{
            setSavBal(getSavBal()- money);
            setTOTAL_AMOUNT_OF_MONEY(getTOTAL_AMOUNT_OF_MONEY()- money);
        }
    }

}
