package homeWork6.ex1;

/**
 * Created by tish on 12.02.14.
 */
public class Notebook extends Goods {
    private String datasheet;

    public Notebook(int id, String name, int cost, String type, String owner, String datasheet) {
        super(id, name, cost, type, owner);
        this.datasheet = datasheet;
    }

    public String getDatasheet() {

        return datasheet;
    }

    public void setDatasheet(String datasheet) {
        this.datasheet = datasheet;
    }
}
