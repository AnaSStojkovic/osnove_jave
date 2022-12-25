package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        //3.Zadatak
        //Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa
        // sve elemente niza koji su veci od nule.
        //Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: -4
        //Unesite broj: 3
        //Unesite broj: -7
        //Unesite broj: 9
        //
        //Brojevi veci od nule u nizu A su: 1, 3, 9,

        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost za N: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if (broj > 0) {
                A.add(broj);

            }
                 }
        System.out.print("Brojevi veci od nule u nizu A su: " + A + ".");
    }
}
