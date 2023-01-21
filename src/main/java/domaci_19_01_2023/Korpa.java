package domaci_19_01_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza>listaAmbalaze;
    private SuperKartica sk;

    public Korpa() {
        this.listaAmbalaze = new ArrayList<>();
    }
    public void dodajAmbalazu(Ambalaza a){
        listaAmbalaze.add(a);

    }

    public SuperKartica getSk() {
        return sk;
    }

    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < listaAmbalaze.size(); i++) {
            if(listaAmbalaze.get(i).getBarkod().equals(barkod)){
                listaAmbalaze.remove(i);
            }

        }
    }
    private double cenaSaPopustom(int popust){
        double cenaSaPopustom=0.0;
        double sumaCenaSaPopustom=0.0;

        for (int i = 0; i < listaAmbalaze.size(); i++) {
            cenaSaPopustom=listaAmbalaze.get(i).cenaArtikla()-popust;
            sumaCenaSaPopustom=sumaCenaSaPopustom+cenaSaPopustom;

        } return sumaCenaSaPopustom;
    }

    public double ukupnaCena(SuperKartica sk){
        double ukupnaSuma=0.0;

        for (int i = 0; i < listaAmbalaze.size(); i++) {

            ukupnaSuma=ukupnaSuma+listaAmbalaze.get(i).cenaArtikla();



        }return ukupnaSuma+cenaSaPopustom(sk.getPopust());
    }
}
