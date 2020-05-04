package Aufgabe5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BattleSimulator {

    /**
     * Declaration of ArrayLists
     */

    static ArrayList<Hero> heroes;
    static ArrayList<Monster> monsters;
    static ArrayList<Entity> entities;

    /**
     * main-Method
     * You can decide whether you like it all random or if you would like the heroes first.
     * You can also decide how many rounds they shall play.
     * @param args
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean temp;
        do {
            System.out.println("Which gamemode would you like to play?");
            System.out.println("1: All random or 2: First heroes than monsters");
            System.out.println("----------------------------------------------------");
            int gamemode = in.nextInt();

            System.out.println("How many rounds do you wanna play?");
            System.out.println("If you want to play until one side has won press 0");
            System.out.println("-----------------------------------------------------");
            int rounds = in.nextInt();

            System.out.println("");

            switch (gamemode) {
                case 1:
                    temp = false;
                    initzializeBattleLists();
                    listParticipantsAllRandom();
                    for (int i = 0; i < rounds; i++) {
                        battleRoundAllRandom();
                    }
                    break;
                case 2:
                    temp = false;
                    initzializeBattleLists();
                    listParticipantsFirstHeroes();
                    for (int i = 0; i < rounds; i++) {
                        battleRoundFirstHeroes();
                    }
                    break;
                default:
                    temp = true;
                    System.out.println("There is no gamemode for the corresponding number!");
            }
        }while (temp) ;
    }

    /**
     * The ArrayLists get filled.
     * heroes stores all Hero objects. (Warrior, Mage)
     * monsters stores all Monster objects
     * entities stores all Hero and Monster objects
     */
    public static void initzializeBattleLists() {
        heroes = new ArrayList<>();
        monsters = new ArrayList<>();
        entities = new ArrayList<>();

        for (int i = Entity.diceRoll(6); i >0; i--) {
            monsters.add(new Monster(Entity.diceRoll(6),Entity.diceRoll(6),NameGenerator.generateName()));
            entities.add(monsters.get(monsters.size()-1));
        }
        for (int i = Entity.diceRoll(5); i >0; i--) {
            if(Entity.diceRoll(10)<5){
                heroes.add(new Warrior(NameGenerator.generateName()));
                entities.add(heroes.get(heroes.size()-1));
            }
            else{
                heroes.add(new Mage(NameGenerator.generateName()));
                entities.add(heroes.get(heroes.size()-1));
            }
        }
    }

    /**
     * I have renamed the given battleRound method to battleRoundFirstHeroes. This method is the same but when a Hero
     * gets a levelup it also checks if it's a Mage object. If it is it gives it another levelup. I also renamed the
     * listParticipants method to listParticipantsFirstHeroes so i can differ between the gamemodes
     */
    public static void battleRoundFirstHeroes(){
        System.out.println("+++ Begin new Battleround (First heroes than monsters) +++");
        for (Hero hero: heroes) {
            Monster enemy = (Monster) selectValidTarget(monsters);
            if(enemy!=null && hero.hp>0){
                int damage = hero.doDamage();
                System.out.println("Hero " + hero.getName() + " did " + damage + " damage to Monster " + enemy.getName());
                enemy.receiveDamage(damage);
                if(enemy.hp<= 0){
                    System.out.println("Hero " + hero.getName() + " slayed " + enemy.getName() + "!");
                    hero.levelUp();
                    if(hero instanceof Mage){
                            hero.levelUp();
                    }
                }
            }
        }

        for (Monster monster: monsters) {
            Hero enemy = (Hero) selectValidTarget(heroes);
            if(enemy!=null && monster.hp>0){
                int  damage= monster.doDamage();
                System.out.println("Monster " + monster.getName() + " did " + damage + " damage to Hero " + enemy.getName());
                enemy.receiveDamage(damage);
                if(enemy.hp<= 0){
                    System.out.println("Monster " + monster.getName() + " killed " + enemy.getName() + "!");
                }
            }
        }
        heroes.removeIf(obj -> obj.hp <= 0);
        monsters.removeIf(obj -> obj.hp <= 0);

        System.out.println("--- End of Round ---\n");

        listParticipantsFirstHeroes();
    }
    /**
     * This is the method for the other gamemode where the order of the fights is random. I put them all in an ArrayList
     * called entities. Every time the method gets called i shuffle the ArrayList via "Collections.shuffle(entities);".
     * After that its the same as the other gamemode but i need to cast it to the Hero Class for the levelups
     */
    public static void battleRoundAllRandom(){
        System.out.println("+++ Begin new Battleround (All random) +++");
        Collections.shuffle(entities);
        for(Entity entity: entities){
            if(entity instanceof Hero){
                Monster enemy = (Monster) selectValidTarget(monsters);
                if(enemy!=null && entity.hp>0){
                    int damage = entity.doDamage();
                    System.out.println("Hero " + entity.getName() + " did " + damage + " damage to Monster " + enemy.getName());
                    enemy.receiveDamage(damage);
                    if(enemy.hp<= 0){
                        System.out.println("Hero " + entity.getName() + " slayed " + enemy.getName() + "!");
                        ((Hero)entity).levelUp();
                        if(entity instanceof Mage){
                            ((Hero)entity).levelUp();
                        }
                    }
                }
            }

            if(entity instanceof Monster){
                Hero enemy = (Hero) selectValidTarget(heroes);
                if(enemy!=null && entity.hp>0){
                    int  damage= entity.doDamage();
                    System.out.println("Monster " + entity.getName() + " did " + damage + " damage to Hero " + enemy.getName());
                    enemy.receiveDamage(damage);
                    if(enemy.hp<= 0){
                        System.out.println("Monster " + entity.getName() + " killed " + enemy.getName() + "!");
                    }
                }
            }
        }

        entities.removeIf(obj -> obj.hp <= 0);

        System.out.println("--- End of Round ---\n");

        listParticipantsAllRandom();
    }

    /**
     * The following two methods are just for printing the participants.
     */
    private static void listParticipantsAllRandom() {
        System.out.println("List Participants: ");

        for (Entity entity: entities) {
            System.out.println(entity.getInfo());
        }

        System.out.println("\n");
    }
    private static void listParticipantsFirstHeroes() {
        for (Hero hero: heroes) {
            System.out.println(hero.getInfo());
        }
        for(Monster monster: monsters){
            System.out.println(monster.getInfo());;
        }
    }

    /**
     * This method is here to select an enemy for the battles above.
     * @param entities The List where the enemies of the respective object.
     * @return If there are no more enemies that can fight it returns null
     */
    public static Entity selectValidTarget(ArrayList<? extends Entity> entities){
        Collections.shuffle(entities);
        for (Entity e : entities) {
            if (e.hp >0) {
                return e;
            }
        }
        return null;
    }
}
