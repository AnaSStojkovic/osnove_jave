package domaci_16_01_2023;

import java.util.ArrayList;

public class Igrac1 extends Osoba1 {
    private int broj;
    private String pozicija;
    private ArrayList<Karton> listaKartona;

    private boolean daLiJeKapiten;

    public Igrac1(){

    }

    public Igrac1(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija,  boolean daLiJeKapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.listaKartona = new ArrayList<>();
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public void dodajKarton(Karton kartoni){
        listaKartona.add(kartoni);
    }
    public int brojZutihKartona(){
        int counterZ=0;
        for (int i = 0; i < listaKartona.size(); i++) {
            if(listaKartona.get(i).getTipKartona().equals("zuti")){
                counterZ=counterZ+1;
            }

        } return counterZ;
    }

    public int brojCrvenihKartona(){
        int counterC=0;
        for (int i = 0; i < listaKartona.size(); i++) {
            if(listaKartona.get(i).getTipKartona().equals("crveni")){
                counterC=counterC+1;
            }

        } return counterC;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Igrac nosi broj: "+this.broj);
        if(this.daLiJeKapiten){
            System.out.println("Igrac je kapiten.");
        } else {
            System.out.println("Igrac nije kapiten.");
        }
        System.out.println("Igrac je "+this.pozicija+".");
        System.out.println("Broj zutih kartona je: "+brojZutihKartona());
        System.out.println("Broj crvenih kartona je: "+brojCrvenihKartona());
    }



}
