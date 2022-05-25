package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kassa {
    private HashMap<Produk,Integer> pesanan = new HashMap<>();
    private ArrayList<Kasir> arrKasir = new ArrayList<>();
    private Kasir kasir;

    public Kassa(){
    }
    public void login(String username, String password){
        for(int i=0;i < arrKasir.size(); i++){
            if(arrKasir.get(i).getUsername().compareTo(username)==0 && arrKasir.get(i).getPassword().compareTo(password)==0){
                this.kasir = arrKasir.get(i);
                System.out.println("Login berhasil!");
            }else{
                System.out.println("Username/password anda salah!");
            }
        }
    }
    public void register(Kasir kasir){
        arrKasir.add(kasir);
        System.out.println("Kasir "+kasir.getNama()+" Berhasil ditambahkan ke dalam sistem");
    }
    public void tambahPesanan(Produk produk, int jumlah){
        pesanan.put(produk,jumlah);
    }
    public void printNota(){
        System.out.println("========== Nota ==========");
        System.out.println("Kasir: "+kasir.getNama());
        System.out.println("Nama Barang \t Jumlah \t Harga \t Sub Total");
        long total = 0;
        for(Map.Entry b : pesanan.entrySet()){
            Produk produk = (Produk) b.getKey();
            System.out.println(((Produk) b.getKey()).getNama()+". \t "+b.getValue()+"x \t "+((Produk) b.getKey()).getHarga() * pesanan.get(b));
            total += ((Produk) b.getKey()).getHarga() * pesanan.get(b);
            System.out.println("Total: Rp"+total);
            kasir.setTotalPenjualan(total);
        }
    }
    public void printPenjualanKasir(){
        System.out.println("Daftar Kasir:");
        System.out.println("No \t Nama \t Total Penjualan");
        for(int i=0;i< arrKasir.size();i++){
            System.out.println(i+". \t "+ arrKasir.get(i).getNama()+" \t "+arrKasir.get(i).getTotalPenjualan());
        }
    }
}
