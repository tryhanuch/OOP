package homeWork7;

import java.util.ArrayList;

/**
 * Created by tish on 27.02.14.
 */
public class Battle {
    private String name;
    private ArrayList<Char> chars;

    public Battle(String name, ArrayList<Char> chars) {
        this.name = name;
        this.chars = chars;
    }

    public Char begin() {
        Char result = null;
        ArrayList<Char> winners = new ArrayList<Char>();

        System.out.println("The " + getName() + " begins!!!");
        for (int i = 0; i < chars.size(); i += 2) {
            winners.add(Char.figt(chars.get(i), chars.get(i + 1)));
        }

        for (int i = 0; i < winners.size(); i++) {
            if (winners.get(i) == null) {
                winners.remove(i);
                i--;
            }
        }

        if (winners.size() >= 2) {
            System.out.println("Final of the " + getName() + "!!!");
            for (int i = 0; i < winners.size(); i += 2) {
                result = Char.figt(winners.get(i), winners.get(i + 1));
            }
        } else if (winners.size() == 0) {
            System.out.println("Nobody has won :(");
            result = null;
        } else {
            result = winners.get(0);
        }

        if (result != null) {
            System.out.println("The winner of the " + getName() + " becomes a " + result.getClass().getSimpleName()
                    + " " + result.getName() + "!!!");
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Char> getChars() {
        return chars;
    }

    public void setChars(ArrayList<Char> chars) {
        this.chars = chars;
    }
}
