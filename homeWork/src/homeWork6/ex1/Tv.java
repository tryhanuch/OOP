package homeWork6.ex1;

/**
 * Created by tish on 12.02.14.
 */
public class Tv extends Goods {
    private int diagonalSize;

    public Tv(int id, String name, int cost, String type, String owner, int diagonalSize) {
        super(id, name, cost, type, owner);
        this.diagonalSize = diagonalSize;
    }

    public int getDiagonalSize() {

        return diagonalSize;
    }

    public void setDiagonalSize(int diagonalSize) {
        this.diagonalSize = diagonalSize;
    }
}
