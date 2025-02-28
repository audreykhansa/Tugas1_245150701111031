package TugasPraktikum1;

public class Studio {
    private int nomorStudio;
    private int kapasitasKursi;
    private Film filmSedangTayang;

    public Studio(int nomorStudio, int kapasitasKursi, Film filmSedangTayang) {
        this.nomorStudio = nomorStudio;
        this.kapasitasKursi = kapasitasKursi;
        this.filmSedangTayang = filmSedangTayang;
    }

    public int getNomorStudio() {
        return nomorStudio;
    }

    public int getKapasitasKursi() {
        return kapasitasKursi;
    }

    public Film getFilmSedangTayang() {
        return filmSedangTayang;
    }

    public String toString() {
        return "Nomor Studio: " + nomorStudio + "\n" +
               "Kapasitas Kursi: " + kapasitasKursi + "\n" +
               "Film yang Sedang Tayang:\n" + filmSedangTayang;
    }
}
