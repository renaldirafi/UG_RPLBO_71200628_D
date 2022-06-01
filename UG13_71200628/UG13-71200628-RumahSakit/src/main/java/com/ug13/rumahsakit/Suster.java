package com.ug13.rumahsakit;

public class Suster {
    private String nama;

    public Suster(String nama){
        this.nama=nama;
    }
    public void screening(Pasien pasien, Jadwal jadwal){
        jadwal.setPasien(pasien);
        if(jadwal.getStatusDaftar()==false){
            System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
        }else{
            jadwal.setStatusScreening();
        }
    }
}
