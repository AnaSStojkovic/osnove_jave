package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak6_za_vezbanje {
    public static void main(String[] args) {
//        6. (Za vezbanje) Napisati program koji ucitava niz stringova duzine N,
//        tako da ucitavanje elemenata u niz a bude obrnuto.
////        Primer:
////        Unesite N: 4
////        Unesite string: xxx1
////        Unesite string: xxx4
////        Unesite string: xxx6
////        Unesite string: xxx9
////        Niz a: xxx9, xxx6, xxx4, xxx1
////        Komentar: Stanje niza a u memoriji je:
////        a[0]="xxx9",
////        a[1]="xxx6",
////        a[2]="xxx4",
////        a[3]="xxx1",
        ArrayList<String>nizovi=new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite string: ");
            String niz = s.next();
            nizovi.add(niz);
                    }
        for (int i = n-1; i >= 0; i--) {
            System.out.print(nizovi.get(i)+", ");
                  }

    }
}
