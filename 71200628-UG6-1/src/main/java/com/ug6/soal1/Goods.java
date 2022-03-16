package com.ug6.soal1;

public class Goods {
    public String code;
    public String name;
    public int quantity;
    public double price;

    public Goods(){}

    public Goods(String code, String name){
        this.code = code;
        this.name = name;
    }
    public Goods(String code, String name, int quantity, double price){
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price=price;
    }
}
