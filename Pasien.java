package uts.no5;

import java.util.ArrayList;
import java.util.List;

public class Pasien extends Manusia {
    private String nomorRekamMedis;
    private List<String> riwayatPenyakit;

    public Pasien(String nama, int usia, String alamat, String nomorRekamMedis) {
        super(nama, usia, alamat);
        this.nomorRekamMedis = nomorRekamMedis;
        this.riwayatPenyakit = new ArrayList<>();
    }

    public void tambahRiwayatPenyakit(String penyakit) {
        riwayatPenyakit.add(penyakit);
    }

    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public List<String> getRiwayatPenyakit() {
        return riwayatPenyakit;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Nomor Rekam Medis: " + nomorRekamMedis);
        System.out.println("Riwayat Penyakit: " + riwayatPenyakit);
    }
}
