package domaci_26_12_2022;

import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        //Zadatak
        //Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
        // Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB)
        // a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
        //Primer poziva funkcija:
        //Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
        //Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
        //Primer izvrsenja main programa:
        //Unesite vrednost u eurima: 3
        //Unesite valutu za konverziju: RSD
        //3 EUR je 351.6339 RSD
        //Konverzija eura u druge valute:
        //1 EUR = 117.5 RSD
        //1 EUR = 1.1 USD
        //1 EUR = 62.98 RUB
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u evrima: ");
        int vrednostEvri = s.nextInt();
        System.out.println("Unesite valutu za konverziju: ");
        String valuta = s.next();

        double iznos = menjacnica(vrednostEvri, valuta);

        System.out.println(vrednostEvri+" EUR je "+iznos+" "+valuta+".");

    }
    public static double menjacnica (int vrednostEvri, String valuta) {
        if (valuta.equals("RSD")) {
            return vrednostEvri * 117.5;
        }
        if (valuta.equals("RUB")) {
            return vrednostEvri * 62.98;
        }
        if (valuta.equals("USD")) {
            return vrednostEvri * 1.1;
        } else {
            return 0;
        }

    }

}
