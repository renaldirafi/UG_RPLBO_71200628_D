package com.rplbo.utstokosedia;

public class MemberPremium extends Member{
    private long potongan = 10;
    private String kodeVoucher = "TOKOSEDIA25";

    public MemberPremium(String nama,String alamat){
        super(nama,alamat);
    }
    public void bayar(long tagihan,String kodeVoucher){
        if(kodeVoucher != this.kodeVoucher){
            System.out.println("Pembayaran gagal!, kode tidak valid atau voucher sudah kadaluwarsa");
        }else{
            System.out.println("Pembayaran Sukses!");
            tagihan = (tagihan*(25/100));
            super.bayar(tagihan);
        }
    }
    public void bayar(long tagihan){
        tagihan = tagihan*(10/100);
        super.bayar(tagihan);
    }
}
