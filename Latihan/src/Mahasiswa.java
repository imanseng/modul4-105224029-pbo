public class Mahasiswa {
    String nama;
    int umur;
    String jurusanStudi;

    public Mahasiswa(String nama, int umur, String jurusanStudi) {
        this.nama = nama;
        this.umur = umur;
        this.jurusanStudi = jurusanStudi;
    }

    public void Belajar() {
        System.out.println(nama + " sedang belajar di jurusan " + jurusanStudi);
    }

    public void gantiProdi(String jurusanStudi) {
        this.jurusanStudi = jurusanStudi;
    }

    public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusanStudi);
    }

}
