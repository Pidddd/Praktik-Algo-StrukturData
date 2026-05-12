package Jobsheet10.Tugas;

public class AntrianKRS03 {
    Mahasiswa03[] data;
    int front, rear, size, max;
    int sudahProses = 0;
    final int TOTAL_MAHASISWA_DPA = 30; // Kuota maksimal per DPA

    public AntrianKRS03(int n) {
        max = n;
        data = new Mahasiswa03[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa03 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! (Maksimal 10)");
        } else if (sudahProses + size >= TOTAL_MAHASISWA_DPA) {
            System.out.println("Mohon maaf, total kuota mahasiswa DPA (30 orang) sudah terpenuhi.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian.");
        }
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            int jumlahDipanggil = (size >= 2) ? 2 : 1; // Panggil 2 jika tersedia, jika tidak panggil 1
            System.out.println("--- Memproses " + jumlahDipanggil + " Mahasiswa ---");
            for (int i = 0; i < jumlahDipanggil; i++) {
                Mahasiswa03 m = data[front];
                System.out.print("Memproses: ");
                m.tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahProses++;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("1. "); data[front].tampilkanData();
            if (size > 1) {
                System.out.println("2. "); data[(front + 1) % max].tampilkanData();
            }
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            data[rear].tampilkanData();
        }
    }

    public void cetakStatistik() {
        System.out.println("Jumlah antrian saat ini: " + size);
        System.out.println("Sudah melakukan KRS: " + sudahProses);
        System.out.println("Belum melakukan KRS (Sisa kuota DPA): " + (TOTAL_MAHASISWA_DPA - sudahProses));
    }
}