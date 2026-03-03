package Quiz1;

import java.util.Scanner;

public class Kuis1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("untuk berapa orang: ");
        int jmlh = sc.nextInt();
        sc.nextLine();

        Kuis1.tampilkanMenu();
        Kuis1.tampilkanMenuMinuman();
        System.out.println();

        Kuis1[] arrayCafe = new Kuis1[jmlh];

        for (int i = 0; i < jmlh; i++) {
            System.out.println("Masukkan data Pelanggan ke-" + (i + 1));
            System.out.print("Pilih Nomor Menu Makanan                      : ");
            int NM = sc.nextInt();
            System.out.print("Jumlah Menu Makanan                           : ");
            int jumlahMakan = sc.nextInt();
            System.out.print("Pilih Nomor Menu Minuman                      : ");
            int NMM = sc.nextInt();
            System.out.print("Jumlah Menu Minuman                           : ");
            int jumlahMnm = sc.nextInt();
            System.out.print("Catatan tambahan (kosongkan jika tidak ada)   : ");
            String pesan = sc.nextLine();
            sc.nextLine();

            arrayCafe[i] = new Kuis1(NM,jumlahMakan, NMM, jumlahMnm, pesan);
            System.out.println("--------------------------------------");
        }
        System.out.println("== Data Pesanan Pelanggan: ==");
        tampilkanData(arrayCafe);
        System.out.println("== Total Pesanan untuk setiap menu: ==");
        hitungMenu(arrayCafe);
        System.out.println("Total Harga Pesanan: Rp " + hitungTotalHarga(arrayCafe));
        sc.close();
    }

    // ini buat nampilin data pelangganya
    public static void tampilkanData(Kuis1[] arrayCafe) {
        for (int i = 0; i < arrayCafe.length; i++) {
            System.out.println("Data Pelanggan ke-" + (i + 1));
            String namaMenu;
            switch (arrayCafe[i].nomorMenu) {
                case 1:
                    namaMenu = "Peuyeum";
                    break;
                case 2:
                    namaMenu = "Jukut Goreng";
                    break;
                case 3:
                    namaMenu = "Ayam Goreng";
                    break;
                default:
                    namaMenu = "Menu tidak valid";
            }
            String namaMinuman;
            switch (arrayCafe[i].nomorMinuman) {
                case 1:
                    namaMinuman = "Es Teh";
                    break;
                case 2:
                    namaMinuman = "Es Kuwut";
                    break;
                case 3:
                    namaMinuman = "Es Milo";
                    break;
                default:
                    namaMinuman = "Minuman tidak valid";
            }
            System.out.println("Nama Makanan     : " + namaMenu);
            System.out.println("Nama Minuman     : " + namaMinuman);
            System.out.println("Jumlah Makanan   : " + arrayCafe[i].jumlahMakan);
            System.out.println("Jumlah Minuman   : " + arrayCafe[i].jumlahMinum);
            System.out.println("Catatan Tambahan : " + arrayCafe[i].pesan);
            System.out.println("--------------------------------------");
        }
    }

    // ini buat hitung total menu per pelanggan bukan hitung harga
    public static void hitungMenu(Kuis1[] arrayCafe) {
        for (int i = 0; i < arrayCafe.length; i++) {
            int totalMakanan = arrayCafe[i].jumlahMakan;
            int totalMinuman = arrayCafe[i].jumlahMinum;

            System.out.println("Pelanggan ke-" + (i + 1) + " memesan:");
            System.out.println("Total Makanan: " + totalMakanan);
            System.out.println("Total Minuman: " + totalMinuman);
            System.out.println("--------------------------------------");
        }
    }

    // nah ieu baru buat hitung total harga pesanan
    public static int hitungTotalHarga(Kuis1[] arrayCafe) {
        int totalHarga = 0;

        for (Kuis1 pesanan : arrayCafe) {
            switch (pesanan.nomorMenu) {
                case 1:
                    totalHarga += pesanan.jumlahMakan * 15000;
                    break;
                case 2:
                    totalHarga += pesanan.jumlahMakan * 12000;
                    break;
                case 3:
                    totalHarga += pesanan.jumlahMakan * 20000;
                    break;
                default:
                    System.out.println("Nomor menu tidak valid: " + pesanan.nomorMenu);
            }
        }

        for (Kuis1 pesanan : arrayCafe) {
            switch (pesanan.nomorMinuman) {
                case 1:
                    totalHarga += pesanan.jumlahMakan * 5000;
                    break;
                case 2:
                    totalHarga += pesanan.jumlahMakan * 12000;
                    break;
                case 3:
                    totalHarga += pesanan.jumlahMakan * 10000;
                    break;
                default:
                    System.out.println("Nomor minuman tidak valid: " + pesanan.nomorMinuman);
            }
        }
        return totalHarga;
    }
}
