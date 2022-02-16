package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int harga;
        int jumlah;
        int total=0;

        System.out.println("Masukkan Jumlah Barang:");
        jumlah =inp.nextInt();
        for (int i = 1; i <= jumlah; i++){
            System.out.println("Masukkan Harga barang "+ i);
            harga = inp.nextInt();
            total=total+harga;
        }
        System.out.println("Total Harga: "+total);
        if (total <=100000){
            System.out.println("Tidak ada diskon");
        }
        else if(total <=200000){
            System.out.println("Diskon 5%");
        }
        else if(total <= 400000){
            System.out.println("Diskon 10%");
        }
        else{
            System.out.println("Diskon 20%");
        }
    }
}
