package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        class Mobil{
            String jenis;
            String mesin;

            public void jalan(){
                System.out.println("Mobil Jalan");
            }
            public void kurangiKecepatan(){
                System.out.println("Mobil Kurangi Kecepatan");
            }
            public void berhenti(){
                System.out.println("Mobil Berhenti");
            }
        }
        class PejalanKaki {
            String nama;

            public void menyebrang() {
                System.out.println("Pejalan Kaki Berjalan");
            }

            public void bersiap() {
                System.out.println("Pejalan kaki Bersiap");
            }

            public void menunggu() {
                System.out.println("Pejalan kaki menunggu");
            }
        }
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini:");
        int KodeLampu = inp.nextInt();
                if (KodeLampu == 1){
                    Mobil.jalan();
                    PejalanKaki.menunggu();
                }
                else if (KodeLampu == 2){
                    Mobil.kurangiKecepatan();
                    PejalanKaki.bersiap();
                }
                else if (KodeLampu ==3){
                    Mobil.berhenti();
                    PejalanKaki.menyebrang();
                }
    }

}
