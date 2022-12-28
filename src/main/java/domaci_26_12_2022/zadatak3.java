package domaci_26_12_2022;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        //Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja
        // se formira kao na primeru. METODA NISTA NE STAMPA.
        //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
        //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost za a: ");
        int a = s.nextInt();
        System.out.println("Unesite vrednost za b: ");
        int b = s.nextInt();
        String novaVrednost = konvertovanje(a, b);
        System.out.println("Nova vrednost je "+novaVrednost);

    }
    public static String konvertovanje(int a, int b) {
        return a+""+b;

    }
}
