package uts.no5;

public class Main {
    public static void main(String[] args) {
        Dokter dokter = new Dokter("Dr. John", 45, "Jakarta", "Spesialis Bedah", "DL123456");

        Pasien pasien1 = new Pasien("Ali", 30, "Bandung", "RM001");
        pasien1.tambahRiwayatPenyakit("Flu");

        Pasien pasien2 = new Pasien("Budi", 25, "Jakarta", "RM002");
        pasien2.tambahRiwayatPenyakit("Demam");

        Ruangan ruangan1 = new Ruangan("101", 2);

        try {
            ruangan1.tambahPasien(pasien1);
            System.out.println("Pasien " + pasien1.getNama() + " ditambahkan ke ruangan " + ruangan1.getNomorRuangan());
            ruangan1.tambahPasien(pasien2);
        } catch (RuanganPenuhException e) {
            System.out.println(e.getMessage());
        }

        dokter.tampilkanInformasi();
        pasien1.tampilkanInformasi();
        pasien2.tampilkanInformasi();
    }
}