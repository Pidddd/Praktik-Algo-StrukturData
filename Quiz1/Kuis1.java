package Quiz1;

public class Kuis1 {
    String pesan;
    int jumlahMakan;
    int jumlahMinum;
    int nomorMenu;
    int nomorMinuman;

    public Kuis1(int NM,int jumlahmkn, int NMM, int jumlahMnm, String pesan) {
        this.pesan = pesan;
        this.jumlahMinum = jumlahMnm;
        this.nomorMenu = NM;
        this.nomorMinuman = NMM;
        this.jumlahMakan = jumlahmkn;
    }

    public static void tampilkanMenu() {
        System.out.println("Menu Makanan:");
        System.out.println("1. Peuyeum - Rp 15.000");
        System.out.println("2. Jukut Goreng - Rp 12.000");
        System.out.println("3. Ayam Goreng - Rp 20.000");
    }

    public static void tampilkanMenuMinuman() {
        System.out.println("Menu Minuman:");
        System.out.println("1. Es Teh - Rp 5.000");
        System.out.println("2. Es kuwut - Rp 12.000");
        System.out.println("3. Es Milo - Rp 10.000");
    }
}