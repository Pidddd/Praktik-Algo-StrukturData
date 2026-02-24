package Jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa banyak Matakuliah yang ingin diinput? ");
        int jmlElemen = Integer.parseInt(sc.nextLine());
        
        Matakuliah03[] arrayOfMatakuliah = new Matakuliah03[jmlElemen];

        // Perulangan untuk Input Data
        for (int i = 0; i < jmlElemen; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah03();
            arrayOfMatakuliah[i].tambahData(sc);
            System.out.println("--------------------------------------");
        }

        for (int i = 0; i < jmlElemen; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}