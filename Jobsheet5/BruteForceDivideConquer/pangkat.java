package Jobsheet5.BruteForceDivideConquer;

public class pangkat {
    public int nilai, pangkat;

    public pangkat(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 1) { 
            return a;
        } else {
            if (n % 2 == 1) { // Jika pangkat ganjil
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else { // Jika pangkat genap
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}
