package com.ug7.ewallet;

import java.util.Scanner;

public class GoPay extends eWallet{
    private int feeTopup = 1000;
    private int feeTransfer = 500;
    private int feeWithdraw = 2500;

    public GoPay(User user){
        super(user);
    }
    public void topup(int jumlah){
        if (jumlah>10000) {
            super.topup(jumlah + feeTopup);
        }else{
            System.out.println("minimal topup Rp10.000");
        }
    }
    public void transfer(eWallet eWallet,int jumlah){
        System.out.println("Masukkan PIN: ");
        Scanner inp = new Scanner(System.in);
        System.out.println("Transfer Saldo akan terkena potongan fee Rp500");
        super.transfer(eWallet,jumlah+feeTransfer);
    }
    public void withdraw(int jumlah){
        System.out.println("Withdraw akan terkena potongan Rp."+ feeWithdraw);
        super.withdraw(jumlah+feeWithdraw);
    }
    public void getInfo(){
        System.out.println("[GoPay e-Wallet]");
        super.getInfo();
    }
}
