package domaci_21_12_2022;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        //4.. Napisati program koji ucitava niz A duzine N i broj X.
        // Nakon unosa treba ispisati indekse onih clanova niza koji
        // su jednaki broju X.
        //	Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 7
        //Unesite broj: 3
        //Unesite broj: 9
        //Unesite X: 3
        //
        //Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
        //1, 3
        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost za N: ");
        int n = s.nextInt();
        int broj = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            A.add(broj);
        }
        System.out.print("Unesite X: ");
        int x = s.nextInt();

        for (int i = 0; i < n; i++) {
            if (A.get(i)==A.get(x)) {
                System.out.print(i+", ");
            }

        }
    }
}










