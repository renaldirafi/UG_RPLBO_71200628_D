package com.ug3.soal1;

import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String nama;
        String tanggal;
        float jumlah;
        float berat;

        System.out.println("=================== DATA PRODUCT ==============");
        System.out.println("Masukkan Data Product Makanan Anda");
        System.out.println("Nama makanan: ");
        nama = inp.nextLine();
        System.out.println("Tanggal kadaluarsa: ");
        tanggal = inp.nextLine();

        System.out.println("Jumlah (quantity): ");
        jumlah = inp.nextFloat();
        System.out.println("Berat (gram)");
        berat = inp.nextFloat();

        System.out.println("======== DATA PRODUCT ========");
        System.out.println("Nama makanan = "+nama);
        System.out.println("Tanggal kadaluarsa "+ tanggal);
        System.out.println("Jumlah(quantity) "+jumlah);
        System.out.println("berat(gram) "+berat+" gram");
        System.out.println("==============================");
    }
}
