package domaci_27_12_2022;

public class zadatak2 {
    public static void main(String[] args) {
        //Kreirati klasu SmartAirConditioning koja ima:
        //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        //atribut za izabranu temperaturu
        //atribut za mod (hladi/greje) - string
        //metodu za stampu (proizvoljno)
        //metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
        // Metoda kao parametar prima temperaturu koja je napolju.
        //
        //U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

        SmartAirConditioning airConditioning1 = new SmartAirConditioning();
        airConditioning1.markaKlime="Samsung";
        airConditioning1.temperatura=28.5;
        airConditioning1.mod="greje";

        SmartAirConditioning airConditioning2 = new SmartAirConditioning();
        airConditioning2.markaKlime="Vox";
        airConditioning2.temperatura=25.5;
        airConditioning2.mod="hladi";

        SmartAirConditioning airConditioning3 = new SmartAirConditioning();
        airConditioning3.markaKlime="Galanz";
        airConditioning3.temperatura=23.8;
        airConditioning3.mod="hladi";

        airConditioning1.stampaj();
        airConditioning2.stampaj();
        airConditioning3.stampaj();

        Double spoljnaTemperatura = 17.5;

        String informacija = airConditioning1.informacija(spoljnaTemperatura);

        if (spoljnaTemperatura>airConditioning1.temperatura) {
            System.out.println(informacija);
        }
        else {
            System.out.println(informacija);
        }

        spoljnaTemperatura = 35.5;

        informacija = airConditioning2.informacija(spoljnaTemperatura);

        if (spoljnaTemperatura>airConditioning2.temperatura) {
            System.out.println(informacija);
        }
        else {
            System.out.println(informacija);
        }
        spoljnaTemperatura = -5.5;

       informacija = airConditioning3.informacija(spoljnaTemperatura);

        if (spoljnaTemperatura>airConditioning3.temperatura) {
            System.out.println(informacija);
        }
        else {
            System.out.println(informacija);
        }




    }
}
