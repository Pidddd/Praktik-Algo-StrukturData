package Jobsheet14;

import java.util.Scanner;

public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTreeArray03 bta = new BinaryTreeArray03();

        // System.out.println("=================================================");
        // System.out.println("  Asesment - tampilkan semua data mahasiswa ");
        // System.out.println("=================================================");

        // Memasukkan data mahasiswa satu per satu menggunakan method add() array yang
        // baru
        bta.add(new Mahasiswa03("220101001", "Andi", "TI-1A", 3.95));
        bta.add(new Mahasiswa03("220101002", "Budi", "TI-1A", 3.20));
        bta.add(new Mahasiswa03("220101003", "Sinta", "TI-1B", 3.82));
        bta.add(new Mahasiswa03("220101004", "Rina", "TI-1B", 3.45));
        bta.add(new Mahasiswa03("220101005", "Dimas", "TI-1C", 3.75));
        bta.add(new Mahasiswa03("220101006", "Fajar", "TI-1C", 3.10));
        bta.add(new Mahasiswa03("220101007", "Nabila", "TI-1D", 3.76));
        bta.add(new Mahasiswa03("220101008", "Rizky", "TI-1D", 3.50));
        bta.add(new Mahasiswa03("220101009", "Aulia", "TI-1E", 3.88));
        bta.add(new Mahasiswa03("220101010", "Kevin", "TI-1E", 3.00)); // Data ke-11, melebihi kapasitas array

        // System.out.println("\nHasil InOrder Traversal pada Array:");
        // bta.traverseInOrder(0);

        // System.out.println("\nHasil PreOrder Traversal pada Array (Tugas 4b):");
        // bta.traversePreOrder(0);

        // =================================================
        // Hasil untuk Asesment
        // ================================================
        
        System.out.println("=================================================================");
        System.out.println("Output Asesment Tree - Ahmad Rafid Riqkullah TI-1G (254107020078)");
        System.out.println("=================================================================");

        bta.tampilkanSemuaDataTree();
        do {
            System.out.println("\n=================================================");
            System.out.println("Pilihan menu:");
            System.out.println("1. Cari mahasiswa berdasarkan nama");
            System.out.println("2. Cari 3 IPK tertinggi");
            System.out.println("3. Cari mahasiswa berdasarkan kelas");
            System.out.println("4. Tampilkan semua data mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = scanner.nextLine();
                    bta.cariMahasiswaByNama(namaCari);
                    break;
                case 2:
                    bta.cariTigaIPKTertinggi();
                    break;
                case 3:
                    System.out.print("Masukkan kelas mahasiswa yang dicari: ");
                    String kelasCari = scanner.nextLine();
                    bta.cariMahasiswaByKelas(kelasCari);
                    break;
                case 4:
                    bta.tampilkanSemuaDataTree();
                    break;
                case 5:
                    System.out.print("Program Selesai, Salam Hangat - Pid");
                    return;
                default:
                    System.out.println("Pilihanya salah euy, coba lagi!");
            }
        } while (true);
    }
    
}