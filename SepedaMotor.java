package uts.no2;

class SepedaMotor extends Kendaraan {

    public SepedaMotor(int kecepatanMaksimal) {
        super(kecepatanMaksimal);
    }

    public void bergerak() {
        System.out.println("Sepeda motor melaju dengan kecepatan maksimal: " + kecepatanMaksimal + " km/jam.");
    }
}
