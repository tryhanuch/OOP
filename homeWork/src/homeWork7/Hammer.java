package homeWork7;

/**
 * Created by tish on 27.02.14.
 */
public class Hammer extends Weapon {
    protected Hammer(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public int getDamage() {
        int damage = getDamagePoints();
        damage = damage + (int) (Math.random() * 111) - 55;
        return damage;
    }
}
