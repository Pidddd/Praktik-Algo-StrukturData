package Jobsheet6.Praktikum05;

public class Dosen03 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    // Konstruktor
    public Dosen03(String kd, String name, String jk, int age) {
        kode = kd;
        nama = name;
        
        if (jk.equalsIgnoreCase("L") || jk.equalsIgnoreCase("Laki-laki") || jk.equalsIgnoreCase("Laki laki")) {
            jenisKelamin = "Laki-laki";
        } else if (jk.equalsIgnoreCase("P") || jk.equalsIgnoreCase("Perempuan")) {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = jk; // Default jika user mengisi selain L/P
        }
        
        usia = age;
    }

    // Menampilkan detail satu dosen
    public void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin); // Langsung panggil variabelnya
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------------");
    }
}