package Jobsheet11.Pertemuan12;

import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        SingleLinkedList03 sll = new SingleLinkedList03();

        // Pembuatan 4 object mahasiswa 
        Mahasiswa03 mhs1 = new Mahasiswa03("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa03 mhs2 = new Mahasiswa03("23212201", "Bimon", "2B", 3.8);
        Mahasiswa03 mhs3 = new Mahasiswa03("22212202", "Cintia", "3C", 3.5);
        Mahasiswa03 mhs4 = new Mahasiswa03("21212203", "Dirga", "4D", 3.6);

        // --- KODE PRAKTIKUM 2.1 ---
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);
        sll.print();

        // --- KODE PRAKTIKUM 2.2 ---
        System.out.println("data index 1: ");
        sll.getData(1);
        
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        
        sll.removeAt(0);
        sll.print();
    }
}
