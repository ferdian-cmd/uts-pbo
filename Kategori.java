package uts.no4;

import java.util.ArrayList;
import java.util.List;

public class Kategori {
    private String namaKategori;
    private List<Produk> daftarProduk;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarProduk = new ArrayList<>();
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }
}
