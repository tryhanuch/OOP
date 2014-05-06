package homeWork6.ex1;

/**
 * Created by tish on 12.02.14.
 */
public class Book extends Goods{
    private int numbOfPages;

    public Book(int id, String name, int cost, String type, String owner, int numbOfPages) {
        super(id, name, cost, type, owner);
        this.numbOfPages = numbOfPages;
    }

    public int getNumbOfPages() {

        return numbOfPages;
    }

    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }
}
