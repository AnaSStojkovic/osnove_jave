package domaci_14_12_2022;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        // Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
        // Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost x za T1: ");
        int x1 = s.nextInt();
        System.out.println("Unesite vrednost y za T1: ");
        int y1 = s.nextInt();
        System.out.println("Unesite vrednost x za T2: ");
        int x2 = s.nextInt();
        System.out.println("Unesite vrednost y za T2: ");
        int y2 = s.nextInt();
        System.out.println("Unesite vrednost x za M: ");
        int x3 = s.nextInt();
        System.out.println("Unesite vrednost y za M: ");
        int y3 = s.nextInt();
        if ((x1>=x3 || x2>=x3) && (y1>=y3 || y2>=y3) && (x1>=0 && x2>=0 && y1>=0 && y2>=0)) {
            System.out.println("Kliknuto je u okviru login forme za web stranicu.");
        }
        else {
            System.out.println("Nije kliknuto u okviru login forme za web stranicu.");

        }

    }
}
