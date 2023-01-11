package domaci_10_01_2023;

public class Kupac {
    private String imeKupca;
    private String prezimeKupca;

       public String getImeKupca() {
        return imeKupca;
    }
    public void setImeKupca(String imeKupca) {
        this.imeKupca = imeKupca;
    }

    public String getPrezimeKupca() {
        return prezimeKupca;
    }

    public void setPrezimeKupca(String prezimeKupca) {
        this.prezimeKupca = prezimeKupca;
    }

    public Kupac(String imeKupca, String prezimeKupca) {
        this.imeKupca = imeKupca;
        this.prezimeKupca = prezimeKupca;
    }
    public ClanskaKarta clanskaKarta;

       public void setClanskaKarta(ClanskaKarta clanskaKarta){
           this.clanskaKarta=clanskaKarta;
       }

    public void stampaj(){
        System.out.println("IME I PREZIME KUPCA - BROJ KARTICE: "+this.imeKupca+" "+this.prezimeKupca+"-"+this.clanskaKarta.getBrojKartice());
    }

}
