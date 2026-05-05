package Jobsheet11.Pertemuan12;

public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa03() {
    }

    public Mahasiswa03(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
