package uts.no4;

import java.util.ArrayList;
import java.util.List;

public class Produk {
    private String namaProduk;
    private double harga;
    private int stok;
    private List<Kategori> kategoriList;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
        this.kategoriList = new ArrayList<>();
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void tambahKategori(Kategori kategori) {
        kategoriList.add(kategori);
    }

    public List<Kategori> getKategoriList() {
        return kategoriList;
    }
}
