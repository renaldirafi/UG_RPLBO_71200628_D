package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking (String nama, long saldo, String noRekening){
        super(nama,saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening(){return this.noRekening;}

    public void transfer(DigitalPayment dp, long nominal){
        if(nominal <= 0){
            System.out.println("Input Tidak Valid");
        }else if(super.saldo <= nominal){
            System.out.println("saldo tidak mencukupi");
        }else if(isCheckFee()==true){
            if(super.saldo > nominal+feeAntarBank){
                super.saldo -= nominal + feeAntarBank;
                dp.saldo += nominal;
                super.printBuktiTransfer(dp,nominal);
            }else{
                System.out.println("saldo tidak cukup");
            }
        }else if(isCheckFee()==false){
            super.saldo -= nominal;
            dp.saldo += nominal;
            super.printBuktiTransfer(dp,nominal);
        }
    }
    public boolean isCheckFee(){
        return checkFee;
    }
    public void setCheckFee(boolean b){
        this.checkFee = b;
    }
}
