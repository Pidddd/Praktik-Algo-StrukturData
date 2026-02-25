package Jobsheet2;

public class DosenMain03 {
    public static void main(String[] args) {
        // Objek 1: Menggunakan Konstruktor Default
        Dosen03 dosen1 = new Dosen03();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Andi Wijaya";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Kecerdasan Buatan";

        System.out.println("--- Informasi Dosen 1 ---");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");
        
        System.out.println("\n--- Update Dosen 1 ---");
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Data Science");
        dosen1.tampilInformasi();

        System.out.println("\n" + "=".repeat(30) + "\n");

        // Objek 2: Menggunakan Konstruktor Berparameter
        Dosen03 dosen2 = new Dosen03("D002", "Ir. Shinta Permata", true, 2010, "Sistem Jaringan");

        System.out.println("--- Informasi Dosen 2 ---");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2024) + " tahun");

        System.out.println("\n--- Update Dosen 2 ---");
        dosen2.ubahKeahlian("Cyber Security");
        dosen2.tampilInformasi();
    }
}
