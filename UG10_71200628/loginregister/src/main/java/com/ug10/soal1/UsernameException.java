package com.ug10.soal1;

public class UsernameException extends Exception{
    private int errCode;
    private String errMessage;
    public UsernameException(int errCode){
        super();
        this.errCode = errCode;
        if(errCode==1){
            this.errMessage="Maaf, Username tidak boleh kosong!";
        }else if(errCode==2){
            this.errMessage="Maaf, Username minimal harus terdiri dari 6 karakter!";
        }
    }
    public UsernameException(String errorMessage){
        super(errorMessage);
    }

    public String getErrMessage() {
        return errMessage;
    }
}

