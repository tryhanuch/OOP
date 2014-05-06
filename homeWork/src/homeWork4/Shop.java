package homeWork4;

import java.util.ArrayList;

/**
 * Created by tish on 02.02.14.
 */
public class Shop {
    private String name;
    private ArrayList<Goods> goods;

    public Shop(String name, ArrayList<Goods> goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Goods> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    public Goods sortGoods (){
        Goods result = goods.get(0);
        for (int i = goods.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (goods.get(j).getPrice() < goods.get(j + 1).getPrice()){
                    Goods temp = goods.get(j);
                    goods.set(j, goods.get(j + 1));
                    goods.set(j + 1, temp);
                }
            }
        }
        return result;
    }

    public void report (){
        sortGoods();
        int allPrice = 0;
        int serPrice = 0;
        for (int i = 0; i < goods.size(); i++) {
            allPrice = allPrice +  goods.get(i).getPrice();
            serPrice = allPrice / goods.size();
            System.out.println(goods.get(i).getName()+" "+goods.get(i).getWeight()+" "+goods.get(i).getPrice());
        }
        System.out.println("----------------------------------------");
        System.out.println("Общая стоимость товаров: - "+allPrice);
        System.out.println("Количество товаров: - "+goods.size());
        System.out.println("Средняя цена товаров товаров: - "+serPrice);
    }
}
