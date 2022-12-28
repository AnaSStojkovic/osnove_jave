package domaci_27_12_2022;

public class zadatak1 {
    public static void main(String[] args) {
        //Napisati klasu Proizvod koja ima atribute
        //naziv proizvoda (String)
        //cenu proizvoda (double)
        //težinu proizvoda u gramima. (double)
        //	i metode:
        //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da
        // konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
        //Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
        //Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
        //
        //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

        Proizvod proizvodSecer = new Proizvod();

        proizvodSecer.naziv = "secer";
        proizvodSecer.cena = 252.5;
        proizvodSecer.tezina = 1552.0;

        Proizvod proizvodSo = new Proizvod();
        proizvodSo.naziv = "so";
        proizvodSo.cena = 368.4;
        proizvodSo.tezina = 1452.3;

        Proizvod proizvodBrasno = new Proizvod();
        proizvodBrasno.naziv = "brasno";
        proizvodBrasno.cena = 238.7;
        proizvodBrasno.tezina = 1352.8;

        proizvodSecer.stampaj();
        proizvodSo.stampaj();
        proizvodBrasno.stampaj();

        String jedinica = "t";

        double konvertor = proizvodSecer.konvertor(jedinica);

        if (jedinica.equals("kg")) {
            System.out.println("Tezina u kilogramima je "+konvertor+" kg.");
        }
        else if (jedinica.equals("t")) {
            System.out.println("Tezina u tonama je "+konvertor+" t.");
        }
        else {
            System.out.println("Unesena je pogresna jedinica.");
        }

        jedinica = "kg";

        konvertor = proizvodSo.konvertor(jedinica);

        if (jedinica.equals("kg")) {
            System.out.println("Tezina u kilogramima je "+konvertor+" kg.");
        }
        else if (jedinica.equals("t")) {
            System.out.println("Tezina u tonama je "+konvertor+" t.");
        }
        else {
            System.out.println("Unesena je pogresna jedinica.");
        }

        jedinica = " ";

        konvertor = proizvodBrasno.konvertor(jedinica);

        if (jedinica.equals("kg")) {
            System.out.println("Tezina u kilogramima je "+konvertor+" kg.");
        }
        else if (jedinica.equals("t")) {
            System.out.println("Tezina u tonama je "+konvertor+" t.");
        }
        else {
            System.out.println("Unesena je pogresna jedinica.");
        }
    }
}
