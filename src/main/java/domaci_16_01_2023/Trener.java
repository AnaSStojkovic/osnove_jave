package domaci_16_01_2023;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tipTrenera;



    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj(){
        System.out.println("Trener: ");
        super.stampaj();
        System.out.println("Trener ima "+this.godineIskustva+" godina iskustva, i u pitanju je "+this.tipTrenera+".");
        System.out.println();
    }
}
