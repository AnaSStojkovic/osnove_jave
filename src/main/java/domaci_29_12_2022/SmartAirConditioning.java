package domaci_29_12_2022;

public class SmartAirConditioning {
    private String marka;
    private int potrosnjaKadaHladi;
    private int potrosnjaKadaGreje;
    private int temperatura;
    private String mod;

    public String getMarka(){return this.marka;}
    public void setMarka(String marka){this.marka=marka;}

    public int getPotrosnjaKadaHladi(){return this.potrosnjaKadaHladi;}
    public void setPotrosnjaKadaHladi(int potrosnjaKadaHladi){this.potrosnjaKadaHladi=potrosnjaKadaHladi;}

    public int getPotrosnjaKadaGreje(){return this.potrosnjaKadaGreje;}
    public void setPotrosnjaKadaGreje(int potrosnjaKadaGreje){this.potrosnjaKadaGreje=potrosnjaKadaGreje;}
    public int getTemperatura(){return this.temperatura;}
    public void setTemperatura(int temperatura){this.temperatura=temperatura;}

    public String getMod(){return this.mod;}
    public void setMod(String mod){this.mod=mod;}

    public void print(){
        System.out.println(this.marka+" - "+this.mod+" - "+this.temperatura);
    }

    public int potrosnja(String mod) {
        if (mod.equals("hladi")) {
         int potrosnja=30*15*this.potrosnjaKadaHladi;
            return potrosnja;
        }
        if (mod.equals("greje")) {
            int potrosnja=30*15*this.potrosnjaKadaGreje;
            return  potrosnja;
        } else{
            return 0;
        }
            }

    public int racunZaStruju(int potrosnja) {
        if (potrosnja>350){
       int racunZaStruju=(350*6)+((potrosnja-350)*9);
       return racunZaStruju;
    }
        else {
            int racunZaStruju=potrosnja*6;
            return racunZaStruju;
        }
        }

}
