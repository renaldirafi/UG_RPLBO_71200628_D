package com.ug5a.soal1;

import java.security.Key;

public class TransPay {
    private String nama;
    private long saldo;

    public void setNama(String name){
        nama = name;
    }
    public void setSaldo(long saldo1){
        saldo = saldo1;
    }
    public String getNama(){
        return nama;
    }
    public long getSaldo(){
        return saldo;
    }
    public void topUp(long isi){
        if (isi>0){
            saldo += isi;
            System.out.println("Top up sebesar Rp "+isi+" berhasil");
        }else{
            System.out.println("Nominal anda tidak valid! Nominal harus lebih dari 0");
        }
    }
    public void bayar(int jumlah,Keyboard k){
        if (jumlah >0) {
            if (saldo>(jumlah*k.getHarga())){
                System.out.println("Pembayaran sukses! Silahkan mengambil " + k.getMerkModel() + " di counter");
                saldo = saldo - (jumlah*k.getHarga());
            }else{
                System.out.println("Pembayaran gagal! Saldo Anda Kurang, silahkan melakukan top up!");
            }
        }else{
            System.out.println("Input jumlah tidak valid!");
        }
    }
}
