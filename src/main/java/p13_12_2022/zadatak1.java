package p13_12_2022;

public class zadatak1 {
    public static void main(String[] args) {
        //Napisati program koji na ekranu stampa podatke u formatu:
        //[IME I PREZIME]
        //[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
        //[EMAIL]
        String imeIPrezime = "Ana Stojkovic";
        String brojTelefona = "0649787948";
        String ulicaIBroj = "Despota Djurdja 2a";
        String  grad = "Nis";
        String email = "anasstojkovic@gmail.com";
        System.out.println(imeIPrezime);
        System.out.println(brojTelefona + ","+" " + ulicaIBroj + ","+" " + grad);
        System.out.println(email);



    }
}
