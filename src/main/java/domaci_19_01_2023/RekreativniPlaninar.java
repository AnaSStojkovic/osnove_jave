package domaci_19_01_2023;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    public RekreativniPlaninar(int ID, String imeIPrezime, int tezinaOpreme,String nazivOkruga,double maxUspon) {
        super(ID, imeIPrezime);
        this.tezinaOpreme=tezinaOpreme;
        this.nazivOkruga=nazivOkruga;
        this.maxUspon=maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public double getMaxUspon() {
        return maxUspon;
    }





    @Override
    public boolean uspesanUspon(Planina p) {
        double uspon = this.maxUspon-(this.tezinaOpreme*50);
        if(uspon>p.getVisina()){
return true;
        } else {
            return false;
        }
    }

    @Override
    public double clanarina() {
        return 1000.0;
    }
    @Override
    public void stampaj() {
        System.out.println("Rekreativac, ID:"+this.ID);
        System.out.println("Ime i prezime: "+this.imeIPrezime);
        System.out.println("Okrug: "+this.nazivOkruga);

    }

}
