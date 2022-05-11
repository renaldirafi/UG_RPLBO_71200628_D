package com.ug10.soal1;

public class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password){
        this.username=username;
        this.email = email;
        this.password = password;
        System.out.println("akun kamu berhasil didaftarkan!");
        System.out.println("Silahkan login untuk melanjutkan");
    }

    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
}
