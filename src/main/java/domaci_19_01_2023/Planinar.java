package domaci_19_01_2023;

public abstract class Planinar {
    protected int ID;
    protected String imeIPrezime;

    public Planinar(int ID, String imeIPrezime) {
        this.ID = ID;
        this.imeIPrezime = imeIPrezime;
    }

    public int getID() {
        return ID;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public abstract void stampaj();
    public abstract double clanarina();
    public abstract boolean uspesanUspon(Planina p);
}
