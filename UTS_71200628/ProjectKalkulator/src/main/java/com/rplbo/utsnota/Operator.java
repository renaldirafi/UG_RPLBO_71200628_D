package com.rplbo.utsnota;

import java.util.Locale;

public class Operator {
    private String operatorString;
    private String operatorSimbol;

    public Operator (String operatorhuruf){
        operatorhuruf= operatorhuruf.toLowerCase();
        this.operatorString =operatorhuruf;
    }

    public String getOperatorSimbol(){
        if(operatorString.equals("kali")){
            operatorSimbol = "*";
        }else if(operatorString.equals("bagi")){
            operatorSimbol = "/";
        }else if(operatorString.equals("tambah")){
            operatorSimbol ="+";
        }else if(operatorString.equals("kurang")){
            operatorSimbol ="-";
        }
        return operatorSimbol;
    }
}
