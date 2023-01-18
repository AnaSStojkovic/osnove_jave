package domaci_17_01_2023;

public class QualityOptimizerControl extends Control {
    private int brzinaInterneta;



    public QualityOptimizerControl(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;

    }

    public int getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }



    @Override
    public void izvrsiAkciju(VideoPlayer video) {

        double brzina=brzinaInterneta*10.1;
        int kvalitet =0;

        if (brzina<144){
            kvalitet=144;
        }

        else if (brzina<240) {
            kvalitet=240;
            
        } else if(brzina<360){
            kvalitet=360;
            
        } else if (brzina<480) {
            kvalitet=480;
            
        } else if (brzina<720) {
            kvalitet=720;
        } else if (brzina<1080) {
            kvalitet=1080;
        } else{
            kvalitet=2160;
        }
        video.setKvalitet(kvalitet);
    }
}
