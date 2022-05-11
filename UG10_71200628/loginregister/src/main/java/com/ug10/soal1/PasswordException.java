package com.ug10.soal1;

public class PasswordException extends Exception{
    private int errCode;
    private String errMessage;
    public PasswordException(int errCode){
        super();
        this.errCode = errCode;
        if(errCode==1){
            this.errMessage="Maaf, Password tidak boleh kosong!";
        }else if(errCode==2){
            this.errMessage="Maaf, password minimal 7 karakter!";
        }else if(errCode==3){
            this.errMessage="Maaf, password tidak boleh sama dengan username!";
        }else if(errCode==4){
            this.errMessage="Maaf, password harus mengandung huruf besar, huruf kecil, simbol, dan angka!";
        }else if(errCode==5){
            this.errMessage="Maaf, password tidak sama";
        }
    }
    public PasswordException(String errorMessage){
        super(errorMessage);
    }

    public String getErrMessage(){
        return this.errMessage;
    }
}

