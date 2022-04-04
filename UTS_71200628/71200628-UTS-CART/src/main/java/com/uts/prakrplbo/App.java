package com.uts.prakrplbo;

import java.text.NumberFormat;
import java.util.Locale;
public class App {
    public static void main(String[] args) {
        Keranjang keranjangKu = new Keranjang();
        Mangga manggaKu = new Mangga();
        Apel apelKu = new Apel();
        System.out.println("\n========== TESTCASE #1 ==========");
        keranjangKu.tambahProduk(manggaKu);
        keranjangKu.tambahProduk(manggaKu);
        keranjangKu.tambahProduk(manggaKu);
        keranjangKu.tambahProduk(manggaKu);
        keranjangKu.tambahProduk(manggaKu);
        System.out.println("\n========== TESTCASE #2 ==========");
        keranjangKu.tambahProduk(apelKu);
        keranjangKu.tambahProduk(apelKu);
        keranjangKu.tambahProduk(apelKu);
        System.out.println("\n========== TESTCASE #3 ==========");
        keranjangKu.hapusProduk(apelKu);
        keranjangKu.hapusProduk(apelKu);
        keranjangKu.hapusProduk(apelKu);
        keranjangKu.hapusProduk(apelKu);
        System.out.println("\n========== TESTCASE #4 ==========");
        keranjangKu.getKeranjang();
        System.out.println("\n========== TESTCASE #5 ==========");
        keranjangKu.tambahProduk(apelKu);
        keranjangKu.tambahProduk(apelKu);
        keranjangKu.tambahProduk(apelKu);
        System.out.println("\n========== TESTCASE #6 ==========");
        keranjangKu.getKeranjang();
        System.out.println("\n========== TESTCASE #7 ==========");
        keranjangKu.hapusProduk(manggaKu);
        keranjangKu.hapusProduk(manggaKu);
        keranjangKu.hapusProduk(manggaKu);
        keranjangKu.hapusProduk(manggaKu);
        System.out.println("\n========== TESTCASE #8 ==========");
        keranjangKu.getKeranjang();
        System.out.println("\n========== TESTCASE #9 ==========");
        keranjangKu.hapusProduk(manggaKu);
        keranjangKu.hapusProduk(manggaKu);
        keranjangKu.tambahProduk(apelKu);
        keranjangKu.tambahProduk(apelKu);
        System.out.println("\n========== TESTCASE #10 ==========");
        keranjangKu.getKeranjang();
    }
    public static String formatRupiah(int nominal) {
        String str = String.valueOf(nominal);
        Double rupiah = Double.parseDouble(str);
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(rupiah);
    }
}
