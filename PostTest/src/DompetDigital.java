public class DompetDigital {
    String namaLengkap;
    String nomorPonsel;
    double saldo;

    public DompetDigital(String nama, String nomor) {
        this.namaLengkap = nama;
        this.nomorPonsel = nomor;
        this.saldo = 0.0;
    }

    public void setorDana(double nominal) {
        if (nominal < 10000) {
            System.out.println("Gagal oi. Setoran minimal 10.000");
        } else {
            this.saldo += nominal;
            System.out.println("Berhasil setor Rp " + nominal + ". Saldo sekarang adalah Rp " + this.saldo);
        }
    }

    public boolean lunasinTagihan(double tagihan) {
        if (this.saldo >= tagihan) {
            this.saldo -= tagihan;
            System.out.println("Tagihan berhasil lunas");
            return true;
        } else {
            System.out.println("Gagal. saldo ga cukup (Kurang Rp " + (tagihan - this.saldo) + ")");
            return false;
        }
    }

    public void cekSaldo() {
        System.out.println("-- CEK SALDO --");
        System.out.println("Pelanggan: " + namaLengkap);
        System.out.println("Nomor HP: " + nomorPonsel);
        System.out.println("Sisa Saldo: Rp " + saldo);
    }
}
