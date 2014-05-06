package homeWork6.ex1;

import java.util.ArrayList;

/**
 * Created by tish on 12.02.14.
 * Есть знакомая связь магазин товары - магазин состоит из товаров.
 * Товар это - (id, name, cost, type, owner) Есть дочерние классы:
 * Книги(количество страниц), Ноутбуки(Описание характеристик), Телевизоры(Размер диагонали).
 * Задача заключается в том что в магазине нужно написать ряд методов:
 * 1. Найти и вернуть самый дорогой товар
 * 2. Удалить все книги
 * 3. Найти и вернуть все товары цена которых задана некоторым интервалом
 * 4.  Найти общую цену всех товаров
 */
public class Main {
    public static void main(String[] args) {

        Goods g0 = new Book(1001, "Bible", 120, "book", null, 250);
        Goods g1 = new Tv(1002, "LG", 5000, "TV", null, 47);
        Goods g2 = new Tv(1003, "Samsung", 4500, "TV", null, 43);
        Goods g3 = new Tv(1004, "Phillips", 3000, "TV", null, 35);
        Goods g4 = new Notebook(1005, "HP", 4500, "notebook", null, "Core i5");
        Goods g5 = new Book(1006, "Kod DaVincci", 350, "book", null, 300);
        Goods g6 = new Book(1007, "Metro 2033", 300, "book", null, 400);
        Goods g7 = new Notebook(1008, "Dell", 5500, "notebook", null, "Core i7");
        Goods g8 = new Notebook(1009, "Asus", 4000, "notebook", null, "Core i3");
        Goods g9 = new Book(1006, "Metro 2034", 320, "book", null, 350);

        ArrayList<Goods> goodses = new ArrayList<Goods>();
        goodses.add(g0);
        goodses.add(g1);
        goodses.add(g2);
        goodses.add(g3);
        goodses.add(g4);
        goodses.add(g5);
        goodses.add(g6);
        goodses.add(g7);
        goodses.add(g8);
        goodses.add(g9);

        Shop shop = new Shop("ROZETKA", goodses);

        shop.expensive();
        shop.priceInterval();
        shop.totalPrice();
        shop.deleteAllBooks();
        shop.totalPrice();
    }
}
