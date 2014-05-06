package homeWork4;

import java.util.ArrayList;

/**
 * Created by tish on 02.02.14.
 * Есть магазин с товарами.
 * Товары (название, цена, вес).
 * Используя ArrayList с private полями написать методы:
 * - генерация отчета (.report), таблица с колонками
 *   |   название   |   вес   |   цена   |
 *   |              |         |          |
 * ----------------------------------------
 * Общая цена товаров -
 * Кол-во товаров -
 * Средняя цена товаров -
 */
public class Main {
    public static void main(String[] args) {

        Goods g0 = new Goods("Tapochki", 100, 100);
        Goods g1 = new Goods("Mouse", 12000, 200);
        Goods g2 = new Goods("Keyboard", 20000, 500);
        Goods g3 = new Goods("Monitor", 55000, 1000);
        Goods g4 = new Goods("Lamp", 3000, 1000);
        Goods g5 = new Goods("Proektor", 20000, 300);
        Goods g6 = new Goods("Chair", 500, 1700);
        Goods g7 = new Goods("Table", 1000, 5000);


        ArrayList<Goods> goods = new ArrayList<Goods>();
        goods.add(g0);
        goods.add(g1);
        goods.add(g2);
        goods.add(g3);
        goods.add(g4);
        goods.add(g5);
        goods.add(g6);
        goods.add(g7);

        Shop shop = new Shop("Metro", goods);

        shop.report();
    }
}
