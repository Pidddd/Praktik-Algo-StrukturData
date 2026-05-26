package Jobsheet14;

public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {
        BinaryTreeArray03 bta = new BinaryTreeArray03();
        
        System.out.println("=================================================");
        System.out.println("  UJI COBA TUGAS 4: ADD & PREORDER PADA ARRAY");
        System.out.println("=================================================");
        
        // Memasukkan data mahasiswa satu per satu menggunakan method add() array yang baru
        bta.add(new Mahasiswa03("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa03("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa03("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa03("244160220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa03("244160131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa03("244160205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa03("244160170", "Fizi", "B", 3.86));
        
        System.out.println("\nHasil InOrder Traversal pada Array:");
        bta.traverseInOrder(0);
        
        System.out.println("\nHasil PreOrder Traversal pada Array (Tugas 4b):");
        bta.traversePreOrder(0);
    }
}