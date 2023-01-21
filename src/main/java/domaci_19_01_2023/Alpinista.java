package domaci_19_01_2023;

public class Alpinista extends Planinar {
    private int poeni;

    public Alpinista(int ID, String imeIPrezime, int poeni) {
        super(ID, imeIPrezime);
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }


    @Override
    public boolean uspesanUspon(Planina p) {
        if (p.getVisina() <= 4000){
            return true;
    } else

       return false;
    }



    @Override
    public double clanarina() {
        double clanarina = 1500-(this.poeni*50);

            return clanarina;
    }
    @Override
    public void stampaj() {
        System.out.println("Alpinista, ID:"+this.ID);
        System.out.println("Ime i prezime: "+this.imeIPrezime);
        System.out.println("Broj poena: "+this.poeni);

    }
}
