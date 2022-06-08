package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayanan;
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal){
        if(pasien.getStatus()==false){
            jadwal.setPasien(pasien);
            jadwal.setDokter(dokter);
            jadwal.setStatusDaftar();
            System.out.println("Proses Pengaturan Jadwal Berhasil");
        }
    }
    public Pasien registrasi(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan rm baru:");
        int rm = inp.nextInt();
        System.out.print("Masukkan Nama anda: ");
        String uname = inp.next();
        System.out.print("Masukkan Usia anda: ");
        int umur = inp.nextInt();
        System.out.print("Masukkan Alamat anda: ");
        String alamat = inp.next();
        System.out.print("Masukkan penyakit anda: ");
        String penyakit = inp.next();
        System.out.println("Proses Registrasi Berhasil");
        return new Pasien(uname,umur,alamat,3);
    }

    public int getIdPelayanan(){
        return idPelayanan;
    }
}
