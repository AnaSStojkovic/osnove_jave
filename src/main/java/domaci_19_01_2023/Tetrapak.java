package domaci_19_01_2023;

import java.sql.SQLOutput;

public class Tetrapak extends Ambalaza{
    private boolean daLiMozeDaSeReciklira;
    private double osnovnaCena;


    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean daLiMozeDaSeReciklira, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiMozeDaSeReciklira = daLiMozeDaSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiMozeDaSeReciklira() {
        return daLiMozeDaSeReciklira;
    }

    public void setDaLiMozeDaSeReciklira(boolean daLiMozeDaSeReciklira) {
        this.daLiMozeDaSeReciklira = daLiMozeDaSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        double cena = 0.0;

        if(daLiMozeDaSeReciklira){
            cena = tezinaPakovanja()*1.5+this.osnovnaCena;
            return cena;
        } else{
            cena = this.osnovnaCena;
        } return cena;
    }

    @Override
    public void stampaj() {
        System.out.println("Tetrapak: ");
        System.out.println("Naziv artikla je "+this.nazivArtikla);
        System.out.println("Barkod artikla je "+this.barkod);
        if(daLiMozeDaSeReciklira){
            System.out.println("Ambalaza moze da se reciklira.");
        } else {
            System.out.println("Ambalaza ne moze da se reciklira.");
        }
        System.out.println("Cena artikla je "+cenaArtikla());

    }
}
