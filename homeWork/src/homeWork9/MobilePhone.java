package homeWork9;

/**
 * Created by tish on 12.03.14.
 */
public class MobilePhone extends Goods {
    private String type;
    private String os;
    private String size;
    private boolean wifi;

    public MobilePhone(String model, int weight, int cost, String manufacturer, String type, String os, String size, boolean wifi) {
        super(model, weight, cost, manufacturer);
        this.type = type;
        this.os = os;
        this.size = size;
        this.wifi = wifi;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
