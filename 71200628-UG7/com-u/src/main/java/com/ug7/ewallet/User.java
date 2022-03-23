package com.ug7.ewallet;

public class User {
    private String nama;
    private String email;
    private boolean isEmailConfirmed = false;
    private String PIN;
    private int uang;

    public User(String nama, String email, int uang){
        this.nama = nama;
        this.email = email;
        this.uang = uang;
        this.PIN = generatePIN();
    }
    public String generatePIN(){
        this.PIN = this.nama.substring(0,3) + this.nama.substring(0,3) + "480";
        return this.PIN;
    }
    public String getNama(){
        return this.nama;
    }
    public int getUang(){
        return uang;
    }
    public String getEmail(){
        return this.email;
    }
    public void emailConfirmation() {
        this.isEmailConfirmed = true;
        System.out.println("Halo, " + this.getNama() + "! Email kamu (" + this.getEmail() + ") berhasil dikonfirmasi!");
    }
    public void withdraw(int jumlah){
        this.uang += jumlah;
    }
    public void topup(int jumlah){
        this.uang -=jumlah;
    }
    public boolean isEmailConfirmed() {
        return isEmailConfirmed;
    }
    public String getPIN(){
        return PIN;
    }
}
