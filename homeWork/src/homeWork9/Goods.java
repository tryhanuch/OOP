package homeWork9;

/**
 * Created by tish on 12.03.14.
 */
public class Goods {
    private String model;
    private int weight;
    private int cost;
    private String manufacturer;

    public Goods(String model, int weight, int cost, String manufacturer) {
        this.model = model;
        this.weight = weight;
        this.cost = cost;
        this.manufacturer = manufacturer;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
