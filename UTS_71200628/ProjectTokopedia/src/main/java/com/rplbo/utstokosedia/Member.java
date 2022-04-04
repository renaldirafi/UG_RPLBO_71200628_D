package com.rplbo.utstokosedia;

public class Member {
    private String alamat;
    private String nama;
    private Dompet dompet;

    public Member(String nama, String alamat){
        this.alamat = alamat;
        this.nama = nama;
        this.dompet = new Dompet();
    }
    public String getAlamat(){
        return alamat;
    }
    public void cekSaldo(){
        System.out.println(getNama()+"----> Saldo Anda: Rp "+dompet.getSaldo());
    }
    public String getNama(){
        return nama;
    }
    public void bayar(long tagihan){
        if (dompet.getSaldo() > tagihan){
            System.out.println("Pembayaran Sukses");
            dompet.saldo -= tagihan;
        }else{
            System.out.println("Pembayaran gagal! Saldo anda tidak cukup");
        }
    }
    public void topUp(long nominal){
        if (nominal <=0){
            System.out.println("Top up gagal! jumlah nominal top up harus lebih dari 0");
        }else if(nominal > 0){
            dompet.setSaldo(nominal);
            System.out.println("Top Up Sukses");
        }
    }
}
