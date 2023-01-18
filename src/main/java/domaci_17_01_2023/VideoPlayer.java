package domaci_17_01_2023;

public class VideoPlayer {
    private int duzina;
    private int trenutnoVreme;
    private int jacinaZvuka;
    private int kvalitet;

    public VideoPlayer(int duzina, int trenutnoVreme, int kvalitet,int jacinaZvuka) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.kvalitet = kvalitet;
        this.jacinaZvuka=jacinaZvuka;
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public void stampaj(){
        System.out.println("Trenutno vreme videa je "+this.trenutnoVreme);
        System.out.println("Jacina zvuka je "+this.jacinaZvuka);
        System.out.println("Kvalitet videa je "+this.kvalitet);
    }
}
