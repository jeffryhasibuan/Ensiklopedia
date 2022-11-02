package com.example.ensik2.model;

import android.graphics.drawable.Drawable;

import com.google.gson.annotations.SerializedName;

public class TanamanItem {

    private String nama;
    private String namaLatin;
    private Drawable gambar;

    public TanamanItem() {
    }

    public TanamanItem(String nama, String namaLatin, Drawable gambar) {
        this.nama = nama;
        this.namaLatin = namaLatin;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaLatin() {
        return namaLatin;
    }

    public void setNamaLatin(String namaLatin) {
        this.namaLatin = namaLatin;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }
}
