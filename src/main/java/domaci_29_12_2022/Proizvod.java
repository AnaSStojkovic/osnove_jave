package domaci_29_12_2022;

public class Proizvod {
    private String nazivProizvoda;
    private double cenaProizvoda;
    private double tezina;

    public String getNazivProizvoda() {
        return this.nazivProizvoda;
    }
    public void setNazivProizvoda (String nazivProizvoda){

        this.nazivProizvoda=nazivProizvoda;
            }

    public double getCenaProizvoda() {

        return this.cenaProizvoda;
    }
    public void setCenaProizvoda(double cenaProizvoda){

        this.cenaProizvoda=cenaProizvoda;
    }

    public double getTezina() {

        return this.tezina;
    }
    public void setTezina(double tezina){

        this.tezina=tezina;
    }

    public void stampaj() {

        System.out.println(this.nazivProizvoda+", "+this.cenaProizvoda+", "+this.tezina+" g");
            }

    public void povecajCenu(double povecanje) {

        this.cenaProizvoda=this.cenaProizvoda+povecanje;
    }

    public double vratiCenuSaPopustom(double popust) {
        double cenaSaPopustom=this.cenaProizvoda-((this.cenaProizvoda*popust)/100);
        return cenaSaPopustom;
    }
    public int racunajPostarinu(){
        if(this.tezina<=100) {
            int postarina=200;
            return postarina;
        }
        if (this.tezina>101 && this.tezina<500){
            int postarina=400;
            return postarina;

        }
        if (this.tezina>500) {
            int postarina=1000;
            return postarina;
        }
        else {
            return 0;
        }

    }
}
