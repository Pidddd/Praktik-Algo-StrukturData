package UTS.CaseMethode;

public class Mahasiswa03 {
    String nim, nama, prodi;

    Mahasiswa03() {
    }

    Mahasiswa03(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}