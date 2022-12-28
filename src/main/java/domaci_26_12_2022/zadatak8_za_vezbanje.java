package domaci_26_12_2022;

import java.util.Scanner;

public class zadatak8_za_vezbanje {
    public static void main(String[] args) {
        //(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
        // U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite x: ");
        int x = s.nextInt();
        System.out.println("Unesite y: ");
        int y = s.nextInt();
        System.out.println("Unesite z: ");
        int z = s.nextInt();

        System.out.println("Najmanji broj je "+najmanjiBroj(x,y,z)+".");
    }

    public static int najmanjiBroj(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
                    }
        else if (y < x && y < z) {
            return y;
        }
        else {
            return z;
        }
    }
}
