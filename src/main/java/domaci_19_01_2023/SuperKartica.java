package domaci_19_01_2023;

public class SuperKartica {
    private String brojKartice;
    private String imeIPrezimeVlasnika;
    private int popust;

    public SuperKartica(){

    }

    public SuperKartica(String brojKartice, String imeIPrezimeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIPrezimeVlasnika() {
        return imeIPrezimeVlasnika;
    }

    public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampaj(){
        System.out.println("Super Kartica");
        System.out.println(brojKartice+", "+this.imeIPrezimeVlasnika);
    }
}
