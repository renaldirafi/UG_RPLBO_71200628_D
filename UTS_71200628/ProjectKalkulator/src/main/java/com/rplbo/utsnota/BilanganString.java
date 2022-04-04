package com.rplbo.utsnota;

import java.util.ArrayList;
import java.util.Locale;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilanganhuruf){
        bilanganhuruf=bilanganhuruf.toLowerCase();
        bilanganhuruf=bilanganhuruf.trim();
        this.bilanganstring = bilanganhuruf;
    }
    public int getBilangan(){
        if (bilanganstring.equals("satu")){bilangan=1;}
        else if(bilanganstring.equals("dua")){bilangan=2;}
        else if(bilanganstring.equals("tiga")){bilangan=3;}
        else if(bilanganstring.equals("empat")){bilangan=4;}
        else if(bilanganstring.equals("lima")){bilangan=5;}
        else if(bilanganstring.equals("enam")){bilangan=6;}
        else if(bilanganstring.equals("tujuh")){bilangan=7;}
        else if(bilanganstring.equals("delapan")){bilangan=8;}
        else if(bilanganstring.equals("sembilan")){bilangan=9;}
        else if(bilanganstring.equals("sepuluh")){bilangan=10;}
        else if(bilanganstring.equals("sebelas")){bilangan=11;}
        else if(bilanganstring.equals("dua belas")){bilangan=12;}
        else if(bilanganstring.equals("tiga belas")){bilangan=13;}
        else if(bilanganstring.equals("empat belas")){bilangan=14;}
        else if(bilanganstring.equals("lima belas")){bilangan=15;}
        else if(bilanganstring.equals("enam belas")){bilangan=16;}
        else if(bilanganstring.equals("tujuh belas")){bilangan=17;}
        else if(bilanganstring.equals("delapan belas")){bilangan=18;}
        else if(bilanganstring.equals("sembilan belas")){bilangan=19;}
        else if(bilanganstring.equals("dua puluh")){bilangan=20;}
        else{
            System.out.println("bilangan salaah");}
        return bilangan;
    }
    public boolean apakahDuaDigit(){
        if(bilangan<10){
            return false;
        }else{
            return true;
        }
    }
    public boolean apakahLebihDari10(){
        if(bilangan>10){
            return true;
        }else{
            return false;
        }
    }
}
