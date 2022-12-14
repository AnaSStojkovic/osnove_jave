package domaci_13_12_2022;

import java.sql.SQLOutput;
import java.util.function.ObjIntConsumer;

public class zadatak4 {
    public static void main(String[] args) {

        // Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73.
        // Za stranicu trougla postavite proizvoljnu vrednost.
        //Primer izvrsenja programa:
        //a: 10
        //Povrsina je 43.25
        //Obim je 30
        int a =10;
        double korenBrojaTri = 1.73;
        double povrsinaTrougla = (a*a*korenBrojaTri) / 4;
        int obimTrougla = a*3;

        System.out.println("a: "+a);
        System.out.println("Povrsina je "+povrsinaTrougla);
        System.out.println("Obim je "+obimTrougla);
    }
}
