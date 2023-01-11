package domaci_10_01_2023;

public class zadatak1 {
    public static void main(String[] args) {
        //Kreirati klasu Autor koja ima
        //-ime i prezime
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu:
        //(ime autora) (prezime autora)
        //
        //Kreirati klasu Knjiga koji ima:
        //-ISBN
        //-naziv
        //-godina izdanja
        //-autor
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
        //(ISBN)
        //(naziv) - (godina izdanja)
        //autor: (ime autora) (prezime autora)
        //
        //	U glavnom programu napraviti vise autora sa vise knjiga.

        Autor nobelovac = new Autor("Ivo", "Andric");
        Knjiga roman = new Knjiga("285-892-748", "Na Drini cuprija",1945);

        roman.setNapisaoJe(nobelovac);
        roman.stampaj();

        Autor politicar = new Autor("Vuk", "Draskovic");
        Knjiga publikacija = new Knjiga("285-852-748", "Noz",1982);

        publikacija.setNapisaoJe(politicar);
        publikacija.stampaj();

        Autor pesnik = new Autor("Jovan", "Jovanovic-Zmaj");
        Knjiga zbirkaPesama = new Knjiga("582-852-652", "Riznica pesama za decu",1890);

        zbirkaPesama.setNapisaoJe(pesnik);
        zbirkaPesama.stampaj();

        Autor matematicar = new Autor("Vene", "Bogoslalov");
        Knjiga zbirka = new Knjiga("285-852-652", "Zbirka resenih zadataka iz matematike",2001);
        zbirka.setNapisaoJe(matematicar);
        zbirka.stampaj();

        Autor pisac = new Autor("Dejan", "Tiago-Stankovic");
        Knjiga knjiga = new Knjiga("485-852-652", "Zamalek",2020);
        knjiga.setNapisaoJe(pisac);
        knjiga.stampaj();


    }
}
