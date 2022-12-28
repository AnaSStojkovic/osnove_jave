package domaci_26_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite JMBG: ");
        String JMBG = s.next();
        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();
        System.out.println("Unesite vrednost za aktivnog clana/true ili neaktivnog/false: ");
        boolean aktivnost = s.hasNext();

        podaciOKorisniku(JMBG, ime, prezime, godinaRodjenja, aktivnost);
    }
    public static void podaciOKorisniku(String JMBG, String ime, String prezime, int godinaRodjenja, boolean aktivnost) {
        System.out.println("JMBG: "+JMBG);
        System.out.println("Ime: "+ime);
        System.out.println("Prezime: "+prezime);
        System.out.println("God. rodjenja: "+godinaRodjenja);
        System.out.println("Aktivan: "+aktivnost);

    }
}
