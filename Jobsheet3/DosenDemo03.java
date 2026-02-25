package Jobsheet3;

import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen03[] daftarDosen = new Dosen03[3];

        // LoopFOR untuk input data
        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            
            // Inisialisasi objek ke array
            daftarDosen[i] = new Dosen03(kode, nama, jk, usia);
            System.out.println("--------------------------------");
        }

        System.out.println("\nDAFTAR DATA DOSEN\n");

        // Looping FOREACH buat nampilin data
        int counter = 1;
        for (Dosen03 dsn : daftarDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + dsn.jenisKelamin);
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("--------------------------------");
            counter++;
        }
        sc.close();
    }
}