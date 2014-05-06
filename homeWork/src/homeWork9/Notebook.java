package homeWork9;

/**
 * Created by tish on 12.03.14.
 */
public class Notebook extends Goods {
    private int ram;
    private String os;
    private int diagonal;
    private String video;

    public Notebook(String model, int weight, int cost, String manufacturer, int ram, String os,int diagonal, String video) {
        super(model, weight, cost, manufacturer);
        this.ram = ram;
        this.os = os;
        this.diagonal = diagonal;
        this.video = video;
    }

    public int getRam() {

        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
