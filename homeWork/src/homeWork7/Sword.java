package homeWork7;

/**
 * Created by tish on 27.02.14.
 */
public class Sword extends Weapon {
    protected Sword(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public int getDamage() {
        int damage = getDamagePoints();
        damage = damage + (int) (Math.random() * 121) - 60;
        return damage;
    }
}
