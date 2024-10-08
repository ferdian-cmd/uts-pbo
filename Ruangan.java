package uts.no5;

import java.util.ArrayList;
import java.util.List;

public class Ruangan {
    private String nomorRuangan;
    private int kapasitas;
    private List<Pasien> daftarPasien;

    public Ruangan(String nomorRuangan, int kapasitas) {
        this.nomorRuangan = nomorRuangan;
        this.kapasitas = kapasitas;
        this.daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(Pasien pasien) throws RuanganPenuhException {
        if (daftarPasien.size() >= kapasitas) {
            throw new RuanganPenuhException("Ruangan sudah penuh!");
        }
        daftarPasien.add(pasien);
    }

    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public String getNomorRuangan() {
        return nomorRuangan;
    }
}
