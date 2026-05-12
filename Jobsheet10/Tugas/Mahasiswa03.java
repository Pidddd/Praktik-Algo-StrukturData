package Jobsheet10.Tugas;

public class Mahasiswa03 {
    String nim, nama, prodi, kelas;

    public Mahasiswa03(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi + " | Kelas: " + kelas);
    }
}