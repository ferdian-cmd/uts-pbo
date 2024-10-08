package uts.no3;

class KartuKredit implements Pembayaran {
    private String nomorKartu;

    public KartuKredit(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    public boolean validasiPembayaran() {
        if (nomorKartu.length() == 16) {
            System.out.println("mau tarik uang bos kuh?");
            return true;
        } else {
            System.out.println("Mau nyolong ya.");
            return false;
        }
    }
}
