package domaci_27_12_2022;

public class Proizvod {
   public String naziv;
   public double cena;
   public double tezina;


   public void stampaj() {

      System.out.println(this.naziv+", "+this.cena+" din, "+this.tezina+" g");
      System.out.println(" ");
   }

   public double konvertor(String jedinica) {
      if (jedinica.equals("kg")) {
        double konvertor = this.tezina/1000;
        return konvertor;
              }
      if (jedinica.equals("t")) {
         double konvertor =  this.tezina/1000000;
         return konvertor;
      }
      else {
         return 0;
      }
   }
}
