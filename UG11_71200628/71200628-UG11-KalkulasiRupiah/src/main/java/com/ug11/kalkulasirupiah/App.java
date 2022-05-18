package com.ug11.kalkulasirupiah;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Teks: ");
        String teks = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(String isi : teks.split(" ")){
            if(isi.contains("Rp")){
                String ganti =isi.replace("Rp","");
                ganti = ganti.replace(".","");
                ganti = ganti.replace(",00","");
                sb.append(ganti+" ");
            }
        }
        String str =sb.toString();
        String[] isii = str.split(" ");
        System.out.println("Rincian Biaya: Rp"+isii[0]+",00 + Rp"+isii[1]+",00");
        for(int i =0; i<isii.length;i++){
            int num = Integer.parseInt(isii[i]);
            total +=num;
        }
        System.out.println("Total: "+total);
    }
}
