package domaci_16_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak1_dopunaZaVezbanje {
    public static void main(String[] args) {
        // //1.Zadatak
        //        //Kreirati klasu Osoba koja ima:
        //        //ime i prezime
        //        //jmbg
        //        //godinu rodjenja
        //        //default-ni konstuktor
        //        //konstuktor sa parametrima
        //        //gettere i settere
        //        //metodu stampaj koja stampa u formatu:
        //        //(ime i prezime), (jmbg), (godina rodjenja)
        //        //
        //        //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        //        //broj (broj koji igrac nosi)
        //        //poziciju koju igra (odbrambeni, napadac, … )
        //        //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
        //        //default-ni konstuktor
        //        //konstuktor sa parametrima
        //        //gettere i settere za broj, kapiten i poziciju
        //        //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
        //        //
        //        //Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
        //        //godine iskustva
        //        //tip trenera (kondicioni, za igru, pomocni, personalni)
        //        //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
        //        //
        //        //U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
        //        //
        //        //(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
        //
        ////        Igrac igrac1=new Igrac("Aleksandar Mitrovic","1609984500",1994,9,"napadac",false);
        ////        Igrac igrac2=new Igrac("Dusan Tadic","2011988500",1988,10,"napadac",true);
        ////
        ////        Trener trener1 = new Trener("Dragan Stojkovic", "03039658520",1965, 15,"selektor");
        ////        Trener trener2 = new Trener("Kacišuto Kinoši","050698754120",1985,5,"kondicioni");
        //
        ////        igrac1.stampaj();
        ////        igrac2.stampaj();
        ////        trener1.stampaj();
        ////        trener2.stampaj();

        ArrayList<Igrac> igraci=new ArrayList<>();
        ArrayList<Trener>treneri=new ArrayList<>();

        boolean prekidUnosa=false;

        Scanner s = new Scanner(System.in);

        while (!prekidUnosa){
            boolean kapiten=false;
            System.out.println("Unesite ime i prezime igraca: ");
            String imeIprezime= s.next();
            System.out.println("Unesite jmbg: ");
            String jmbg= s.next();
            System.out.println("Unesite godinu rodjenja: ");
            int godinaRodjenja= s.nextInt();
            System.out.println("Unesite broj: ");
            int broj=s.nextInt();
            System.out.println("Unesite poziciju: ");
            String pozicija= s.next();
            System.out.println("Igrac je kapiten?(da/ne)");
            String vrednost= s.next();
            if(vrednost.equals("da")){
                kapiten=true;
            }

            Igrac igrac = new Igrac(imeIprezime,jmbg,godinaRodjenja,broj,pozicija,kapiten);

            igraci.add(igrac);

            System.out.println("Da li zelite da dodate jos igraca?(da/ne)");
            vrednost=s.next();
            if(vrednost.equals("ne")){
                prekidUnosa=true;
            }
        }

        prekidUnosa=false;

        while (!prekidUnosa){
            System.out.println("Unesite ime i prezime trenera: ");
            String imeIprezime= s.next();
            System.out.println("Unesite jmbg: ");
            String jmbg= s.next();
            System.out.println("Unesite godinu rodjenja: ");
            int godinaRodjenja= s.nextInt();
            System.out.println("Unesite godine iskustva: ");
            int godineIskustva=s.nextInt();
            System.out.println("Unesite tip trenera: ");
            String tip= s.next();

            Trener trener = new Trener(imeIprezime,jmbg,godinaRodjenja,godineIskustva,tip);

            treneri.add(trener);

            System.out.println("Da li zelite da dodate jos trenera?(da/ne)");
            String vrednost=s.next();
            if(vrednost.equals("ne")){
                prekidUnosa=true;
            }
        }


        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
        }

        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }

    }
}

