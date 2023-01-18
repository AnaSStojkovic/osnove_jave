package domaci_17_01_2023;

public class AudioControl extends Control{

    private boolean zvuk;



    public AudioControl(boolean zvuk) {

        this.zvuk = zvuk;

    }

    public boolean isZvuk() {
        return zvuk;
    }

    public void setZvuk(boolean zvuk) {
        this.zvuk = zvuk;
    }



    @Override
    public void izvrsiAkciju(VideoPlayer video) {

        if (zvuk){
            int novaJacina = video.getJacinaZvuka()+1;
            if (novaJacina>100){
                novaJacina=100;

            }
            video.setJacinaZvuka(novaJacina);
        } else {
            int novaJacina=video.getJacinaZvuka()-1;
            if (novaJacina<0){
                novaJacina=0;
            }
            video.setJacinaZvuka(novaJacina);
        }


    }
}
