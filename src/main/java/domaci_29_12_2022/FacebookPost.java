package domaci_29_12_2022;

public class FacebookPost {

    private String imeIPrezimeI;
    private String imeIPrezimeII;
    private String tekstObjave;
    private int brojLajkova;
    private int brojDeljenja;

    public String getImeIPrezimeI(){
        return this.imeIPrezimeI;}
    public void setImeIPrezimeI(String imeIPrezimeI){
        this.imeIPrezimeI=imeIPrezimeI;}

    public String getImeIPrezimeII(){
        return this.imeIPrezimeII;}
    public void setImeIPrezimeII(String imeIPrezimeII){
        this.imeIPrezimeII=imeIPrezimeII;}

    public String getTekstObjave(){
        return this.tekstObjave;}
    public void setTekstObjave(String tekstObjave){
        this.tekstObjave=tekstObjave;}
    public int getBrojLajkova(){
        return this.brojLajkova;}
    public int getBrojDeljenja(){
        return this.brojDeljenja;}


    public void like(){
        this.brojLajkova=this.brojLajkova+1;
    }

    public void disLike() {
        this.brojLajkova = this.brojLajkova - 1;

        if (this.brojLajkova < 1) {
            this.brojLajkova = 0;
        }
    }

    public void share(){
        this.brojDeljenja=this.brojDeljenja+1;
    }

    public void print(){
        System.out.println(imeIPrezimeI+">>>"+imeIPrezimeII);
        System.out.println(tekstObjave);
        System.out.println("Likes: "+this.brojLajkova+" | "+"Shares: "+this.brojDeljenja);
    }
}
