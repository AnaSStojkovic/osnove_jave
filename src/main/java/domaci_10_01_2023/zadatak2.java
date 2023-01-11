package domaci_10_01_2023;

public class zadatak2 {
    public static void main(String[] args) {
        //2. Zadatak (POGLEDAJ SLIKU)
        //Kreirati klasu Proizvod koja ima
        //Naziv proizvoda
        //kupca/musteriju
        //cenu izrade proizvoda
        //gettere i settere
        //konstruktore
        //Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
        //cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
        //Metodu za stampanje proizvoda u formatu:
        //naziv proizvoda - cena
        //ime i prezime - broj kartice
        //
        //Kreirati klasu Kupac koja ima:
        //ime i prezime
        //clansku kartu
        //gettere i settere, clanska karta ne moze da se menja
        //konstruktore
        //metodu stampaj koja stampa u formatu
        //ime i prezime - broj kartice
        //
        //Kreirati klasu ClanskaKarta koja ima:
        //popust (u rasponu od 5 do 10 %)
        //broj kartice (npr: 9329-0239)
        //gettere i setter
        //konstuktore

        Proizvod telefon = new Proizvod("Samsung A 50", 150);
        Kupac ana = new Kupac("Ana", "Stojkovic");
        ClanskaKarta loyality = new ClanskaKarta(50,"50-852-987");
        ana.setClanskaKarta(loyality);
        telefon.setMusterija(ana);

        ana.stampaj();
        telefon.stampaj();

        Proizvod jakna = new Proizvod("Kozna jakna", 150);
        Kupac marija = new Kupac("Marija", "Stojkovic");
        ClanskaKarta zaPopust = new ClanskaKarta(20,"50-852-258");
        marija.setClanskaKarta(zaPopust);
        jakna.setMusterija(marija);

        marija.stampaj();
        jakna.stampaj();


    }
}
