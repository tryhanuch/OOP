package homeWork6.ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tish on 12.02.14.
 */
public class Shop {
    private String name;
    private ArrayList<Goods> goodses = new ArrayList<Goods>();

    public Shop(String name, ArrayList<Goods> goodses) {
        this.name = name;
        this.goodses = goodses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Goods> getGoodses() {

        return goodses;
    }

    public void setGoodses(ArrayList<Goods> goodses) {
        this.goodses = goodses;
    }

    public void expensive() {
        int max = 0;
        for (int i = 0; i < goodses.size(); i++) {
            if (goodses.get(i).getCost() > goodses.get(max).getCost()) {
                max = i;
            }
        }
        System.out.println("Самый дорогой товар в магазине " + name + ":");
        System.out.println(goodses.get(max).getType() + " " + goodses.get(max).getName() + " - " + goodses.get(max).getCost());
        System.out.println();
    }

    public void deleteAllBooks() {
        System.out.println("Все книги из магазина удалены!");
        for (int i = 0; i < goodses.size(); i++) {
            if (goodses.get(i) instanceof Book) {
                goodses.remove(i);
                i--;
            }
        }
        System.out.println("Товаров отсалось: " + goodses.size());
        System.out.println();
    }

    public void priceInterval() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите стоимость товара в интервале от: ");
        int from = scr.nextInt();
        System.out.println("и до: ");
        int to = scr.nextInt();
        int count = 0;
        System.out.println();
        if (from > to) {
            System.out.println("Неверно задан интервал!");
        } else {
            for (int i = 0; i < goodses.size(); i++) {
                if (goodses.get(i).getCost() >= from && goodses.get(i).getCost() <= to) {
                    System.out.println(goodses.get(i).getName() + " - " + goodses.get(i).getCost());
                    count++;
                }
            }
            System.out.println("Найдено товаров: " + count);
        }
        System.out.println();
    }

    public void totalPrice() {
        int tp = 0;
        for (int i = 0; i < goodses.size(); i++) {
            tp += goodses.get(i).getCost();
        }
        System.out.println("Общая стоимость всех товаров: " + tp);
        System.out.println();
    }
}
