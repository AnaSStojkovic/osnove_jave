package domaci_29_12_2022;

public class zadatak1_Proizvod {
    public static void main(String[] args) {
     //Napisati klasu Proizvod koja ima atribute
     //naziv proizvoda (String)
     //cenu proizvoda (double)
     //težinu proizvoda u gramima. (double)
     //	i metode:
     //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
     //povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
     //vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
     //racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
     //za tezinu do 100g, postarina iznosi 200din
     //za tezinu od 101g do 500g, postarina iznosi 400din
     //za tezinu preko 500g, postarina iznosi 1000din
     //
     //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod proizvodKozmetika=new Proizvod();

       proizvodKozmetika.setNazivProizvoda("Kozmetika");
       proizvodKozmetika.setCenaProizvoda(5500.00);
       proizvodKozmetika.setTezina(55.0);

        Proizvod proizvodSportskiRekviziti=new Proizvod();

        proizvodSportskiRekviziti.setNazivProizvoda("Rekviziti za sport");
        proizvodSportskiRekviziti.setCenaProizvoda(12500.00);
        proizvodSportskiRekviziti.setTezina(550.0);

        Proizvod proizvodIgracke=new Proizvod();

        proizvodIgracke.setNazivProizvoda("Igracke");
        proizvodIgracke.setCenaProizvoda(8500.00);
        proizvodIgracke.setTezina(215.0);

        proizvodKozmetika.stampaj();
        proizvodSportskiRekviziti.stampaj();
        proizvodIgracke.stampaj();

        proizvodKozmetika.povecajCenu(500.75);
        proizvodSportskiRekviziti.povecajCenu(200.50);
        proizvodIgracke.povecajCenu(150.25);

        proizvodKozmetika.stampaj();
        proizvodSportskiRekviziti.stampaj();
        proizvodIgracke.stampaj();

        proizvodKozmetika.vratiCenuSaPopustom(50);
        proizvodIgracke.vratiCenuSaPopustom(85.5);
        proizvodSportskiRekviziti.vratiCenuSaPopustom(42);

       System.out.println("Cena sa popustom je "+proizvodKozmetika.vratiCenuSaPopustom(50));
       System.out.println("Cena sa popustom je "+proizvodIgracke.vratiCenuSaPopustom(85.5));
       System.out.println("Cena sa popustom je "+proizvodSportskiRekviziti.vratiCenuSaPopustom(42));

        proizvodKozmetika.stampaj();
        proizvodSportskiRekviziti.stampaj();
        proizvodIgracke.stampaj();

        proizvodKozmetika.racunajPostarinu();
        proizvodSportskiRekviziti.racunajPostarinu();
        proizvodIgracke.racunajPostarinu();

        System.out.println("Postarina za kozmetiku je "+proizvodKozmetika.racunajPostarinu());
        System.out.println("Postarina za sportske rekvizite je "+ proizvodSportskiRekviziti.racunajPostarinu());
        System.out.println("Postarina za igracke je "+proizvodIgracke.racunajPostarinu());




    }


}
