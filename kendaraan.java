package uts.no2;

class Kendaraan {
    protected int kecepatanMaksimal;

    public Kendaraan(int kecepatanMaksimal) {
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    // Method umum untuk kendaraan
    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
    }

    public int getKecepatanMaksimal() {
        return kecepatanMaksimal;
    }
}