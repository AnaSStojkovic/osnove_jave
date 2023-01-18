package domaci_17_01_2023;

public class TimeControl extends Control {

    private boolean pomeraj;



    public TimeControl(boolean pomeraj) {
        this.pomeraj = pomeraj;

    }

    public boolean isPomeraj() {
        return pomeraj;
    }

    public void setPomeraj(boolean pomeraj) {
        this.pomeraj = pomeraj;
    }



    @Override
    public void izvrsiAkciju(VideoPlayer video) {

        if (pomeraj) {
            int novoVreme = video.getTrenutnoVreme() + 15;
            if (novoVreme>video.getDuzina()) {
                novoVreme = video.getDuzina();
            }
            video.setTrenutnoVreme(novoVreme);

        } else {
            int novoVreme = video.getTrenutnoVreme() - 15;
            if (novoVreme < 0) {
                novoVreme = 0;
            }
            video.setTrenutnoVreme(novoVreme);
        }
    }
}

