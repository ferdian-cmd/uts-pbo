package uts.no2;

class Mobil extends Kendaraan {

    public Mobil(int kecepatanMaksimal) {
        super(kecepatanMaksimal);
    }

    public void bergerak() {
        System.out.println("Mobil melaju dengan kecepatan maksimal: " + kecepatanMaksimal + " km/jam.");
    }
}
