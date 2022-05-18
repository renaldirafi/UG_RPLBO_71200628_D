package com.ug11.instapost;

public class EmailException extends Exception{
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode){
        super();
        this.errorCode= errorCode;
        if(errorCode==1){
            this.errorMessage = "Login gagal! Email yang anda masukkan tidak valid.";
            System.out.println(errorMessage);
        }else if(errorCode==2){
            this.errorMessage="Login gagal! Email anda tidak terdaftar di Google.";
            System.out.println(errorMessage);
        }
    }
    public String getErrorMessage(){
        return errorMessage;
    }
}
