package homeWork7;

/**
 * Created by tish on 22.02.14.
 */
public class Mage extends Char {
    private int mannaPoints;

    public Mage(String name, int healthPoints, int mannaPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
        this.mannaPoints = mannaPoints;
    }

    @Override
    public void toAttack(Char enemy) {
        String name = getClass().getSimpleName();
        if (getWeapon() instanceof Magestaff ^ getWeapon() instanceof MagicalBook) {
            enemy.setHealthPoints(enemy.getHealthPoints() - getWeapon().getDamage());
        } else if (getWeapon() == null) {
            System.out.println(name + ": Give me the weapon!");
        } else {
            System.out.println(name + ": It's not my weapon!");
        }
    }
}
