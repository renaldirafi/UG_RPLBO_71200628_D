package com.rplbo.utstokosedia;

public class Invoice {
    private int jumlah;
    private long tagihan;
    private Produk produk;
    private Member member;

    public Invoice(){
    }
    public void printInvoice(){
        System.out.println("--- INVOICE ---");
        System.out.println("Kepada: Yth."+member.getNama());
        System.out.println("Di "+member.getAlamat());
        System.out.println(jumlah+"x "+produk.getNamaProduk()+" Rp "+ produk.getHarga());
        System.out.println("----> Total Tagihan: Rp "+tagihan);
    }
    public void buatInvoice(Produk produk, int jumlah, Member member){
        this.produk = produk;
        this.jumlah = jumlah;
        this.member = member;
        this.tagihan = produk.getHarga()*jumlah;
    }
    public  long getTagihan(){
        return tagihan;
    }
}
