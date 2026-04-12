package UTS.CaseMethode;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Inisialisasi Data Mahasiswa 
        Mahasiswa03[] mhsArray = new Mahasiswa03[3];
        mhsArray[0] = new Mahasiswa03("22001", "Andi", "Teknik Informatika");
        mhsArray[1] = new Mahasiswa03("22002", "Budi", "Teknik Informatika");
        mhsArray[2] = new Mahasiswa03("22003", "Citra", "Sistem Informasi Bisnis");

        // 2. Inisialisasi Data Buku 
        Buku03[] bukuArray = new Buku03[4];
        bukuArray[0] = new Buku03("B001", "Algoritma", 2020);
        bukuArray[1] = new Buku03("B002", "Basis Data", 2019);
        bukuArray[2] = new Buku03("B003", "Pemrograman", 2021);
        bukuArray[3] = new Buku03("B004", "Fisika", 2024);

        // 3. Inisialisasi Data Peminjaman 
        Pinjam03[] pinjamArray = new Pinjam03[5];
        pinjamArray[0] = new Pinjam03(mhsArray[0], bukuArray[0], 7);
        pinjamArray[1] = new Pinjam03(mhsArray[1], bukuArray[1], 3);
        pinjamArray[2] = new Pinjam03(mhsArray[2], bukuArray[2], 10);
        pinjamArray[3] = new Pinjam03(mhsArray[2], bukuArray[3], 6);
        pinjamArray[4] = new Pinjam03(mhsArray[0], bukuArray[1], 4);

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    tampilkanMahasiswa(mhsArray);
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    tampilkanBuku(bukuArray);
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:");
                    tampilkanPeminjaman(pinjamArray);
                    break;
                case 4:
                    urutkanDenda(pinjamArray);
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.nextLine();
                    cariBerdasarkanNIM(pinjamArray, cariNim);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }

    // manggil method untuk dari class class
    public static void tampilkanMahasiswa(Mahasiswa03[] mhsArray) {
        for (Mahasiswa03 mhs : mhsArray) {
            mhs.tampilMahasiswa();
        }
    }

    public static void tampilkanBuku(Buku03[] bukuArray) {
        for (Buku03 buku : bukuArray) {
            buku.tampilBuku();
        }
    }

    public static void tampilkanPeminjaman(Pinjam03[] pinjamArray) {
        for (Pinjam03 pinjam : pinjamArray) {
            pinjam.tampilPeminjaman();
        }
    }

    // Insertion Sort (Descending / Denda terbesar ke terkecil)
    public static void urutkanDenda(Pinjam03[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Pinjam03 dataYgDicek= arr[i];
            int j = i - 1;

            // Pindahkan elemen yang lebih kecil dari dataYgDicek.denda ke posisi setelahnya
            while (j >= 0 && arr[j].denda < dataYgDicek.denda) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = dataYgDicek;
        }
        System.out.println("\nSetelah diurutkan (Denda terbesar):");
        tampilkanPeminjaman(arr);
    }

    // Mengurutkan array berdasarkan NIM (Ascending)
    public static void urutkanNIM(Pinjam03[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Pinjam03 dataYgDicek = arr[i];
            int j = i - 1;

            // ubah tipe data nim jdi int 
            int nimYgdicek = Integer.parseInt(dataYgDicek.mhs.nim);

            while (j >= 0 && Integer.parseInt(arr[j].mhs.nim) > nimYgdicek) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = dataYgDicek;
        }
    }

    //  Binary Search
    public static void cariBerdasarkanNIM(Pinjam03[] arr, String nim) {
        // urutkan data berdasarkan NIM
        urutkanNIM(arr);

        // ngubah inputan menjadi tipe int
        int nimDicari = Integer.parseInt(nim);

        // proses binary search
        int left = 0;
        int right = arr.length - 1;
        boolean ditemukan = false;

        System.out.println("\nHasil Pencarian untuk NIM " + nim + ":");

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Nim yang di tengah jadikan int
            int nimTengah = Integer.parseInt(arr[mid].mhs.nim);

            if (nimTengah == nimDicari) {
                // Cari batas kiri
                int awal = mid;
                while (awal >= 0 && Integer.parseInt(arr[awal].mhs.nim) == nimDicari) {
                    awal--;
                }

                // Cari batas kanan
                int akhir = mid;
                while (akhir < arr.length && Integer.parseInt(arr[akhir].mhs.nim) == nimDicari) {
                    akhir++;
                }

                // nampilin data yang ditemukan
                for (int i = awal + 1; i < akhir; i++) {
                    arr[i].tampilPeminjaman();
                }
                ditemukan = true;
                break;
            } else if (nimTengah < nimDicari) {
                left = mid + 1; // Geser kiri ke mid + 1
            } else {
                right = mid - 1; // Geser kanan ke mid - 1
            }
        }

        if (!ditemukan) {
            System.out.println("Data peminjaman tidak ditemukan.");
        }
    }
}