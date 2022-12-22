package domaci_20_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        //Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
        // sve dok korisnik ne unese KRAJ..
//        Primer izvrsenja:
//        Unesite rimski broj: X
//        Arapski: 10
//        Unesite rimski broj: C
//        Arapski: 50
//        Unesite rimski broj: D
//        Arapski: 500
//        Unesite rimski broj: M
//        Arapski: 1000
//        Unesite rimski broj: I
//        Arapski: 1
//        Unesite rimski broj: KRAJ
//        Kraj programa.

        Scanner s = new Scanner(System.in);
        String unos = "Ana";

        while (!unos.contains("KRAJ")) {
            System.out.print("Unesite rimski broj: ");
            unos = s.next();
            if (unos.contains("I")) {
                unos = "1";
                System.out.println("Arapski: " + unos);
            }
            if (unos.contains("V")) {
                unos = "5";
                System.out.println("Arapski: " + unos);
            }
            if (unos.contains("X")) {
                unos = "10";
                System.out.println("Arapski: " + unos);
            }
            if (unos.contains("L")) {
                unos = "50";
                System.out.println("Arapski: " + unos);
            }
            if (unos.contains("C")) {
                unos = "100";
                System.out.println("Arapski: " + unos);
            }
            if (unos.contains("D")) {
                unos = "500";
                System.out.println("Arapski: " + unos);
            }
            if (unos.contains("M")) {
                unos = "1000";
                System.out.println("Arapski: " + unos);
            }
        }

        System.out.println("Kraj programa.");
    }
}
