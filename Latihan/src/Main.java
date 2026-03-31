public class Main {
    public static void main(String[] args) {
        // Soal 1
        MesinKopi mesinLobby = new MesinKopi();

        // Cek bahan saat baru dinyalakan (pasti false karena constructor nya di set ke 0)
        System.out.println("Apakah bisa buat Cappuccino? " + mesinLobby.cekKetersediaanCappuccino());

        // cek stok
        System.out.println("Biji Kopi: " + mesinLobby.bijiKopiGram + "g");
        System.out.println("Air: " + mesinLobby.airMl + "ml");
        System.out.println("Susu: " + mesinLobby.susuMl + "ml");
        
        // Isi bahan (Soal 2)
        mesinLobby.isiUlangBahan(50, 200, 300);

        // Cek kembali setelah diisi (Soal 3)
        if (mesinLobby.cekKetersediaanCappuccino()) {
            System.out.println("Stok cukup, monggo buat Cappuccino.");
        } else {
            System.out.println("Stok tidak cukup, isi ulang dulu.");
        }

        // Cek stok
        System.out.println("Biji Kopi: " + mesinLobby.bijiKopiGram + "g");
        System.out.println("Air: " + mesinLobby.airMl + "ml");
        System.out.println("Susu: " + mesinLobby.susuMl + "ml");
    }
}
