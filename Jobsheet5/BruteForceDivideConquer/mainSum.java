package Jobsheet5.BruteForceDivideConquer;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen (bulan): ");
        int elemen = input.nextInt();

        sum sm = new sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble(); 
        }

        System.out.println("===============================================================");
        System.out.println("Total keuntungan menggunakan Brute Force       : " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
        System.out.println("===============================================================");
        
        input.close();
    }
}
