package com.rplbo.utstokosedia;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("----------Selamat datang di Aplikasi Tokosedia----------");
        Produk p1 = new Produk("Amazfit GTR 2 Fitness",2000000);
        Produk p2 = new Produk("Xiaomi Mi Watch Lite",700000);
        Produk p3 = new Produk("Realme Watch 2 Pro",800000);
        Member adrian = new Member("Albertus Adrian","Jalan Gajah Mada");
        MemberPremium felix = new MemberPremium("Antonius Felix","Jalan Imogiri Barat");
        System.out.println("======Skenario 1: Top Up======");
        adrian.topUp(0);
        adrian.topUp(2500000);
        felix.topUp(-5000000);
        felix.topUp(5000000);
        System.out.println("-------------------------------------");
        adrian.cekSaldo();
        felix.cekSaldo();
        System.out.println("\n======Skenario 2: Pembelian======");
        Invoice inv = new Invoice();
        System.out.println("-----2.a Member biasa melakukan pembelian-----");
        inv.buatInvoice(p1,2,adrian);
        inv.printInvoice();
        adrian.bayar(inv.getTagihan());
        inv.buatInvoice(p1,1,adrian);
        inv.printInvoice();
        adrian.bayar(inv.getTagihan());
        System.out.println("-----2.b Member premium melakukan pembelian-----");
        inv.buatInvoice(p2,2,felix);
        inv.printInvoice();
        felix.bayar(inv.getTagihan());
        inv.buatInvoice(p3,1,felix);
        inv.printInvoice();
        felix.bayar(inv.getTagihan(),"TOKOSEDIA10");
        felix.bayar(inv.getTagihan(),"TOKOSEDIA25");
        System.out.println("======Skenario 3: Pengecekan saldo======");
        adrian.cekSaldo();
        felix.cekSaldo();
    }
}
