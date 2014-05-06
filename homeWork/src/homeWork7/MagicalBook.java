package homeWork7;

/**
 * Created by tish on 27.02.14.
 */
public class MagicalBook extends Weapon {
    protected MagicalBook(int damagePoints) {
        super(damagePoints);
    }

    @Override
    public int getDamage() {
        int damage = getDamagePoints();
        damage = damage + (int) (Math.random() * 81) - 40;
        return damage;
    }
}
