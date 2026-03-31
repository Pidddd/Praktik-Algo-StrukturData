package Jobsheet6.Praktikum05;

public class DataDosen03 {
    Dosen03[] dataDosen = new Dosen03[10];
    int idx = 0;

    // Menambah data dosen ke array
    public void tambah(Dosen03 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data Dosen berhasil ditambahkan.");
        } else {
            System.out.println("Array Data Dosen sudah penuh!");
        }
    }

    // Menampilkan seluruh isi array dosen
    public void tampil() {
        if (idx == 0) {
            System.out.println("Data Dosen masih kosong.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Bubble Sort ASC (Termuda ke Tertua)
    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen03 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    // Insertion Sort DESC (Tertua ke Termuda)
    public void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen03 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}