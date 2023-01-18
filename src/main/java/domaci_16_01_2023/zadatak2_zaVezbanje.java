package domaci_16_01_2023;

public class zadatak2_zaVezbanje {
    public static void main(String[] args) {
        //(Za vezbanje)
        //2. Zadatak
        //Kreirati klasu Karton koja ima:
        //tip kartona (crveni, zuti)
        //konstuktore za koje mislite da ce vam trebati
        //gettere i settere za karton
        //
        //Kreirati klasu Osoba koja ima:
        //ime i prezime
        //jmbg
        //godinu rodjenja
        //default-ni konstuktor
        //konstuktor sa parametrima
        //gettere i settere
        //metodu stampaj koja stampa u formatu:
        //(ime i prezime), (jmbg), (godina rodjenja)
        //
        //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        //broj (broj koji igrac nosi)
        //poziciju koju igra (odbrambeni, napadac, … )
        //niz kartona
        //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
        //default-ni konstuktor
        //konstuktor sa parametrima
        //gettere i settere za broj, kapiten i poziciju
        //metodu dodaj karton, gde se dodaje karton u niz
        //metodu koja vraca broj zutih kartona
        //metodu koja vraca broj crvenih kartona
        //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
        //
        //
        //U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

        Igrac1 i = new Igrac1("Aleksandar Mitrovic","1609984500",1994,9,"napadac",false);

        Karton k1 = new Karton("zuti");
        Karton k2 = new Karton("crveni");


        i.dodajKarton(k1);
        i.dodajKarton(k2);
        i.dodajKarton(k1);
        i.dodajKarton(k1);
        i.dodajKarton(k1);
        i.dodajKarton(k2);

        i.stampaj();
    }
    }

