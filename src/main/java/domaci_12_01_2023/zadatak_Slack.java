package domaci_12_01_2023;

public class zadatak_Slack {
    public static void main(String[] args) {
//        Kreirati klasu Osoba koja ima:
//        ime i prezime
//        oca - objekat klase Osoba
//        majku - objekat klase Osoba
//        getere i setere
//                konstruktore
//        metodu stapmaj, koja stampa podatke u formatu

       Osoba otac = new Osoba("Sasa Stojkovic");
       Osoba majka = new Osoba("Ljiljana Stojkovic");
       Osoba porodica = new Osoba("Ana Stojkovic",otac, majka);

        porodica.stampaj();
    }
}
