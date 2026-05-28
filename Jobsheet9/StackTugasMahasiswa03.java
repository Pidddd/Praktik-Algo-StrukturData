package Jobsheet9;

public class StackTugasMahasiswa03 {
    Mahasiswa03[] stack;
    int size;
    int top;

    public StackTugasMahasiswa03(int size) {
        this.size = size;
        stack = new Mahasiswa03[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa03 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa03 pop() {
        if (!isEmpty()) {
            Mahasiswa03 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) { // Mengubah urutan loop dari atas ke bawah
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            System.out.println("");
        }
    }

    // Operasi melihat tugas terbawah / pertama masuk (Pertanyaan 4)
    public Mahasiswa03 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; // Tugas paling awal selalu berada di indeks 0
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Operasi menghitung jumlah tugas saat ini (Pertanyaan 5)
    public int getJumlahTugas() {
        return top + 1; // Karena indeks dimulai dari 0, jumlah data adalah top + 1
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi03 stack = new StackKonversi03();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        
        String biner = new String();
        // Menggunakan !stack.isEmpty() agar loop berjalan selama stack TIDAK kosong
        while (!stack.isEmpty()) { 
            biner += stack.pop();
        }
        
        return biner;
    }
}
