package Jobsheet11.Tugas;

public class MahasiswaLayanan03 {
    String nim;
    String nama;

    public MahasiswaLayanan03(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama);
    }
}
