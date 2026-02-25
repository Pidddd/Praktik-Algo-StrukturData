package Jobsheet3;

public class DataDosen03 {

    // nampilin data semua dosen
    public void dataSemuaDosen(Dosen03[] arrayOfDosen) {
        System.out.println("\n======= DATA SEMUA DOSEN =======");
        for (Dosen03 dsn : arrayOfDosen) {
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + dsn.jenisKelamin);
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("--------------------------------");
        }
    }

    // Menampilkan jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen03 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin.equalsIgnoreCase("Pria")) pria++;
            else if (dsn.jenisKelamin.equalsIgnoreCase("Wanita")) wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    // tampilkan rata2 usia dosen per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen03 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalUsiaPria += dsn.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                jmlWanita++;
            }
        }
        System.out.println("Rerata Usia Pria    : " + (jmlPria > 0 ? (double)totalUsiaPria/jmlPria : 0));
        System.out.println("Rerata Usia Wanita  : " + (jmlWanita > 0 ? (double)totalUsiaWanita/jmlWanita : 0));
    }

    // Menampilkan data dosen tertua
    public void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        Dosen03 tertua = arrayOfDosen[0];
        for (Dosen03 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) tertua = dsn;
        }
        System.out.println("Dosen Paling Tua    : " + tertua.nama + " (" + tertua.usia + " tahun)");
    }

    // Menampilkan data dosen termuda
    public void infoDosenPalingMuda(Dosen03[] arrayOfDosen) {
        Dosen03 termuda = arrayOfDosen[0];
        for (Dosen03 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) termuda = dsn;
        }
        System.out.println("Dosen Paling Muda   : " + termuda.nama + " (" + termuda.usia + " tahun)");
    }
}
