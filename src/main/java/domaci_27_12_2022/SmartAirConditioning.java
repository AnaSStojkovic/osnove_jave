package domaci_27_12_2022;

public class SmartAirConditioning {
    public String markaKlime;
    public double temperatura;
    public String mod;

    public void stampaj() {

        System.out.println("Marka klime je "+this.markaKlime+".");
        System.out.println("Izabrana temperatura je "+this.temperatura+ " stepeni.");
        System.out.println("Izabrani mod je "+this.mod+".");
        System.out.println("");
    }

    public String informacija(double spoljnaTemperatura) {
        if (spoljnaTemperatura>this.temperatura) {
            return "Napolju je veca temperatura.";
        }
        else {
            return "Napolju nije veca temperatura.";
        }
    }

}
