package Aufgabe5;
import java.util.Random;

/**
 * Stolen from 	MrPork http://www.java-gaming.org/index.php?topic=35802.0
 * (Just for fun, in no way the best/whatever Method, but it works)
 */
public class NameGenerator {

   private static String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
         "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
         "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
         "Mar", "Luk" };
   private static String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
         "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
         "marac", "zoir", "slamar", "salmar", "urak" };
   private static String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
         "tron", "med", "ure", "zur", "cred", "mur" };
   
   private static Random rand = new Random();

   public static String generateName() {
      return Beginning[rand.nextInt(Beginning.length)] + 
            Middle[rand.nextInt(Middle.length)]+
            End[rand.nextInt(End.length)];

   }

}