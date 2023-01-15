package domaci_12_01_2023;

public class Transakcija {
    private String id;
    private Racun prenos;
    private Racun prinos;

    public Transakcija(String id, Racun prenos, Racun prinos) {
        this.id = id;
        this.prenos = prenos;
        this.prinos = prinos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getPrenos() {
        return prenos;
    }

    public void setPrenos(Racun prenos) {
        this.prenos = prenos;
    }

    public Racun getPrinos() {
        return prinos;
    }

    public void setPrinos(Racun prinos) {
        this.prinos = prinos;
    }

    private double provizija(double visinaTransakcije) {
        if (visinaTransakcije <= 4500) {
            double iznosProvizije = 45;
            return iznosProvizije;
        } else {
            double iznosProvizije = visinaTransakcije * 0.01;
            return iznosProvizije;
        }
    }

    public void izvrsiTransakciju(double visinaTranskacije) {

        double novoStanje = getPrenos().stanje(-visinaTranskacije) - provizija(visinaTranskacije);
        double novoStanje2 = getPrinos().stanje(visinaTranskacije);



        System.out.println("Novo stanje na racunu " + this.getPrenos().getImeIPrezime() + " je: " + novoStanje + ". " + "Novo stanje na racunu " + this.getPrinos().getImeIPrezime() + " je: " + novoStanje2);
    }


    public void stampaj() {
        System.out.println("Racun sa " + this.getPrenos().getImeIPrezime() + " - " + this.getPrenos().getBroj());

        System.out.println("Racun na " + this.getPrinos().getImeIPrezime() + " - " + this.getPrinos().getBroj());

    }
}



