package com.company.Lesson2;

import java.util.ArrayList;
/**
 *
 * @Author Bobby Akyong
 *
 * */

/*
* Kelas Student adalah publik
* */
public class Student {
    String nim;
    String nama;
    String usia;
    ArrayList<Lesson> listMataPelajaran = new ArrayList<Lesson>();//setiap student memiliki daftar matapelajaran

    public Student setNim(String nim) {
        this.nim = nim;
        return this;
    }

    public Student setUsia(String usia) {
        this.usia = usia;
        return this;
    }

    public Student setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Lesson> getListMataPelajaran() {
        return listMataPelajaran;
    }

    public Student setListMataPelajaran(ArrayList<Lesson> listMataPelajaran) {
        this.listMataPelajaran = listMataPelajaran;
        return this;
    }

    public String getNim() {
        return nim;
    }

    public String getUsia() {
        return usia;
    }
}
