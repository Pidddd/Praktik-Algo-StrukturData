package Jobsheet6.Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        System.out.println("=== Masukkan Data Mahasiswa ===");
        // Karena array di MahasiswaBerprestasi maksimal 5, kita loop 5 kali
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

            // Membuat objek Mahasiswa03 baru dan menambahkannya ke list
            Mahasiswa03 m = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\n--- Data mahasiswa sebelum sorting ---");
        list.tampil();

        System.out.println("\n--- Data Mahasiswa setelah sorting BUBBLE SORT berdasarkan IPK (DESC) ---");
        list.bubbleSort();
        list.tampil();

        System.out.println("\n--- Data Mahasiswa setelah sorting SELECTION SORT berdasarkan IPK (ASC) ---");
        list.selectionSort();
        list.tampil();

        System.out.println("\n--- Data Mahasiswa setelah sorting INSERTION SORT berdasarkan IPK (ASC) ---");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
}