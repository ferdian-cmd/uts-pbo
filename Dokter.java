package uts.no5;

public class Dokter extends Manusia {
    private String spesialisasi;
    private String nomorLisensi;

    public Dokter(String nama, int usia, String alamat, String spesialisasi, String nomorLisensi) {
        super(nama, usia, alamat);
        this.spesialisasi = spesialisasi;
        this.nomorLisensi = nomorLisensi;
    }

    public String diagnosaPenyakit(Pasien pasien) {
        return "Diagnosis untuk pasien " + pasien.getNama() + " adalah: [contoh diagnosis]";
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Nomor Lisensi: " + nomorLisensi);
    }
}