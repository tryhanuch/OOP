package homeWork9;

/**
 * Created by tish on 12.03.14.
 */
public class Printers extends Goods {
    private String type;
    private String color;

    public Printers(String model, int weight, int cost, String manufacturer, String type, String color) {
        super(model, weight, cost, manufacturer);
        this.type = type;
        this.color = color;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
