package domaci_16_01_2023;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac(){

    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
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

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
@Override
    public void stampaj(){
    System.out.println("Igrac: ");
        super.stampaj();
    System.out.println("Igrac nosi broj "+this.broj+", i igra na poziciji "+this.pozicija+".");
    if (this.kapiten){
        System.out.println("Igrac je kapiten.");
    } else {
        System.out.println("Igrac nije kapiten.");
    }
    System.out.println();
    }

}
