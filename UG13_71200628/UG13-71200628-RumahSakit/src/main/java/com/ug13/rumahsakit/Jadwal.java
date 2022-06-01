package com.ug13.rumahsakit;

public class Jadwal {
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private boolean statusDaftar = false;
    private boolean StatusScreening = false;

    public boolean getStatusScreening(){
        return StatusScreening;
    }

    public void setStatusScreening() {
        StatusScreening = true;
    }

    public Pasien getPasien(){
        return pasien;
    }
    public boolean getStatusDaftar(){
        return statusDaftar;
    }

    public void setStatusDaftar() {
        this.statusDaftar = true;
    }
    public void setPasien(Pasien pasien){
        this.pasien = pasien;
    }
    public void setDokter(Dokter dokter){
        this.dokter = dokter;
    }
}
