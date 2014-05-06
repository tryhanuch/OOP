package homeWork7;

/**
 * Created by tish on 27.02.14.
 */
public class Axe extends Weapon {
    protected Axe(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public int getDamage() {
        int damage = getDamagePoints();
        damage = damage + (int) (Math.random() * 92) - 45;
        return damage;
    }
}
