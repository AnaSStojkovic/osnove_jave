package domaci_29_12_2022;

public class zadatak3_ZaVezbanje_SmartAirConditioning {
    public static void main(String[] args) {
        //3. (ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
        //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        //atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
        //atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
        //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
        //atribut za mod (hladi/greje)
        //metodu za stampu - stampa u formatu
        //marka - mod - termperatura
        //metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
        //30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
        //metodu koja racuna koliko klima novca potrosi za mesec dana
        //Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
        //Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
        //Metoda vraca ukupnu cenu za taj mesec
        //
        //U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

        SmartAirConditioning toplotniKomfor= new SmartAirConditioning();

        toplotniKomfor.setMarka("Samsung");
        toplotniKomfor.setPotrosnjaKadaHladi(1);
        toplotniKomfor.setPotrosnjaKadaGreje(2);
        toplotniKomfor.setTemperatura(20);
        toplotniKomfor.setMod("hladi");

        toplotniKomfor.print();


        System.out.println("Potrosnja kada greje je "+toplotniKomfor.potrosnja("greje")+"kW/h.");
        System.out.println("Potrosnja kada hladi je "+toplotniKomfor.potrosnja("hladi")+"kW/h.");


        System.out.println("Racuna za struju kada greje je "+toplotniKomfor.racunZaStruju(toplotniKomfor.potrosnja("greje"))+" din.");
        System.out.println("Racuna za struju kada hladi je "+toplotniKomfor.racunZaStruju(toplotniKomfor.potrosnja("hladi"))+" din.");

    }
}
