package com.ug10.soal1;

public class LoginException extends Exception{
    private String errMessage;
    public LoginException(){
        super("Maaf, username atau password salah!, silahkan coba lagi");
    }

    public String getErrMessage(){
        return this.errMessage;
    }
}
