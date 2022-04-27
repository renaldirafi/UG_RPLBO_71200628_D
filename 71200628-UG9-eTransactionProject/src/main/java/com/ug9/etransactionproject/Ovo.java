package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
    private long ovoFeeTransferBank = 2000;

    public Ovo(String nama, long saldo, String noHp){
        super(nama,saldo,noHp);
    }
    public void transfer(DigitalPayment dp, long nominal){
        if(dp instanceof Dana){
            System.out.println("Akun tidak benar");
        }else{
            super.setFeeTransferBank(ovoFeeTransferBank);
            super.transfer(dp,nominal);
        }
    }
}
