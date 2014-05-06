package homeWork3;

import java.util.ArrayList;

/**
 * Created by tish on 02.02.14.
 * Есть поезд который состоит из вагонов. В вагонах есть пасажиры.
 * Пассажиры: имя.
 * Вагон: номер, тип, вместимость пассажиров и список пассажиров
 * Поезд: имя, тип, список вагонов.
 * Удалить все пустые вагоны из поезда
 * Вывести номера переполненых вагонов
 * Забалансить людей в поезде
 */
public class Main {
    public static void main(String[] args) {

        Passenger p0 = new Passenger("Alex");
        Passenger p1 = new Passenger("Bill");
        Passenger p2 = new Passenger("Jim");
        Passenger p3 = new Passenger("Fred");
        Passenger p4 = new Passenger("Natali");
        Passenger p5 = new Passenger("John");
        Passenger p6 = new Passenger("Cim");
        Passenger p7 = new Passenger("Piter");
        Passenger p8 = new Passenger("Bruce");
        Passenger p9 = new Passenger("Evan");
        Passenger p10 = new Passenger("Nikol");
        Passenger p11 = new Passenger("Max");
        Passenger p12 = new Passenger("Bred");
        Passenger p13 = new Passenger("Suzy");
        Passenger p14 = new Passenger("Britney");

        ArrayList<Passenger> passWag0 = new ArrayList<Passenger>();
        ArrayList<Passenger> passWag1 = new ArrayList<Passenger>();
        ArrayList<Passenger> passWag3 = new ArrayList<Passenger>();

        passWag0.add(p0);
        passWag0.add(p1);
        passWag0.add(p2);
        passWag0.add(p3);
        passWag0.add(p4);
        passWag1.add(p5);
        passWag1.add(p6);
        passWag1.add(p7);
        passWag1.add(p8);
        passWag1.add(p9);
        passWag1.add(p10);
        passWag3.add(p11);
        passWag3.add(p12);
        passWag3.add(p13);
        passWag3.add(p14);

        Wagon w0 = new Wagon(1, "PassWag", 5, passWag0);
        Wagon w1 = new Wagon(2, "PassWag", 5, passWag1);
        Wagon w2 = new Wagon(3, "RestWag", 0, null);
        Wagon w3 = new Wagon(4, "PassWag", 5, passWag3);
        Wagon w4 = new Wagon(5, "CargoWag", 0, null);
        Wagon w5 = new Wagon(6, "PassWag", 5, null);
        Wagon w6 = new Wagon(7, "PassWag", 5, null);

        ArrayList<Wagon> wagons = new ArrayList<Wagon>();
        wagons.add(w0);
        wagons.add(w1);
        wagons.add(w2);
        wagons.add(w3);
        wagons.add(w4);
        wagons.add(w5);
        wagons.add(w6);

        Train train = new Train("Polar Express", "Passengers and Goods", wagons);

        train.report();
        train.removeEmpty();
        train.overflowingWagon();
        train.report();
    }
}
