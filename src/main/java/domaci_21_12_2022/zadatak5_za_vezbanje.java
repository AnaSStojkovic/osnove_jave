package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zadatak5_za_vezbanje {
    public static void main(String[] args) {
        //5. (Za vezbanje) Napisati program koji ucitava niz a duzine N.
        // Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa
        // niza a kopiraju u niz b, a ostale elemente niza b ispuniti jedinicama.
        // (niz b je iste duzine kao i niz a)
//    Unesite N: 6
//    Unesite broj: 1
//    Unesite broj: 5
//    Unesite broj: 2
//    Unesite broj: 7
//    Unesite broj: 8
//    Unesite broj: -1
//    Niz a: 1, 5, 2, 7, 8, -1
//    Niz b: 1, 5, 2, 1, 1, 1
        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            A.add(broj);
                   }
        System.out.println(A);
        ArrayList<Integer> B = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int brojB = random.nextInt(n);
            B.add(brojB);
        }

        int zadnjeCifre = 1;
        B.set(0, A.get(0));
        B.set(1, A.get(1));
        B.set(2, A.get(2));
        B.set(B.size() - (n-3), zadnjeCifre);
        B.set(B.size() - (n-4), zadnjeCifre);
        B.set(B.size() - (n-5), zadnjeCifre);

        System.out.println(B);
    }
}




