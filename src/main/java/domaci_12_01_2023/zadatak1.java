package domaci_12_01_2023;

import java.util.ArrayList;

public class zadatak1 {
    public static void main(String[] args) {
        //1. Zadatak
        //Kreirati klasu ZeleniKarton koja ima:
        //ime i prezime studenta
        //broj indeksa
        //naziv predmeta
        //ime i prezime profesora
        //ocenu - od 5 do 10
        //gettere i settere
        //konstruktore
        //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
        //metodu stampaj koja stampa podatke u formatu:
        //		(naziv predmeta) - (ocena)
        //		Student: ime i prezime, broj indeksa
        //		Profesor: ime i prezime
        //
        //	U glavnoj klasi:
        //kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
        //(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
        //(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

        ZeleniKarton karton1 = new ZeleniKarton("Pera Peric", 23124,"Matematika", "Milos Cvetkovic",5);
        ZeleniKarton karton2 = new ZeleniKarton("Mika Peric", 23125, "Hemija","Ana Bijelic",6);
        ZeleniKarton karton3 = new ZeleniKarton("Jovan Jovanovic",23126, "Fizika","Mladena Lukic", 7);
        ZeleniKarton karton4 = new ZeleniKarton("Marko Markovic",23127,"Sociologija", "Vesna Miltojevic", 10);
        ZeleniKarton karton5 = new ZeleniKarton("Jovana Jovanovic",23128, "Racunarska tehnika","Bojana Zlatkovic",8);
        ZeleniKarton karton6 = new ZeleniKarton("Milena Stankovic", 23129, "Osnovi sistema zastite", "Jelena Malenovic", 9);
        ZeleniKarton karton7 = new ZeleniKarton("Ana Mitic", 23130, "Pravni osnovi zastita", "Aleksandra Ilic",10);
        ZeleniKarton karton8 = new ZeleniKarton("Marija Stosic",23131, "Inzenjerska grafika", "Ivan Mijailovic",8);
        ZeleniKarton karton9 = new ZeleniKarton("Andjela Jevtic",23132, "Engleski jezika", "Predrag Niketic",7);
        ZeleniKarton karton10 = new ZeleniKarton("Milica Mitic", 23133, "Ekonomika zastite", "Tamara Radjenovic",9);

        ArrayList<ZeleniKarton> kartoni = new ArrayList<>();

        kartoni.add(karton1);
        kartoni.add(karton2);
        kartoni.add(karton3);
        kartoni.add(karton4);
        kartoni.add(karton5);
        kartoni.add(karton6);
        kartoni.add(karton7);
        kartoni.add(karton8);
        kartoni.add(karton9);
        kartoni.add(karton10);

        for (int i = 0; i < kartoni.size(); i++) {

            kartoni.get(i).stampaj();

        }
        double suma = 0;

        for (int i = 0; i < kartoni.size(); i++) {

            kartoni.get(i).getOcena();
            suma = suma+kartoni.get(i).getOcena();
        }
        System.out.println("Prosecna ocena je: "+suma/ kartoni.size());


        ArrayList<ZeleniKarton> polozeniIspiti=new ArrayList<>();
        double suma2 = 0;
        int counterPolozeni =0;

        for (int i = 0; i < kartoni.size() ; i++) {

            if (kartoni.get(i).polozenIspit()==true){
                polozeniIspiti.add(kartoni.get(i));
                counterPolozeni=counterPolozeni+1;
            }
        }

        for (int i = 0; i < counterPolozeni; i++) {
            suma2=suma2+polozeniIspiti.get(i).getOcena();
        }
        System.out.println("Prosecna ocena polozenih ispita je: "+suma2/counterPolozeni);
        }
}
