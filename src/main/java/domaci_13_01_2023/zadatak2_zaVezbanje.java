package domaci_13_01_2023;

import java.util.ArrayList;

public class zadatak2_zaVezbanje {
    public static void main(String[] args) {

        ArrayList<Kombinacija>kombinacije=new ArrayList<>();

       Kombinacija kombinacija1=new Kombinacija("1",1,2,3,4,5,6,7);
       Kombinacija kombinacija2=new Kombinacija("2",2,4,6,8,10,12,14);
       Kombinacija kombinacija3=new Kombinacija("3",1,3,5,7,9,11,13);
       Kombinacija kombinacija4=new Kombinacija("4",1,2,8,9,2,8,4);
       Kombinacija kombinacija5=new Kombinacija("5",1,3,14,19,22,28,39);
       Kombinacija kombinacija6=new Kombinacija("6",5,12,18,19,20,28,34);
       Kombinacija kombinacija7=new Kombinacija("7",2,12,16,19,21,25,33);

       Kombinacija k=new Kombinacija("x",1,2,8,9,2,8,4);

       Listic listic1=new Listic();
       listic1.dodajKombinaciju(kombinacija1);
       listic1.dodajKombinaciju(kombinacija2);
       listic1.dodajKombinaciju(kombinacija3);
       listic1.dodajKombinaciju(kombinacija4);
       listic1.dodajKombinaciju(kombinacija5);
       listic1.dodajKombinaciju(kombinacija6);
       listic1.dodajKombinaciju(kombinacija7);

        listic1.dobitnaKombinacija(k);
        listic1.stampaj();



    }
}
