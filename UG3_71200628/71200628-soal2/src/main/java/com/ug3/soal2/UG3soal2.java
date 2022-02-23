package com.ug3.soal2;
import java.util.Scanner;
public class UG3soal2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        boolean running = true;
        String input1;
        String input2;
        String out;
        int total1 = 0;
        int total2 = 0;

        while(running){
            System.out.println("Masukkan Input Pertama: ");
            input1 = inp.nextLine();
            System.out.println("Masukkan Input Kedua");
            input2 = inp.nextLine();
            System.out.println("Bilangan Fibonacci");
            total1 = input1.length();
            total2 = input2.length();
            for(int i=0; i<5; i++){
                System.out.print(total1+" ");
                total1 += total2;
                System.out.print(total2+" ");
                total2 += total1;
            }
            System.out.println(" ");
            System.out.println("Keluar dari program (ketik exit): ");
            out = inp.nextLine();
            if(out.equalsIgnoreCase("exit")){
                running = false;
            }
        }
    }
}
