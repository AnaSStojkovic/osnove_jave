package projekat_XO;

import java.util.Scanner;

public class projekat_XO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       XO_tabla igrica=new XO_tabla();

        System.out.print("Unesite ime za igraca X: ");
        String imeX= s.next();
        System.out.print("Unesite ime za igraca O: ");
        String imeO= s.next();

       igrica.setImeXIgraca(imeX);
       igrica.setImeOIgraca(imeO);

       igrica.pokreniIgru();

       while(!igrica.popunjenaTabla() && !igrica.pobednikX() && !igrica.pobednikO()) {
           igrica.stampaj();
           String igrac=igrica.getNaPotezu();
           System.out.println("Sledeci na potezu je "+igrac+". Unesite polje koje zelite da odigrate: ");

           int polje= s.nextInt();

           if (!igrica.poljePrazno(polje)) {

               System.out.println("Potez nije validan!");
           } else {
               igrica.odigrajPotez(polje);
               igrica.zameniIgraca();
           }
       }

       igrica.stampaj();

       if (igrica.pobednikX()){
           System.out.println("Pobednik je igrac X.");
       }
       else if (igrica.pobednikO()){
            System.out.println("Pobednik je igrac O.");
        } else {
           System.out.println("Nereseno je.");
       }
    }
}
