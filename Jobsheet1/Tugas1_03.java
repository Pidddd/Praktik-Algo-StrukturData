package Jobsheet1;

import java.util.Scanner;

public class Tugas1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inisialisasi array 1d buat plat
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        // Inisialisasi array 2d buat kotanya
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.print("Masukkan Kode Plat Nomor: ");
        char input = sc.next().toUpperCase().charAt(0);

        // mencari
        int indexDitemukan = -1; // Inisialisasi
        for (int i = 0; i < KODE.length; i++) {
            if (input == KODE[i]) {
                indexDitemukan = i;
                break;
            }
        }

        // Output
        if (indexDitemukan != -1) {
            System.out.print("Nama Kota: ");
            for (int j = 0; j < KOTA[indexDitemukan].length; j++) {
                System.out.print(KOTA[indexDitemukan][j]);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
        sc.close();
    }
}
