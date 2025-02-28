package TugasPraktikum1;

public class Film {
    private String judul;
    private String genre;
    private String jamTayang;
    private int hargaTiket;

    public Film(String judul, String genre, String jamTayang, int hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.jamTayang = jamTayang;
        this.hargaTiket = hargaTiket;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public String toString() {
        return "Judul: " + judul + "\n" +
               "Genre: " + genre + "\n" +
               "Jam Tayang: " + jamTayang + "\n" +
               "Harga Tiket: Rp" + hargaTiket;
    }
}
