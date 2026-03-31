// Soal No 1 (Blueprint Class)
public class MesinKopi {
    int bijiKopiGram;
    int airMl; 
    int susuMl;

    // Soal 4
    public MesinKopi() {
        this.bijiKopiGram = 0;
        this.airMl = 0;
        this.susuMl = 0;
    }

    // Soal 2
    public void isiUlangBahan(int tambahKopi, int tambahAir, int tambahSusu) {
        this.bijiKopiGram += tambahKopi;
        this.airMl += tambahAir;
        this.susuMl += tambahSusu;
        System.out.println("Bahan baku berhasil diisi ulang.");
    }

    // Soal 3
    public boolean cekKetersediaanCappuccino() {
        // Resepnya 15g kopi, 50ml air, 100ml susu
        if (this.bijiKopiGram >= 15 && this.airMl >= 50 && this.susuMl >= 100) {
            return true;
        } else {
            return false;
        }
    }
}
