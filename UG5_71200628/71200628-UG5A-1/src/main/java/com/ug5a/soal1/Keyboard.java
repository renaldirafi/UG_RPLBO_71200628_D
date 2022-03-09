package com.ug5a.soal1;

public class Keyboard {
    private String merkModel;
    private long harga;

    public void setMerkModel(String model){
        merkModel = model;
    }
    public void setHarga(long nilai){
        harga = nilai;
    }
    public String getMerkModel(){
        return merkModel;
    }
    public long getHarga(){
        return harga;
    }
}
