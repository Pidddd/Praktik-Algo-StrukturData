package Jobsheet9;

public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa03() {
    }

    public Mahasiswa03(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1; // Nilai default sebelum dinilai
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}