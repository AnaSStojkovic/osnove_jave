package domaci_14_12_2022;

import java.util.Scanner;

public class zadatak_za_vezbanje_6 {
    public static void main(String[] args) {

//        6. (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i
//        formira string p (p ima startni deo #) tako sto negativne brojeve lepi
//        sa leve strane a pozitivne i nulu sa desne. Konkatanacija stringova u javi-> Koristan link
//        Primer izvrsenja 1:
//        Unesite a: 10  -> # 10
//        Unesite b: -2   -> -2 # 10
//        Unesite c: -1   -> -1 -2 # 10
//        Unesite d: 9    -> -1 -2 # 10 9
//        String p ime vrednost = -1 -2 # 10 9
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite c: ");
        int c = s.nextInt();
        System.out.println("Unesite d: ");
        int d = s.nextInt();
        String p = "#";
        if (a<0) {
            p = a + p;
        }
        else {
            p=p+a;
        }
        if (b<0) {
            p = b + p;
        }
        else {
            p=p+b;
        }
        if (c<0) {
            p = c + p;
        }
        else {
            p=p+c;
        }
        if (d<0) {
            p = d + p;
        }
        else {
            p=p+d;
        }

        System.out.println("String p ima vrednost: "+ p);
    }

}
