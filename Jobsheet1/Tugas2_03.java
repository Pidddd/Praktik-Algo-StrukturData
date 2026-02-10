package Jobsheet1;

import java.util.Scanner;

public class Tugas2_03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // inisialisasi array 2D
        String[][] jadwal = new String[n][4];

        // Memanggil fungsi-fungsi 
        inputJadwal(jadwal);

        // Ini menampilkan seluruh jadwal
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        tampilkanSemuaJadwal(jadwal);

        // Mencari berdasarkan hari 
        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String cariHari = sc.nextLine();
        tampilkanByHari(jadwal, cariHari);

        // Mencari berdasarkan nama matkul
        System.out.print("\nMasukkan nama matkul yang ingin dicari: ");
        String cariMatkul = sc.nextLine();
        tampilkanByMatkul(jadwal, cariMatkul);
    }

    // Fungsi input data
    public static void inputJadwal(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            data[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            data[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            data[i][2] = sc.nextLine();
            System.out.print("Jam (08-10)      : ");
            data[i][3] = sc.nextLine();
        }
    }

    // Fungsi Menampilkan jadwal 
    public static void tampilkanSemuaJadwal(String[][] data) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Matkul\t\t\t| Ruang\t\t| Hari\t\t| Jam");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t\t| " + data[i][1] + "\t\t| " + data[i][2] + "\t\t| " + data[i][3]);
        }
    }

    // Fungsi Jadwal (hari)
    public static void tampilkanByHari(String[][] data, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][2].equalsIgnoreCase(hari)) {
                System.out.println("- Matkul: " + data[i][0] +", jam :(" + data[i][3] + ") di ruang " + data[i][1]);
                ditemukan = true;
            }
        }
        if (!ditemukan)
            System.out.println("Tidak ada jadwal.");
    }

    // Fungsi nama matkul
    public static void tampilkanByMatkul(String[][] data, String matkul) {
        System.out.println("\nPencarian Matkul " + matkul + ":");
        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equalsIgnoreCase(matkul)) {
                System.out.println("Ditemukan! Hari: " + data[i][2] + ", Jam: " + data[i][3] + ", Ruang: " + data[i][1]);
                ditemukan = true;
            }
        }
        if (!ditemukan)
            System.out.println("Matkul tidak ditemukan.");
    }
}