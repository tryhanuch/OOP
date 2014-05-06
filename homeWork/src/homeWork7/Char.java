package homeWork7;

/**
 * Created by tish on 22.02.14.
 */
public abstract class Char {
    private String name;
    private int healthPoints;
    private Weapon weapon;

    public Char(String name, int healthPoints, Weapon weapon) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public abstract void toAttack(Char enemy);

    public static Char figt(Char char1, Char char2) {
        Char result = null;

        int hpChar1 = char1.getHealthPoints();
        int hpChar2 = char2.getHealthPoints();

        int temp1 = hpChar1;
        int temp2 = hpChar2;

        System.out.println("(" + hpChar1 + ") (" + hpChar2 + ")");
        System.out.println(char1.getClass().getSimpleName() + " " + char2.getClass().getSimpleName());

        while (hpChar2 > 0 && hpChar1 > 0) {                   //^-
            char1.toAttack(char2);
            char2.toAttack(char1);

            hpChar2 = char2.getHealthPoints();
            hpChar1 = char1.getHealthPoints();
            System.out.println(hpChar1 + " " + hpChar2);
        }

        if (hpChar2 > 0 && hpChar1 <= 0) {
            System.out.println(char2.getClass().getSimpleName() + " win!");
            hpChar1 = 0;
            result = char2;
        } else if (hpChar2 <= 0 && hpChar1 > 0) {
            System.out.println(char1.getClass().getSimpleName() + " win!");
            hpChar2 = 0;
            result = char1;
        } else if (hpChar2 <= 0 && hpChar1 <= 0) {
            System.out.println("All the fighters lost!");
            hpChar2 = 0;
            hpChar1 = 0;
            result = null;
        }

        System.out.println(hpChar1 + " " + hpChar2);
        System.out.println();

        char1.setHealthPoints(temp1);
        char2.setHealthPoints(temp2);

        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
