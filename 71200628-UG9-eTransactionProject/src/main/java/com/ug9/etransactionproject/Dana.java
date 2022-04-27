package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    private long danaFeeTransferBank = 1000;

    public Dana(String nama,long saldo,String noHp){
        super(nama,saldo,noHp);
    }
    public void transfer(DigitalPayment dp,long nominal){
        if(dp instanceof Ovo){
            System.out.println("Akun tidak benar");
        }else{
            super.setFeeTransferBank(danaFeeTransferBank);
            super.transfer(dp,nominal);
        }
    }
}
