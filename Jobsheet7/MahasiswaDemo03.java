package Jobsheet7;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        System.out.println("=== Masukkan Data Mahasiswa ===");
        for (int i = 0; i < list.listMhs.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("-------------------------");

            Mahasiswa03 m = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\n--- Data mahasiswa ---");
        list.tampil();

        // System.out.println("\n--- Data Mahasiswa setelah sorting BUBBLE SORT berdasarkan IPK (DESC) ---");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\n--- Data Mahasiswa setelah sorting SELECTION SORT berdasarkan IPK (ASC) ---");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("\n--- Data Mahasiswa setelah sorting INSERTION SORT berdasarkan IPK (ASC) ---");
        // list.insertionSort();
        // list.tampil();

        // BLOK KODE PENCARIAN DATA SEQUENTIAL
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------");
        System.out.print("masukkan ipk mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
        System.out.println("----------------------------------------");

        // PENCARIAN BINARY (6.3)
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data Binary");
        System.out.println("----------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        cari = sc.nextDouble(); 

        System.out.println("----------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------------");
        int jumMhs = list.listMhs.length;
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}