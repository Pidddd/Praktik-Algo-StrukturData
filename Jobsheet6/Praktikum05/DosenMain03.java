package Jobsheet6.Praktikum05;

import java.util.Scanner;

public class DosenMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen03 data = new DataDosen03();
        int menu;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting DESC (Tertua ke Termuda - Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    
                    String jk = "";
                    boolean inputValid = false;
                    do {
                        System.out.print("Jenis Kelamin (L/P atau Laki-laki/Perempuan): ");
                        jk = sc.nextLine(); 
                        
                        // Cek apakah input sesuai dengan yang kita mau
                        if (jk.equalsIgnoreCase("L") || jk.equalsIgnoreCase("Laki-laki") || 
                            jk.equalsIgnoreCase("P") || jk.equalsIgnoreCase("Perempuan")) {
                            inputValid = true; // Jika benar, loop akan berhenti
                        } else {
                            System.out.println("Maaf, input salah! Harap ketik L atau P saja.\n");
                        }
                    } while (!inputValid); 
                    
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine(); 
                    
                    Dosen03 dsn = new Dosen03(kode, nama, jk, usia);
                    data.tambah(dsn);
                    break;

                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    data.tampil();
                    break;

                case 3:
                    System.out.println("\n--- Hasil Sorting ASC (Termuda ke Tertua) ---");
                    data.SortingASC();
                    data.tampil();
                    break;

                case 4:
                    System.out.println("\n--- Hasil Sorting DESC (Tertua ke Termuda) ---");
                    data.sortingDSC();
                    data.tampil();
                    break;

                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 5);
        
        sc.close();
    }
}