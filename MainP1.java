package TugasPraktikum1;

import java.util.Scanner;

public class MainP1 {
    public static void main(String[] args) {
        Scanner owd = new Scanner(System.in);

        Film[] filmList = {
            new Film("Missing", "Mystery", "12:00", 50000),
            new Film("The Architecture of Love", "Romance", "14:30", 45000),
            new Film("Despicable Me", "Animation", "17:00", 55000)
        };

        Studio[] studioList = {
            new Studio(1, 100, filmList[0]),
            new Studio(2, 100, filmList[1]),
            new Studio(3, 100, filmList[2])
        };

        Tiket[] tiketList = new Tiket[100];
        int jumlahTiket = 0;
        int nomorTiket = 1;

        while (true) {
            System.out.println("\n=== Menu Pemesanan Tiket Bioskop ===");
            System.out.println("1. Lihat Daftar Studio dan Film");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Tiket yang Sudah Dipesan");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (1/2/3/4): ");
            int pilihan = owd.nextInt();
            owd.nextLine();

            if (pilihan == 1) {
                System.out.println("\n=== Informasi Studio ===");
                for (int i = 0; i < studioList.length; i++) {
                    System.out.println(studioList[i]);
                    System.out.println("-------------------------");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan Nama Penonton: ");
                Penonton penonton = new Penonton(owd.nextLine());

                System.out.println("\nPilih Studio:");
                for (int i = 0; i < studioList.length; i++) {
                    System.out.println((i + 1) + ". Studio " + studioList[i].getNomorStudio() +
                            " - Film: " + studioList[i].getFilmSedangTayang().getJudul());
                }
                System.out.print("Masukkan Pilihan (1/2/3): ");
                int pilihanStudio = owd.nextInt();
                owd.nextLine();

                if (pilihanStudio < 1 || pilihanStudio > studioList.length) {
                    System.out.println("Pilihan tidak valid!");
                    continue;
                }
                Studio studioDipilih = studioList[pilihanStudio - 1];

                System.out.print("Masukkan Nomor Kursi: ");
                int nomorKursi = owd.nextInt();
                owd.nextLine();

                tiketList[jumlahTiket++] = new Tiket(nomorTiket++, studioDipilih.getFilmSedangTayang(), 
                                     studioDipilih, nomorKursi, penonton);

                System.out.println("Tiket berhasil dipesan!");

            } else if (pilihan == 3) {
                if (jumlahTiket == 0) {
                    System.out.println("\nBelum ada tiket yang dipesan.");
                } else {
                    System.out.println("\n=== Tiket yang Telah Dipesan ===");
                    for (int i = 0; i < jumlahTiket; i++) {
                        System.out.println(tiketList[i]);
                        System.out.println("-------------------------");
                    }
                }

            } else if (pilihan == 4) {
                System.out.println("Selamat Menonton!");
                break;

            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        owd.close();
    }
}
