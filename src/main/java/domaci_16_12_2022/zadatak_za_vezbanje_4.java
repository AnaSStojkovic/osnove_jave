package domaci_16_12_2022;

import java.util.Scanner;

public class zadatak_za_vezbanje_4 {
    public static void main(String[] args) {
        // (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
        //Primer izvrsenja:
        //Unesite dimenziju table: 5
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dimenziju tabele:");
        int dimenzijeTabele = s.nextInt();
        for (int i = 1; i <= dimenzijeTabele*dimenzijeTabele; i++) {
            System.out.print("_|");
            if ((i % dimenzijeTabele) == 0) {
                System.out.println("\n");

            }
        }
    }
}
