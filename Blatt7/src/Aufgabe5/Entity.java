package Aufgabe5;
import java.util.Random;

public abstract class Entity {
    protected int hp;
    private String name;
    private static Random rnd = new Random();
    private int maxhp;
    /**
     * Constructor of the superclass Entity
     */
    public Entity(int hp, String name){
        this.maxhp = hp;
        this.hp = hp;
        this.name = name;
    }

    /**
     * Getter
     * @return
     */
    public int getHp() {
        return hp;
    }
    public String getName() {
        return name;
    }
    public int getMaxhp() {
        return maxhp;
    }

    /**
     * If the hp is greater than the Maxhp than this.hp = Maxhp
     * else this.hp = hp
     * @param hp
     */
    public void setHp(int hp) {
        if(hp > getMaxhp()){
            this.hp = getMaxhp();
        }
        this.hp = hp;
    }

    /**
     * Setter
     * @param name
     */
    private void setName(String name) {
        this.name = name;
    }
    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    /**
     * This Method is used for all random numbers in the program.
     * I dont like those zeros so make all zeros to one.
     * @param sides
     * @return
     */
    public static int diceRoll(int sides){
        int i = rnd.nextInt(++sides);
        return (i==0) ? 1:i;
    }

    /**
     * abstract methods for the subclasses
     * @return
     */
    public abstract String getInfo();
    public abstract int doDamage();
    public abstract void receiveDamage(int damage);
}
