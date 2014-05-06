package homeWork3;

import java.util.ArrayList;

/**
 * Created by tish on 02.02.14.
 * Вагон: номер, тип, вместимость пассажиров и список пассажиров.
 */
public class Wagon {
    private int number;
    private String type;
    private int volume;
    private ArrayList<Passenger> passengers;

    public Wagon(int number, String type, int volume, ArrayList<Passenger> passengers) {
        this.number = number;
        this.type = type;
        this.volume = volume;
        this.passengers = passengers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
