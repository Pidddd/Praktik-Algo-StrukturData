package Jobsheet1;

public class PraktikumFungsi03 {
    public static void main(String[] args) {
        int[][] stokBunga = {
                { 10, 5, 15, 7 }, // RoyalGarden 1
                { 6, 11, 9, 12 }, // RoyalGarden 2
                { 2, 10, 10, 5 }, // RoyalGarden 3
                { 5, 7, 12, 9 } // RoyalGarden 4
        };

        // Harga: Aglonema, Keladi, Alocasia, Mawar
        int[] hargaBunga = { 75000, 50000, 60000, 10000 };

        tampilkanPendapatanDanStatus(stokBunga, hargaBunga);
    }

    // Fungsi untuk menghitung pendapatan dan menampilkan status
    public static void tampilkanPendapatanDanStatus(int[][] stok, int[] hargaBunga) {
        System.out.println("==========================================================");
        System.out.println("Cabang\t\tPendapatan\tStatus");
        System.out.println("----------------------------------------------------------");

        String status;

        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;
            // Menghitung total per cabang: (stok x harga)
            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += stok[i][j] * hargaBunga[j];
            }

            // Menentukan status berdasarkan aturan
            if (totalPendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            // Menampilkan hasil
            System.out.println("RoyalGarden " + (i + 1) + "\tRp " + totalPendapatan + "\t" + status);
        }
        System.out.println("==========================================================");
    }
}