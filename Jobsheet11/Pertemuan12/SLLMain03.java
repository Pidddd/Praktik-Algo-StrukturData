package Jobsheet11.Pertemuan12;

import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        SingleLinkedList03 sll = new SingleLinkedList03();
        Scanner sc = new Scanner(System.in); 
        char pilih;
        
        do{
        System.out.println("=== Tambah Data Mahasiswa ===");
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();

        // Buat object mahasiswa baru dari data yang diinputkan
        Mahasiswa03 mhsBaru = new Mahasiswa03(nim, nama, kelas, ipk);

        // Tambahkan ke dalam Linked List (misal ditaruh di paling belakang)
        sll.addLast(mhsBaru);

        System.out.print("Apakah ingin menambahkan data lagi? (y/n): ");
        pilih = sc.next().charAt(0);
        sc.nextLine();
        } while (pilih == 'y' || pilih == 'Y');

        System.out.println("\nData setelah ditambahkan:");
        sll.print(); 

        sc.close();
    }
}
