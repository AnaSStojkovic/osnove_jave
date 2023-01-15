package domaci_12_01_2023;

public class Racun {


    private String broj;
    private String imeIPrezime;
    private double trenutnoStanje;

    public Racun(String broj, String imeIPrezime, double trenutnoStanje) {
        this.broj = broj;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public double stanje(double promene){
        double novoStanje = trenutnoStanje+promene;
        if (novoStanje<0) {
            return trenutnoStanje=0;
        } else {
           return trenutnoStanje=novoStanje;
        }
    }

    public void stampaj(){
        System.out.println(getImeIPrezime()+" - "+getBroj());
        System.out.println("Stanje na racunu je "+getTrenutnoStanje()+" rsd.");
    }


}
