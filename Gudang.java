package uts.no4;

import java.util.ArrayList;
import java.util.List;

public class Gudang {
    private String lokasiGudang;
    private List<Produk> daftarProduk;

    public Gudang(String lokasiGudang) {
        this.lokasiGudang = lokasiGudang;
        this.daftarProduk = new ArrayList<>();
    }

    public String getLokasiGudang() {
        return lokasiGudang;
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }
}
