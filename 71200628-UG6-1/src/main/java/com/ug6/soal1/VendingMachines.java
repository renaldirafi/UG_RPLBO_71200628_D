package com.ug6.soal1;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;

    public VendingMachines(){}
    public VendingMachines(String code, int capacity){
        this.code = code;
        this.capacity = capacity;
    }
    public VendingMachines(String code, int capacity, Goods goods,double[] acceptanceBalance){
        this.code = code;
        this.capacity = capacity;
    }
    public void proceedOrder(String goodsCode, int orderQuantity){
        usedCapacity -= capacity;
    }

    public void takeMoney(double money){
        if (money <= consumerMoney){
            System.out.println("Sukses");
            giveGood(money,code);
            consumerMoney -= money
        }else{
            System.out.println("Uang tidak cukup");
        }
    }
    public void giveGood(double goodsPrice,String goodsName){
        System.out.println("Berhasil");
    }
    public double withdrawMoney(){
        return consumerMoney
    }
    public void inputGood(Goods goods){
        ArrayList<Goods> a= new ArrayList<Goods>();
    }

}
