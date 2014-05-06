package homeWork3;

import java.util.ArrayList;

/**
 * Created by tish on 02.02.14.
 * Поезд: имя, тип, список вагонов.
 */
public class Train {
    private String name;
    private String type;
    private ArrayList<Wagon> wagons;

    public void report(){
        int p = 0;
        int r = 0;
        int c = 0;
        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i).getType().equals("PassWag")){
                p++;
            }
            else if (wagons.get(i).getType().equals("CargoWag")){
                c++;
            }
            else {
                r++;
            }
        }
        System.out.println("Поезд "+name+" имеет "+wagons.size()+" вагонов, из которых:");
        System.out.println("Пассажирских - "+p);
        System.out.println("Ресторанов - "+r);
        System.out.println("Грузовых - "+c);
        System.out.println();
    }

    public void removeEmpty(){
        System.out.println("Удаляем из поезда пустые пассажирские вагоны.");
        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i).getType().equals("PassWag") && wagons.get(i).getPassengers() == null){
                wagons.remove(i);
                i--;
            }
        }
        System.out.println("Вагонов осталось: "+wagons.size());
        System.out.println();
    }

    public void overflowingWagon(){
        System.out.println("Номера пассажирских вагонов, которые переполнены:");
        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i).getPassengers()!= null && wagons.get(i).getPassengers().size() > wagons.get(i).getVolume()){
                System.out.println(wagons.get(i).getNumber());
            }
        }
        System.out.println();
    }

    public Train(String name, String type, ArrayList<Wagon> wagons) {
        this.name = name;
        this.type = type;
        this.wagons = wagons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }
}
