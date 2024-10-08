package uts.no3;

class DompetDigital implements Pembayaran {
    private double saldo;

    public DompetDigital(double saldo) {
        this.saldo = saldo;
    }

    public boolean validasiPembayaran() {
        if (saldo > 20000) {
            System.out.println("Saldo cukup.");
            return true;
        } else {
            System.out.println("Saldo tidak cukup.");
            return false;
        }
    }
}
