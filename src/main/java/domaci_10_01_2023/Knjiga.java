package domaci_10_01_2023;

public class Knjiga {
    private String isbn;
    private String naziv;
    private int godina;

    private Autor napisaoJe;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Autor getNapisaoJe() {
        return napisaoJe;
    }

    public void setNapisaoJe(Autor napisaoJe) {
        this.napisaoJe = napisaoJe;
    }

    public Knjiga(String isbn, String naziv, int godina) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godina = godina;

    }

    public void stampaj(){
        System.out.println("ISBN je: "+this.isbn);
        System.out.println("NAZIV KNJIGE: "+this.naziv+" - GODINA IZDANJA: "+this.godina);
        this.napisaoJe.stampaj();
        System.out.println();
    }
}
