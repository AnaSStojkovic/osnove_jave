package domaci_13_01_2023;

public class Ispit {
    private String nazivPredmeta;
    private int ocene;
    private String imeIPrezimeProfesora;

    public Ispit(String nazivPredmeta, int ocene, String imeIPrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocene = ocene;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcene() {
        return ocene;
    }

    public void setOcene(int ocene) {
        this.ocene = ocene;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public boolean polozenIspit(){
        boolean ispitPolozen;

        if(this.ocene>=6){
           return ispitPolozen=true;

        } else {
           return ispitPolozen=false;
                               }
    }

    public void stampaj(){
        System.out.println(this.nazivPredmeta+" - "+this.imeIPrezimeProfesora+" - "+this.ocene);
    }
}
