package domaci_14_12_2022;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        //Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
        // (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu
        // odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
        //Primer 1:                                              Primer 2:
        //Unestite a: 6                                        Unestite a: 6
        //Unesite b: 3                                         Unesite b: 3
        //Unesite operator: +                             Unesite operator: /
        //Rezultat: 9                                           Rezultat: 2
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost za a:");
        int a = s.nextInt();
        System.out.println("Unesite vrednost za b:");
        int b = s.nextInt();
        System.out.println("Unesite operator:");
        String operator = s.next();
        int c=0;
        if (operator.equals("+")) {
                c = a+b;
            System.out.println("Rezultat: "+c);
                           }
        else if (operator.equals("-")) {
          c = a-b;
            System.out.println("Rezultat: "+c);
                  }
        else if (operator.equals("*")) {
            c = a*b;
            System.out.println("Rezultat: "+c);
                 }
        else if (operator.equals("/")) {
           c = a/b;
            System.out.println("Rezultat: "+c);
                  }
        else {
            System.out.println("Uneli ste pogresan operator.");
        }








    }
}
