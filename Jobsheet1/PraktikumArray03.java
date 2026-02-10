package Jobsheet1;

import java.util.Scanner;

public class PraktikumArray03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inisialisasi variabel
        double totalBobotSKS = 0;
        int totalSKS = 0, jumlahMatkul;

        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        // input data matkul
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        jumlahMatkul = sc.nextInt();
        sc.nextLine();

        // deklarasi array berdasarkan jumlah MK
        String[] matkul = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        double[] nilaiAngka = new double[jumlahMatkul];
        String[] nilaiHuruf = new String[jumlahMatkul];
        double[] bobotNilai = new double[jumlahMatkul];

        // input data MK
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            matkul[i] = sc.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            // ngecek nilai huruf dan bobot nilai
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
        }

        // Output
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nNilai Angka Mata Kuliah " + matkul[i] + " = " + nilaiAngka[i]);
        }

        System.out.println("===============================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("===============================");
        System.out.println("MK\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai");

        // ini output yang sudah di input
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println(matkul[i] + "\t\t" + String.format("%.2f", nilaiAngka[i]) + "\t\t\t" + nilaiHuruf[i] + "\t\t\t"
                    + String.format("%.2f", bobotNilai[i]));
            // ini buat menghitung total bobot
            totalBobotSKS += (bobotNilai[i] * sks[i]);
            totalSKS += sks[i];
        }

        // Hitung dan Tampilkan IP
        double ipSemester = totalBobotSKS / totalSKS;
        System.out.println("===============================");
        System.out.println("IP : " + String.format("%.2f", ipSemester));

        sc.close();
    }
}