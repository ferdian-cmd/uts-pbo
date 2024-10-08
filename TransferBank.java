package uts.no3;

class TransferBank implements Pembayaran {
    private String nomorRekening;

    public TransferBank(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public boolean validasiPembayaran() {
        if (nomorRekening.length() == 10) {
            System.out.println("Nomor rekening valid.");
            return true;
        } else {
            System.out.println("Nomor rekening tidak valid.");
            return false;
        }
    }
}
