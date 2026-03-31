public class App {
    public static void main(String[] args) {
        Mahasiswa mhsBaru = new Mahasiswa("Iman Dwi Satrio", 20, "Ilmu Komputer");
        mhsBaru.Belajar();
        mhsBaru.tampilkan();
        mhsBaru.gantiProdi("Teknik Informatika");
        mhsBaru.tampilkan();
    }
}
