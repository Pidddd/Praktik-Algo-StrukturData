package Jobsheet6.Praktikum05;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();
        
        Mahasiswa03 m1 = new Mahasiswa03("123", "Zicco", "2A", 3.2);
        Mahasiswa03 m2 = new Mahasiswa03("124", "Akbar", "2A", 3.5);
        Mahasiswa03 m3 = new Mahasiswa03("125", "Daffa", "2A", 3.1);
        Mahasiswa03 m4 = new Mahasiswa03("126", "Zulfikar", "2A", 3.9);
        Mahasiswa03 m5 = new Mahasiswa03("127", "Repan", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
    }
}
