package domaci_10_01_2023;

public class Proizvod {
    private String nazivProizvoda;

    private double cenaIzrade;


    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }


    public Proizvod(String nazivProizvoda, int cenaIzrade) {
        this.nazivProizvoda = nazivProizvoda;
        this.cenaIzrade = cenaIzrade;

    }

    public Kupac musterija;

    public void setMusterija(Kupac musterija) {
        this.musterija = musterija;
    }

    public double cenaProizvoda() {
        if (this.musterija.clanskaKarta != null) {
            double cenaProizoda = this.cenaIzrade * 1.9 * (100 - this.musterija.clanskaKarta.getPopust()) / 100;
            return cenaProizoda;
        } else {
            return 0;
        }
    }

    public void stampaj() {
        System.out.println("NAZIV PROIZVODA JE: " + this.nazivProizvoda);
        System.out.println("CENA PROIZVODA JE: " + this.cenaProizvoda());

    }
}



