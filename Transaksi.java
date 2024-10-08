package uts.no3;

public abstract class Transaksi {
    protected String nomorTransaksi;
    protected double nominalTransaksi;

    public Transaksi(String nomorTransaksi, double nominalTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
        this.nominalTransaksi = nominalTransaksi;
    }

    public String getNomorTransaksi() {
        return nomorTransaksi;
    }

    public double getNominalTransaksi() {
        return nominalTransaksi;
    }
}