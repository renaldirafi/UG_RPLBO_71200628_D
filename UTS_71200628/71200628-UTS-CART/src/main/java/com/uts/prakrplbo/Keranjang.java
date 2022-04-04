package com.uts.prakrplbo;

import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List<Buah> daftarBuah;
    private Buah buah;

    public Keranjang(){
        this.buah = new Buah();
    }

    public void tambahProduk(Buah buah){
        List<Buah> daftarBuah = new ArrayList<Buah>();
        daftarBuah.add(buah);
        this.daftarBuah = daftarBuah;
        System.out.println(buah.getNama()+" Berhasil ditambahkan ke dalam keranjang!");
    }
    public void hapusProduk(Buah buah){
        daftarBuah.remove(buah);
        System.out.println(buah.getNama()+" Berhasil dikeluarkan dari dalam keranjang");
    }
    public void getKeranjang(){
        int harga = 0;
        for(int i=0; i<daftarBuah.size();i++){
            System.out.println(daftarBuah.get(i).getNama());
            harga += buah.getHarga();
        }
        System.out.println("Total : Rp"+harga);
    }
}
