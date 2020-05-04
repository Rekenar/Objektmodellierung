package Aufgabe5;
public class Warrior extends Hero {
    /**
     * Constructor of the Warrior Class.
     * It calls the constructor of the superclass Entity.
     * @param name
     */
    public Warrior(String name){
        super(5+Entity.diceRoll(8),name);
    }
    /**
     * The damage is calculated by calling the diceRoll method three times and adding these three together
     * It returns the damage it does.
     */
    public int doFuryAttack(){
        int dice = 0;
        for(int i = 0; i<3; i++){
            dice += Entity.diceRoll(6);
        }
        return getLevel() + dice;
    }
    /**
     * Here we override the doDamage method from the superclass Entity and return the damage
     * @return
     */
    @Override
    public int doDamage() {
        return Entity.diceRoll(8)+getLevel();
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
        if (damage > getLevel()*2){
            if(getHp() - ((damage - (getLevel()*2))) <= 0){
                setHp(0);
            }else{
                setHp(getHp() - (damage -(getLevel() * 2 )));
            }
        }
    }
    /**
     * Here we override the getInfo method from the superclass Entity
     * @return
     */
    @Override
    public String getInfo() {
        return getName()+"is a warrior with level " + getLevel() + " and " + getHp() + " HP from " + getMaxhp();
    }
}
