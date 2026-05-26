package Jobsheet14;

public class BinaryTreeMain03 {
    public static void main(String[] args) {
        BinaryTree03 bst = new BinaryTree03();

        // Menggunakan data awal praktikum
        bst.add(new Mahasiswa03("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa03("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa03("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa03("244160220", "Dewi", "B", 3.54));

        System.out.println("=================================================");
        System.out.println("  UJI COBA TUGAS 1: ADD REKURSIF");
        System.out.println("=================================================");
        // Memasukkan data menggunakan method rekursif yang baru dibuat
        bst.addRekursif(new Mahasiswa03("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa03("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa03("244160170", "Fizi", "B", 3.46));
        
        System.out.println("Daftar semua mahasiswa setelah penambahan rekursif (InOrder):");
        bst.traverseInOrder(bst.root);

        System.out.println("\n=================================================");
        System.out.println("  UJI COBA TUGAS 2: CARI MIN & MAX IPK");
        System.out.println("=================================================");
        bst.cariMinIPK();
        System.out.println();
        bst.cariMaxIPK();

        System.out.println("\n=================================================");
        System.out.println("  UJI COBA TUGAS 3: TAMPIL IPK DI ATAS BATAS");
        System.out.println("=================================================");
        // Menampilkan mahasiswa dengan IPK di atas 3.50
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}