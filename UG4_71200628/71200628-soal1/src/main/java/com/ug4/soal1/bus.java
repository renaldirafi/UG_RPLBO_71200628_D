package com.ug4.soal1;

import java.util.ArrayList;

public class Bus {
    String name;
    Driver driver;
    int CAPACITY;
    ArrayList passenger;
    int usedCapacity;
    double fares;
    double profit;
    String[] ROUTE;

    void setName(String nama){
        nama = name;
    }
    String getName(){
        return name;
    }
    void setDriver(Driver){
        setDriver();
    }

    Driver getDriver(){
        return driver;
    }
    int getCapacity(){
        return CAPACITY;
    }
    ArrayList<Passenger> getPassenger(){
        return Passenger;
    }
    int getUsedCapacity(){
        return usedCapacity;
    }
    void setUsedCapacity(int capa){
        usedCapacity=capa;
    }
    final double getFares(){
        return fares;
    }
    double getProfit(){
        return profit;
    }
    void setProfit(double profitt){
        profit = profitt;
    }
    String[] getRoute(){
        return ROUTE;
    }
    boolean checkPassengerBalance(Passenger){
        Passenger.getBalance();
    }
    void topUpBalance(double balance, Passenger){

    }
    void takePassenger(Passenger){
        Passenger.getName();
    }
    void dropPassenger(Passenger){
        Passenger.getName();
    }
    void proceedOrder(String order, Passenger){

    }
    String cancelOrder(Passenger){
        Passenger.getName()''
    }
}
