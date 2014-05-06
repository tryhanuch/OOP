package homeWork7;

/**
 * Created by tish on 27.02.14.
 */
public class Knife extends Weapon {
    protected Knife(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public int getDamage() {
        int damage = getDamagePoints();
        damage = damage + (int) (Math.random() * 61) - 30;
        return damage;
    }
}
