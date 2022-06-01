package com.ug13.rumahsakit;

public class Dokter {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }
    public void memeriksa(Pasien pasien, Jadwal jadwal){
        if(jadwal.getStatusScreening()==true){
            if(pasien.getLevelPenyakit()>0){
                pasien.setLevelPenyakit();
            }else{
                pasien.setStatus();
            }
        }else{
            if(jadwal.getStatusDaftar()==false){
                System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
            }else{
                System.out.println("ANDA HARUS SCREENING DULU");
            }

        }
    }
    public void cekStatus(Pasien pasien){
        if(pasien.getStatus()){
            System.out.println("PASIEN ANDA SUDAH SEMBUH DAN SEHAT");
        }else{
            System.out.println("PASIEN ANDA MASIH SAKIT");
        }
    }
}
