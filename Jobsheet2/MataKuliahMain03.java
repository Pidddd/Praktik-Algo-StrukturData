package Jobsheet2;

public class MataKuliahMain03 {
    public static void main(String[] args) {
        // Menggunakan konstruktor berparameter
        MataKuliah03 mk1 = new MataKuliah03("INF101", "Algoritma dan Struktur Data", 3, 6);

        // Menggunakan konstruktor default
        MataKuliah03 mk2 = new MataKuliah03();
        mk2.kodeMK = "INF102";
        mk2.nama = "Dasar Pemrograman";
        mk2.sks = 2;
        mk2.jumlahJam = 4;

        System.out.println("=== Informasi Awal ===");
        mk1.tampilInformasi();
        mk2.tampilInformasi();

        System.out.println("=== Menguji Method mk1 ===");
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        System.out.println("=== Menguji Method mk2 (Gagal Kurang) ===");
        mk2.kurangiJam(10); 
        mk2.tampilInformasi();
    }
}