package domaci_19_01_2023;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaosnivanja;
    private ArrayList<Planinar>listaPlaninara;

    public PlaninarskiDom(){

    }

    public PlaninarskiDom(String nazivDoma, int godinaosnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaosnivanja = godinaosnivanja;
        this.listaPlaninara = new ArrayList<>();
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public int getGodinaosnivanja() {
        return godinaosnivanja;
    }

    public void setGodinaosnivanja(int godinaosnivanja) {
        this.godinaosnivanja = godinaosnivanja;
    }

    public ArrayList<Planinar> getListaPlaninara() {
        return listaPlaninara;
    }

    public void setListaPlaninara(ArrayList<Planinar> listaPlaninara) {
        this.listaPlaninara = listaPlaninara;
    }

    public void uclaniPlaninara(Planinar p){
        this.listaPlaninara.add(p);
    }

    public int brojUspesnihUspona(Planina planina){
        int counterUspesniHUspona = 0;
        for (int i = 0; i < listaPlaninara.size(); i++) {
            if(listaPlaninara.get(i).uspesanUspon(planina)){
                counterUspesniHUspona=counterUspesniHUspona+1;
            }

        } return counterUspesniHUspona;

    }
    public void izbaciPlaninara(int ID){
        for (int i = 0; i < listaPlaninara.size(); i++) {
            if(listaPlaninara.get(i).getID()==ID){
                listaPlaninara.remove(i);
            }

        }
    }
    public void stampaj(){
        System.out.println("Planinarski dom: "+this.nazivDoma+". Osnovan je "+this.godinaosnivanja+" godine.");
        for (int i = 0; i < listaPlaninara.size(); i++) {
            listaPlaninara.get(i).stampaj();

        }


    }
    public double mesecniPrihod(){

        double sumaClanarina=0.0;
        for (int i = 0; i < listaPlaninara.size(); i++) {

            sumaClanarina = sumaClanarina+listaPlaninara.get(i).clanarina();

        } return sumaClanarina;
    }
}
