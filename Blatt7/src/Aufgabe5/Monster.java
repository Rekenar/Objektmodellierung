package Aufgabe5;
public class Monster extends Entity {
    private int damage;

    /**
     * Constructor of the Monster class.
     * We call the superclass constructor and initialize the damage attribute.
     * @param damage
     * @param hp
     * @param name
     */
    public Monster(int damage,int hp, String name){
        super(hp,name);
        this.damage =damage;
    }

    /**
     * Getter and Setter
     * @return
     */
    public int getDamage() {
        return damage;
    }
    private void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Here we override the getInfo method from the superclass Entity
     * @return
     */
    @Override
    public String getInfo() {
        return getName()+" is a monster with " + getHp() + " HP from " + getMaxhp();
    }
    /**
     * Here we override the doDamage method from the superclass Entity and return the damage
     * @return
     */
    @Override
    public int doDamage() {
        return damage;
    }
    /**
     * Here we override the receiveDamage method from the superclass Entity
     * If the hp we would have, if the damage is too great, is smaller or equals zero, we set the hp to zero
     * else we subtract the damage we get.
     * @return
     */
    @Override
    public void receiveDamage(int damage) {
        if (getHp()-damage >0){
            setHp(getHp()-damage);
        }else{
            setHp(0);
        }
    }
}
