package Jobsheet5.BruteForceDivideConquer;

public class Faktorial {
    int faktorialBF(int n) {
        int faktorial = 1;
        int i = 1;

        while (i <= n) {
            faktorial = faktorial * i;
            i++;
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
