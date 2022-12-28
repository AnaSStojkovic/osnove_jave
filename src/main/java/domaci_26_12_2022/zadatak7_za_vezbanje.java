package domaci_26_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak7_za_vezbanje {
    public static void main(String[] args) {
        //(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
        //
        //Primer izvrsenja:
        //izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
        //izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost za m: ");
        int m = s.nextInt();
        System.out.println("Unesite vrednost za n: ");
        int n = s.nextInt();

        ArrayList<Integer> niz = new ArrayList<Integer>();

        for (int i = m; i <= n ; i++) {

            niz.add(i);
        }
        System.out.println(niz);
        int rezultat=rezultat(n,m);

        System.out.println("Izbroji "+(m+","+n)+" ima za rezultat "+rezultat+".");
    }
   public static int rezultat (int n, int m) {
        int rezultat = n-m-1;
        return rezultat;
    }
}
