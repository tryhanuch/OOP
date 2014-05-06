package homeWork7;

/**
 * Created by tish on 22.02.14.
 */
public abstract class Weapon {
    private int damagePoints;

    protected Weapon(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public abstract int getDamage();

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
