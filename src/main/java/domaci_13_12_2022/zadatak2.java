package domaci_13_12_2022;

public class zadatak2 {
    public static void main(String[] args) {

        //Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
        // Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica,
        // kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica
        // mrdne i nije u liniji to ce zavisiti od duzine imena.
        //Napomena: svaka informacija mora da bude u okviru posebne promenljive.

        String creditCard = "Credit Card";
        String IdCreditCard = "1234 4321 5678 8765";
        String validDate = "valid > 02/24";
        String nameAndSurname = "Ana Stojkovic";
        System.out.println("******************************************");
        System.out.println("*  "+creditCard+"                        *");
        System.out.println("*     ****                               *");
        System.out.println("*     ****                               *");
        System.out.println("*        "+IdCreditCard+"                *");
        System.out.println("*                  "+validDate+"         *");
        System.out.println("*                                        *");
        System.out.println("*    "+nameAndSurname+"                  *");
        System.out.println("******************************************");


    }
}
