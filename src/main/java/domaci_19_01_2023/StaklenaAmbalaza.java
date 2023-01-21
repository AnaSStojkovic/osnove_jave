package domaci_19_01_2023;

public class StaklenaAmbalaza extends Ambalaza {

    private int kaucija;
    private boolean daLiSePlacaKauija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, int kaucija, boolean daLiSePlacaKauija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKauija = daLiSePlacaKauija;
        this.osnovnaCena = osnovnaCena;
    }


    @Override
    public double cenaArtikla() {
        double cena = 0.0;
        if(daLiSePlacaKauija){
            cena=this.osnovnaCena*1.2+this.kaucija;
        } else{
            cena=this.osnovnaCena*1.2;
        } return cena;
    }

    @Override
    public void stampaj() {
        System.out.println("Staklena Ambalaza: ");
        System.out.println("Naziv artikla je "+this.nazivArtikla);
        System.out.println("Barkod artikla je "+this.barkod);
        if(daLiSePlacaKauija){
            System.out.println("Placa se kaucija.");
        } else {
            System.out.println("Ne placa se kaucija.");
        }
        System.out.println("Cena artikla je "+cenaArtikla());

    }
}
