package Jobsheet14;

public class BinaryTreeArray03 {
    Mahasiswa03[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray03() {
        this.dataMahasiswa = new Mahasiswa03[10];
    }

    void populateData (Mahasiswa03 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // ==========================================
    // TUGAS 4a: Method add(Mahasiswa data)
    // ==========================================
    public void add(Mahasiswa03 data) {
        addHelper(0, data);
    }

    private void addHelper(int idx, Mahasiswa03 data) {
        // Cek jika indeks melebihi kapasitas array
        if (idx >= dataMahasiswa.length) {
            System.out.println("Kapasitas array tidak mencukupi untuk menambah data.");
            return;
        }
        
        // Jika indeks kosong, isi dengan data baru
        if (dataMahasiswa[idx] == null) {
            dataMahasiswa[idx] = data;
            // Update idxLast jika indeks baru lebih besar
            if (idx > idxLast) {
                idxLast = idx;
            }
        } 
        // Jika tidak kosong, bandingkan nilai IPK
        else if (data.ipk < dataMahasiswa[idx].ipk) {
            addHelper(2 * idx + 1, data); // Lanjut ke left child
        } else {
            addHelper(2 * idx + 2, data); // Lanjut ke right child
        }
    }

    // ==========================================
    // TUGAS 4b: Method traversePreOrder()
    // ==========================================
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                // Urutan PreOrder: Cetak Node Induk dulu, lalu Kiri, lalu Kanan
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}