package uts.no2;

class Truk extends Kendaraan {
    private int kapasitasMuatan;

    public Truk(int kecepatanMaksimal, int kapasitasMuatan) {
        super(kecepatanMaksimal);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void bergerak() {
        System.out.println("Truk dengan kapasitas muatan " + kapasitasMuatan + " ton melaju dengan kecepatan maksimal: "
                + kecepatanMaksimal + " km/jam.");
    }
}
