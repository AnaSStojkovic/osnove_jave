package domaci_26_12_2022;

public class zadatak1 {
    public static void main(String[] args) {
        //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
        // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        int x = 10;

        stampajVrednostZa10Vecu(x);
        stampajVrednostZa10Vecu(x+1);
        stampajVrednostZa10Vecu(x+25);
        stampajVrednostZa10Vecu(x+15);
        stampajVrednostZa10Vecu(x-5);



}   public static void stampajVrednostZa10Vecu(int x) {
        System.out.println("Vrednost za 10 veca je: " + (x+10)+".");
    }
}
