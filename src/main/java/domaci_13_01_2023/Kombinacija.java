package domaci_13_01_2023;

import java.util.ArrayList;

public class Kombinacija {
    private String id;
    private int prvi;
    private int drugi;
    private int treci;
    private int cetvrti;
    private int peti;
    private int sesti;
    private int sedmi;
    private ArrayList<Kombinacija> kombinacija;

    public Kombinacija(String id, int prvi, int drugi, int treci, int cetvrti, int peti, int sesti, int sedmi) {
        this.id = id;
        this.prvi = prvi;
        this.drugi = drugi;
        this.treci = treci;
        this.cetvrti = cetvrti;
        this.peti = peti;
        this.sesti = sesti;
        this.sedmi = sedmi;
        this.kombinacija = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public int getPrvi() {
        return prvi;
    }

    public int getDrugi() {
        return drugi;
    }

    public int getTreci() {
        return treci;
    }

    public int getCetvrti() {
        return cetvrti;
    }

    public int getPeti() {
        return peti;
    }

    public int getSesti() {
        return sesti;
    }

    public int getSedmi() {
        return sedmi;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        for (int i = 0; i < kombinacija.size(); i++) {
            if (k.kombinacija.get(i) != this.kombinacija.get(i)) {
                return false;
            }
        }
        return true;

    }
    public void stampaj(){
        System.out.println("ID: "+getId());
        System.out.println("Brojevi: "+this.getPrvi()+", "+this.getDrugi()+", "+this.getTreci()+", "+this.getCetvrti()+", "+this.getPeti()+", "+this.getSesti()+", "+this.getSedmi());
    }
}
