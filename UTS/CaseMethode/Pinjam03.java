package UTS.CaseMethode;

public class Pinjam03 {
    Mahasiswa03 mhs;
    Buku03 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Pinjam03() {
    }

    Pinjam03(Mahasiswa03 m, Buku03 b, int lama) {
        this.mhs = m;
        this.buku = b;
        this.lamaPinjam = lama;
        hitungDenda(); 
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " \t| " + buku.judul + " \t| Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}