public class Mage extends Hero {
    /**
     * Constructor of the Mage Class.
     * It calls the constructor of the superclass Entity.
     * @param name
     */
    public Mage(String name){
        super(5+Entity.diceRoll(6),name);
    }
/**
 * When you call this method it increments the hp by one.
 * It returns the damage it does.
 */
    public int castSpell(){
        setHp(getHp()+ 1);
        return 1 + getLevel() *Entity.diceRoll(10);
    }

    /**
     * Here we override the doDamage method from the superclass Entity
     * @return
     */
    @Override
    public int doDamage() {
        return Entity.diceRoll(4)*getLevel();
    }
    /**
     * Here we override the receiveDamage method from the superclass Entity
     * If the damage is smaller than what we block, nothing happens.
     * If the hp we would have, if the damage is too great, is smaller or equals zero, we set the hp to zero
     * else we subtract the damage we get.
     * @return
     */
    @Override
    public void receiveDamage(int damage) {
        if(damage >getLevel()){
            if(getHp() - ((damage - getLevel())) <= 0){
                setHp(0);
            }else{
                setHp(getHp() - (damage -getLevel()));
            }
        }
    }
    /**
     * Here we override the getInfo method from the superclass Entity
     * @return
     */
    @Override
    public String getInfo() {
        return getName()+"is a mage with level " + getLevel() + " and " + getHp() + " HP from " + getMaxhp();
    }
}