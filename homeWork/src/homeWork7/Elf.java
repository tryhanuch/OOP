package homeWork7;

/**
 * Created by tish on 22.02.14.
 */
public class Elf extends Char {
    public Elf(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);
    }

    @Override
    public void toAttack(Char enemy) {
        String name = getClass().getSimpleName();
        if (getWeapon() instanceof Bow ^ getWeapon() instanceof Knife) {
            enemy.setHealthPoints(enemy.getHealthPoints() - getWeapon().getDamage());
        } else if (getWeapon() == null) {
            System.out.println(name + ": Give me the weapon!");
        } else {
            System.out.println(name + ": It's not my weapon!");
        }
    }
}
