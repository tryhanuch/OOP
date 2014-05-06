package homeWork7;

/**
 * Created by tish on 27.02.14.
 */
public class Crossbow extends Weapon {
    protected Crossbow(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public int getDamage() {
        int damage = getDamagePoints();
        damage = damage + (int) (Math.random() * 101) - 50;
        return damage;
    }
}
