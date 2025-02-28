package TugasPraktikum1;

public class Tiket {
    private int nomorTiket;
    private Film film;
    private Studio studio;
    private int nomorKursi;
    private Penonton penonton;

    public Tiket(int nomorTiket, Film film, Studio studio, int nomorKursi, Penonton penonton) {
        this.nomorTiket = nomorTiket;
        this.film = film;
        this.studio = studio;
        this.nomorKursi = nomorKursi;
        this.penonton = penonton;
    }

    public String toString() {
        return "Nomor Tiket: " + nomorTiket + 
               "\nFilm: " + film.getJudul() + 
               "\nStudio: " + studio.getNomorStudio() + 
               "\nNomor Kursi: " + nomorKursi + 
               "\nNama Penonton: " + penonton.getNamaPenonton();
    }
}
