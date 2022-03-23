package com.ug7.ewallet;

import java.util.concurrent.TimeUnit;

public class eWallet {
    private User user;
    private int saldo;

    public int getsaldo(){
        return saldo;
    }
    public User getUser(){
        return user;
    }
    public eWallet(User user){
        this.user = user;
    }
    public void topup(int jumlah){
        if(jumlah< user.getUang()){
            System.out.println("Halo, " + getUser().getNama() + "! Top up saldo sebesar Rp." + jumlah + " Berhasil");
            user.topup(jumlah);
            this.saldo +=jumlah;
        }else{
            System.out.println(("Maaf, uang cash kamu tidak mencukupi ")); ;
        }
    }
    public void transfer(eWallet eWallet,int jumlah){
            if(saldo>jumlah){
                System.out.println("Transfer sedang diproses");
                System.out.println("Transfer saldo sejumlah Rp"+jumlah+",00 ke akun "+eWallet.getUser().getNama()+" Berhasil!");
                this.saldo -= jumlah;
                eWallet.saldo +=jumlah;
            }else{
                System.out.println("Saldo tidak cukup");
            }
    }
    public void withdraw(int jumlah){
        if(jumlah < saldo){
            saldo -= jumlah;
            user.withdraw(jumlah);
        }else{
            System.out.println("Maaf saldo kamu tidak mencukupi!");
        }
    }
    public void getInfo(){
        System.out.println("Nama: "+user.getNama()+"["+user.getPIN()+"]");
        System.out.println("Email: "+user.getEmail());
        System.out.println("Uang cash: "+user.getUang());
        System.out.println("Saldo e-wallet: "+getsaldo());
    }
}
