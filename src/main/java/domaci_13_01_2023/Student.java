package domaci_13_01_2023;

import java.util.ArrayList;

public class Student {

    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;



    private ArrayList<Ispit>listaIspita;


    public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.listaIspita=new ArrayList<>();
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getListaIspita() {
        return listaIspita;
    }

    public void dodajIspit(Ispit ispiti){
        this.listaIspita.add(ispiti);
    }

    public double prosek(){

        double suma=0;
        double counter=0;

        for (int i = 0; i < listaIspita.size(); i++) {

            if(listaIspita.get(i).polozenIspit()) {
                suma=suma+listaIspita.get(i).getOcene();
                counter++;
            }

        } double prosek=suma/counter;
        return prosek;

        }

        public void stampaj(){
            System.out.println(this.getBrojIndeksa()+" - "+this.getImeIPrezime()+" - "+this.getTipStudija());

            for (int i = 0; i < listaIspita.size(); i++) {
                System.out.println(listaIspita.get(i).getNazivPredmeta()+" - "+listaIspita.get(i).getImeIPrezimeProfesora()+"-"+listaIspita.get(i).getOcene());
                
            }
            System.out.println("Prosek ocena polozenih ispita je: "+prosek());
        }
    }

