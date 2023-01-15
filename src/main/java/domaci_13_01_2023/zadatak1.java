package domaci_13_01_2023;

import java.util.ArrayList;

public class zadatak1 {
    public static void main(String[] args) {
        //Napisati klasu Student koja ima
        //broj indeksa
        //ime i prezime
        //tip studija (osnovne, master, doktorske)
        //niz ispita
        //konstuktore koje mislite da ce vam trebati
        //gettere i settere za indeks, ime i prezime, tip studija
        //getter za niz predmeta
        //metodu dodaj ispit u niz ispita
        //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
        //metodu stampaj koja stampa u formatu:
        //(broj indeksa) - (ime i prezime) - (tip studija)
        //Predmeti:
        //(naziv predmeta) - (profesor) - (ocena)
        //(naziv predmeta) - (profesor) - (ocena)
        //(naziv predmeta) - (profesor) - (ocena)
        //Prosecna ocena: (prosecna ocena)
        //
        //
        //Napisati klasu Ispit koja ima
        //naziv predmeta
        //ocenu (u rasponu od 5 do 10)
        //Ime i prezime profesora koji predaje predmet
        //konstuktore koje mislite da ce vam trebati
        //gettere i settere za sve atribute
        //metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
        //metodu koja stampa ispit u formatu:
        //(naziv predmeta) - (profesor) - (ocena)



        ArrayList <Student> ispiti =new ArrayList<>();
        Student student = new Student(10258,"Nikola Nikolic","osnovne studije");
        Ispit matematika = new Ispit("Matematika", 7,"Milos Cvetkovic");
        Ispit hemija = new Ispit("Hemija", 8,"Marina Stojanovic");
        Ispit fizika = new Ispit("Fizika", 5,"Mladena Lukic");
        Ispit sociologija = new Ispit("Sociologija", 10,"Vesna Miltojevic");
        Ispit engleski = new Ispit("Engleski jezik",9,"Predrag Nikolic");

        student.dodajIspit(matematika);
        student.dodajIspit(hemija);
        student.dodajIspit(fizika);
        student.dodajIspit(sociologija);
        student.dodajIspit(engleski);

        student.stampaj();
    }
}
