package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp){
        super(nama,saldo);
        this.noHp = noHp;
    }
    public void transfer(DigitalPayment dp, long nominal) {
        if(nominal<= 0){
            System.out.println("Input Tidak Valid");
        }else if(super.saldo <= nominal){
            System.out.println("saldo tidak mencukupi");
        }else if(dp instanceof BNImo || dp instanceof BRImo){
            if (super.saldo > nominal+feeTransferBank){
                super.saldo -= nominal + feeTransferBank;
                dp.saldo += nominal;
                super.printBuktiTransfer(dp,nominal);
            }else{
                System.out.println("Saldo Tidak Cukup");
            }
        }else{
            super.saldo -= nominal;
            dp.saldo += nominal;
            super.printBuktiTransfer(dp,nominal);
        }
    }
    public String getNoHp(){
        return noHp;
    }
    public void setFeeTransferBank(long fee){
        this.feeTransferBank = fee;
    }
}
