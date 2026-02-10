package Jobsheet1;

import java.util.Scanner;

public class PraktikumPerulangan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM Anda: ");
        long nim = sc.nextLong();

        // Mengambil 2 digit terakhir
        int n = (int) (nim % 100);

        if (n < 10) {
            n += 10;
        }

        System.out.println("n : " + n);
        System.out.println("===============================");
        // Perulangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {

            // Angka 10 dan 15 tidak dicetak
            if (i == 10 || i == 15) {
                continue;
            }
            // Bilangan kelipatan 3 dicetak #
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            // Bilangan ganjil dicetak *
            else if (i % 2 != 0) {
                System.out.print("* ");
            }
            // Bilangan genap (selain kelipatan 3)
            else {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n===============================");
        sc.close();
    }
}
