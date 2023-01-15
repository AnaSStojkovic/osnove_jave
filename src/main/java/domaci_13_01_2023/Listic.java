package domaci_13_01_2023;

import java.util.ArrayList;

public class Listic {

    private ArrayList<Kombinacija> listaKombinacija = new ArrayList<>();


    public void dodajKombinaciju(Kombinacija kombinacija) {

        listaKombinacija.add(kombinacija);

    }

    public boolean dobitnaKombinacija(Kombinacija dobitnaKombinacija) {

        for (int i = 0; i < listaKombinacija.size(); i++) {
            if (listaKombinacija.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)) {
                return true;

            }
        }
        return false;

    }

    public void stampaj() {

        for (int i = 0; i < listaKombinacija.size(); i++) {
            listaKombinacija.get(i).stampaj();
        }


    }


}

