public abstract class Hero extends Entity {
    protected int level;

    /**
     * Constructor of the Hero class.
     * We call the superclass constructor and initialize the level attribute.
     * @param hp
     * @param name
     */
    public Hero(int hp, String name){
        super(hp,name);
        this.level = 1;
    }

    /**
     * Getter and Setter
     * @return
     */
    public int getLevel() {
        return level;
    }
    private void setLevel(int level) {
        this.level = level;
    }

    /**
     * When the levelUp method is called we increment the level by one, increment the Maxhp by a random integer value
     * between 0 and 4 and we set the hp to the Maxhp because levelUp equals full hp
     */
    public void levelUp(){
        setLevel(++level);
        setMaxhp(getMaxhp() + Entity.diceRoll(5));
        setHp(getMaxhp());
    }
}
