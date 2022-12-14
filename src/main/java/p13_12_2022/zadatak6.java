package p13_12_2022;

public class zadatak6 {
    public static void main(String[] args) {
        //Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
        //Primer izvrsenja:
        //a: 5
        //Povrsina kvadrata je 25
        //r: 3
        //Povrsina kruga je 28.26
        int a = 5;
        int povrsinaKvadrata = a * a;
        double r = 3;
        double pi = 3.14;
        double povrsinaKruga = r * r * pi;
        System.out.println("a: "+a);
        System.out.println("Povrsina kvadrata je "+povrsinaKvadrata);
        System.out.println("r: "+r);
        System.out.println("Povrsina kruga je "+povrsinaKruga);
    }
}
