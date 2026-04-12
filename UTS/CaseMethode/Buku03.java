package UTS.CaseMethode;

public class Buku03 {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku03() {
    }

    Buku03(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}