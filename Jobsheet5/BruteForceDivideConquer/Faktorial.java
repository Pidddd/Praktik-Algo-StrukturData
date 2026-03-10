package Jobsheet5.BruteForceDivideConquer;

public class Faktorial {
    int faktorialBF(int n) {
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial = faktorial * i;
        }
        return faktorial;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
