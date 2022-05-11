package com.ug10.soal1;

public class EmailException extends Exception{
    private String errMessage;
    public EmailException() {
        super();
        this.errMessage="Maaf, email tidak valid!";
    }
    public EmailException(String errorMessage){
        super(errorMessage);
    }

    public String getErrMessage(){
        return this.errMessage;
    }
}
