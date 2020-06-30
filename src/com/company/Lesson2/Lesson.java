package com.company.Lesson2;

public class Lesson {
    String nama;
    String keterangan;

    public Lesson setKeterangan(String keterangan) {
        this.keterangan = keterangan;
        return this;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public Lesson setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public String getNama() {
        return nama;
    }
}
