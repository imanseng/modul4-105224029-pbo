import java.util.Scanner;

public class AppFintech {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nomor HP: ");
        String nomor = input.nextLine();

        DompetDigital user = new DompetDigital(nama, nomor);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("-- MENU --");
            System.out.println("1. Pengisian Dana");
            System.out.println("2. Pelunasan Tagihan");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan nominal setoran: ");
                double setor = input.nextDouble();
                user.setorDana(setor);
            } 
            else if (pilihan == 2) {
                System.out.print("Masukkan nominal tagihan: ");
                double tagihan = input.nextDouble();
                user.lunasinTagihan(tagihan);
            } 
            else if (pilihan == 3) {
                user.cekSaldo();
            }
            else {
                lanjut = false;
            }
        }
        input.close();
    }
}
