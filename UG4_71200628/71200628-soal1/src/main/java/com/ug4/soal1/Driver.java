package com.ug4.soal1;

public class Driver{
    String name;
    int age;
    String gender;

    public Driver(String nama, String gen, int umur){
        name = nama;
        age = umur;
        gender = gen;
    }

    void setName(String nama){
        name = nama;
    }
    String getName(){
        return name;
    }
    void setAge(int umur){
        age = umur;
    }
    int getAge(){
        return age;
    }
    void setGender(String gen){
        gender = gen;
    }
    String getGender(){
        return gender;
    }
}
