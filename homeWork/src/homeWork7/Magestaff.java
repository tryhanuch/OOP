package homeWork7;

/**
 * Created by tish on 27.02.14.
 */
public class Magestaff extends Weapon {
    protected Magestaff(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public int getDamage() {
        int damage = getDamagePoints();
        damage = damage + (int) (Math.random() * 101) - 50;
        return damage;
    }
}
