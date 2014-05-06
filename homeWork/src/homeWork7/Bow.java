package homeWork7;

/**
 * Created by tish on 23.02.14.
 */
public class Bow extends Weapon {
    protected Bow(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public int getDamage() {
        int damage = getDamagePoints();
        damage = damage + (int) (Math.random() * 41) - 20;
        return damage;
    }
}
