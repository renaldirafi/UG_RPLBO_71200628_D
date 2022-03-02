package com.ug4.soal1;

public class Passenger{
    String name;
    double balance;
    String email;
    String destiny;

    public Passenger(String nama, String eml, String dty, Double bal){
        name= nama;
        balance = bal;
        email = eml;
        destiny=dty;
    }
    void setName(String nama){
        name = nama;
    }
    String getName(){
        return name;
    }
    void setBalance(double bal){
        balance = bal;
    }
    double getBalance(){
        return balance;
    }
    void setEmail(String eml){
        email = eml;
    }
    String getEmail(){
        return email;
    }
    void setDestiny(String dty){
        destiny = dty;
    }
    String getDestiny(){
        return destiny;
    }
}
