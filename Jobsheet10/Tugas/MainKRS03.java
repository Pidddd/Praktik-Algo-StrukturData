package Jobsheet10.Tugas;

import java.util.Scanner;

public class MainKRS03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS03 antrian = new AntrianKRS03(10); 
        int pilih;

        do {
            System.out.println("\n--- MENU ANTRIAN KRS DPA ---");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil/Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Statistik & Jumlah");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa03(nim, nama, prodi, kelas));
                    break;
                case 2: antrian.prosesKRS(); break;
                case 3: antrian.tampilkanSemua(); break;
                case 4: antrian.tampilkanDuaTerdepan(); break;
                case 5: antrian.tampilkanAkhir(); break;
                case 6: antrian.cetakStatistik(); break;
                case 7: antrian.clear(); break;
            }
        } while (pilih != 0);
        sc.close();
    }
}
