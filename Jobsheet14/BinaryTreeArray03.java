package Jobsheet14;

import java.util.Arrays;

public class BinaryTreeArray03 {
    Mahasiswa03[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray03() {
        this.dataMahasiswa = new Mahasiswa03[100];
        this.idxLast = -1; 
    }

    // ==========================================
    // Fitur Tambah Data Mahasiswa 
    // ==========================================
    public void add(Mahasiswa03 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Array sudah penuh! Tidak dapat menambahkan data mahasiswa: " + data.nama);
        }
    }

    // ==========================================
    // Traversal InOrder 
    // ==========================================
    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // ==========================================
    // Fitur 1: Cari mahasiswa berdasarkan nama
    // ==========================================
    public void cariMahasiswaByNama(String nama) {
        boolean[] found = {false};
        cariNamaRekursif(0, nama, found);
        if (!found[0]) {
            System.out.println("Mahasiswa dengan nama '" + nama + "' tidak ditemukan.");
        }
    }

    private void cariNamaRekursif(int idxStart, String nama, boolean[] found) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null && !found[0]) {
            if (dataMahasiswa[idxStart].nama.equalsIgnoreCase(nama)) {
                System.out.println("Mahasiswa ditemukan:");
                dataMahasiswa[idxStart].tampilInformasi();
                found[0] = true;
                return;
            }
            cariNamaRekursif(2 * idxStart + 1, nama, found);
            cariNamaRekursif(2 * idxStart + 2, nama, found);
        }
    }

    // ==========================================
    // Fitur 2: Cari 3 IPK Tertinggi 
    // ==========================================
    public void cariTigaIPKTertinggi() {
        if (idxLast < 0) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }

        int count = 0;
        for (int i = 0; i <= idxLast; i++) {
            if (dataMahasiswa[i] != null) {
                count++;
            }
        }

        Mahasiswa03[] tempMhs = new Mahasiswa03[count];
        int indexTemp = 0;
        for (int i = 0; i <= idxLast; i++) {
            if (dataMahasiswa[i] != null) {
                tempMhs[indexTemp] = dataMahasiswa[i];
                indexTemp++;
            }
        }

        // Urutkan secara descending (dari besar ke kecil) 
        for (int i = 0; i < tempMhs.length - 1; i++) {
            for (int j = 0; j < tempMhs.length - i - 1; j++) {
                if (tempMhs[j].ipk < tempMhs[j + 1].ipk) {
                    Mahasiswa03 temp = tempMhs[j];
                    tempMhs[j] = tempMhs[j + 1];
                    tempMhs[j + 1] = temp;
                }
            }
        }

        System.out.println("3 IPK Tertinggi:");
        int batas = Math.min(3, tempMhs.length);
        for (int i = 0; i < batas; i++) {
            tempMhs[i].tampilInformasi();
        }
    }

    // ==========================================
    // Fitur 3: Cari mahasiswa berdasarkan kelas
    // ==========================================
    public void cariMahasiswaByKelas(String kelas) {
        boolean[] found = {false};
        System.out.println("Mahasiswa dari kelas '" + kelas + "':");
        cariKelasRekursif(0, kelas, found);
        if (!found[0]) {
            System.out.println("Tidak ada mahasiswa dari kelas '" + kelas + "'.");
        }
    }

    private void cariKelasRekursif(int idxStart, String kelas, boolean[] found) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            if (dataMahasiswa[idxStart].kelas.equalsIgnoreCase(kelas)) {
                dataMahasiswa[idxStart].tampilInformasi();
                found[0] = true;
            }
            cariKelasRekursif(2 * idxStart + 1, kelas, found);
            cariKelasRekursif(2 * idxStart + 2, kelas, found);
        }
    }

    // ==========================================
    // Tampilkan Semua Data Menggunakan Aturan Tree
    // ==========================================
    public void tampilkanSemuaDataTree() {
        if (idxLast < 0 || dataMahasiswa[0] == null) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        System.out.println("Semua Data Mahasiswa (InOrder Traversal):");
        traverseInOrder(0);
    }
}