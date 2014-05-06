package goods;

/**
 * Created by tish on 25.01.14.
 */
public class Main {
    public static void main(String[] args) {

        Goods goods0 = new Goods();
        goods0.name = "Kartoshka";
        goods0.price = 10;
        goods0.weight = 100;

        Goods goods1 = new Goods();
        goods1.name = "Kolbasa";
        goods1.price = 35;
        goods1.weight = 20;

        Goods goods2 = new Goods();
        goods2.name = "Morkov'";
        goods2.price = 12;
        goods2.weight = 63;

        Goods goods3 = new Goods();
        goods3.name = "Goroshek";
        goods3.price = 5;
        goods3.weight = 10;

        Goods[] salat = new Goods[4];
        salat[0] = goods0;
        salat[1] = goods1;
        salat[2] = goods2;
        salat[3] = goods3;

        int n = 50;
        for (int i = 0; i < salat.length; i++) {
            if (salat[i].weight < n) {
                System.out.println(salat[i].name+" ");
            }
        }

    }
}
