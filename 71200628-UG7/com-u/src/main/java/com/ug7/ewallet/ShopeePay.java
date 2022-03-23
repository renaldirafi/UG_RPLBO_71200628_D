package com.ug7.ewallet;

public class ShopeePay extends eWallet {
    private int feeTopup = 500;
    private int feeTransfer = 0;
    private int feeWithdraw = 1000;

    public ShopeePay(User user){
        super(user);
    }
    public void topup(int jumlah){
        super.topup(jumlah + feeTopup);
        System.out.println("Halo, "+getUser().getNama()+"! Top up saldo sebesar Rp."+jumlah+" Berhasil");
    }
    public void transfer(eWallet eWallet, int jumlah){
        System.out.println("Transfer Saldo akan terkena potongan fee Rp0,00");
        if (getUser().isEmailConfirmed() == false){
            System.out.println("Halo, "+getUser().getNama()+" Silahkan konfirmasi email terlebih dahulu!");
        }else {
            super.transfer(eWallet, jumlah + feeTransfer);
        }
    }
    public void withdraw(int jumlah){
        System.out.println("Withdraw akan terkena potongan "+ feeWithdraw);
        super.withdraw(jumlah+feeWithdraw);
    }
    public void getInfo(){
        System.out.println("[ShopeePay e-Wallet]");
        super.getInfo();
    }
}
