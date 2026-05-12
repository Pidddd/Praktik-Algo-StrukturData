package Jobsheet11.Tugas;

public class QueueLayanan03 {
    NodeAntrian03 front, rear;
    int size;
    int kapasitasMaksimal;

    public QueueLayanan03(int kapasitasMaksimal) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.kapasitasMaksimal = kapasitasMaksimal; 
    }

    // d. Cek antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // d. Cek antrian penuh
    public boolean isFull() {
        return size == kapasitasMaksimal;
    }

    // d. Mengosongkan antrian
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }

    // e. Menambahkan antrian (Enqueue / Insert di belakang)
    public void enqueue(MahasiswaLayanan03 mhs) {
        if (isFull()) {
            System.out.println("Mohon maaf, kapasitas antrian sudah penuh!");
        } else {
            NodeAntrian03 newNode = new NodeAntrian03(mhs, null);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("Berhasil menambahkan " + mhs.nama + " ke dalam antrian.");
        }
    }

    // f. Memanggil antrian (Dequeue / Remove dari depan)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian yang bisa dipanggil (antrian kosong).");
        } else {
            MahasiswaLayanan03 dipanggil = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            System.out.println("Memanggil antrian atas nama:");
            dipanggil.tampilData();
            System.out.println("Silakan menuju loket layanan.");
        }
    }

    // g. Menampilkan antrian terdepan dan antrian paling akhir
    public void printFrontAndRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("--- Posisi Antrian Saat Ini ---");
            System.out.print("Antrian Terdepan : ");
            front.data.tampilData();
            System.out.print("Antrian Terakhir : ");
            rear.data.tampilData();
        }
    }

    // h. Menampilkan jumlah mahasiswa yang masih mengantre
    public void printQueueCount() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size + " orang.");
    }
}
