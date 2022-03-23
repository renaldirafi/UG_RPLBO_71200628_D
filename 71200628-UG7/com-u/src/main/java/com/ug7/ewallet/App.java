package com.ug7.ewallet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        User U_71190480 = new User("Bantolo Setiadi", "bantolo.setiadi@ti.ukdw.ac.id",50000);
        User U_GantiPakeNimKamu = new User("Nama Kamu", "Email Kamu", 30000);

        ShopeePay E_71190480 = new ShopeePay(U_71190480);
        GoPay E_GantiPakeNimKamu = new GoPay(U_GantiPakeNimKamu);

        System.out.println("\n========== AWAL ==========");
        E_71190480.getInfo();
        E_GantiPakeNimKamu.getInfo();

        System.out.println("\n========== TOP UP #1 ==========");
        System.out.print("["+E_GantiPakeNimKamu.getUser().getNama()+"] - ");
        E_GantiPakeNimKamu.topup(10000);

        System.out.println("\n========== TOP UP #2 ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.topup(5000);

        System.out.println("\n========== TOP UP #3 ==========");
        System.out.print("["+E_GantiPakeNimKamu.getUser().getNama()+"] - ");
        E_GantiPakeNimKamu.topup(50000);
        System.out.print("["+E_GantiPakeNimKamu.getUser().getNama()+"] - ");
        E_GantiPakeNimKamu.topup(9000);

        System.out.println("\n========== TRANSFER #1 ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.transfer(E_GantiPakeNimKamu, 2500);

        System.out.println("\n========== KONFIRMASI EMAIL ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.getUser().emailConfirmation();

        System.out.println("\n========== TRANSFER #2 ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.transfer(E_GantiPakeNimKamu, 2500);

        System.out.println("\n========== TRANSER #3 ==========");
        System.out.print("["+E_GantiPakeNimKamu.getUser().getNama()+"] - ");
        E_GantiPakeNimKamu.transfer(E_71190480, 9500);

        System.out.println("\n========== WITHDRAW #1 ==========");
        System.out.print("["+E_71190480.getUser().getNama()+"] - ");
        E_71190480.withdraw(11000);
        System.out.print("["+E_GantiPakeNimKamu.getUser().getNama()+"] - ");
        E_GantiPakeNimKamu.withdraw(1100);

        System.out.println("\n========== AKHIR ==========");
        E_71190480.getInfo();
        E_GantiPakeNimKamu.getInfo();
    }
}
