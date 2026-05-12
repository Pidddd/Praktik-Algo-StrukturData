package Jobsheet11.Tugas;

import java.util.Scanner;

public class MainLayanan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLayanan03 antrian = new QueueLayanan03(5);
        int pilihan;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian Mahasiswa (Mendaftar)");
            System.out.println("2. Panggil Antrian (Proses Layanan)");
            System.out.println("3. Cek Antrian Terdepan dan Terakhir");
            System.out.println("4. Cek Jumlah Mahasiswa Mengantre");
            System.out.println("5. Cek Status Antrian (Kosong/Penuh)");
            System.out.println("6. Kosongkan Semua Antrian");
            System.out.println("0. Keluar Program");
            System.out.print("Pilih menu (0-6): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (!antrian.isFull()) {
                        System.out.print("Masukkan NIM  : ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama : ");
                        String nama = sc.nextLine();
                        // c. Pendaftaran data mahasiswa
                        MahasiswaLayanan03 mhsBaru = new MahasiswaLayanan03(nim, nama);
                        antrian.enqueue(mhsBaru);
                    } else {
                        System.out.println("Antrian penuh! Tidak bisa menambah data.");
                    }
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.printFrontAndRear();
                    break;
                case 4:
                    antrian.printQueueCount();
                    break;
                case 5:
                    System.out.println("Apakah antrian kosong? " + (antrian.isEmpty() ? "Ya" : "Tidak"));
                    System.out.println("Apakah antrian penuh?  " + (antrian.isFull() ? "Ya" : "Tidak"));
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}
