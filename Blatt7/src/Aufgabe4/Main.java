package Aufgabe4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Workshop autohaus = new Workshop("Eisner","austria",
                "Klagenfurt","Bakerstreet 9","066481561", 8484);
        ArrayList<Workshop> workshops = new ArrayList<>();
        workshops.add(autohaus);
        Vehicle car1 = new Vehicle("Fox",
                                    1500,
                                    1000,
                                    180,
                                    workshops,
                                    new Brand("VW","Germany", "065481215","jvnajf@kndwidn.con"));
        Vehicle car2 = new Vehicle("Polo",
                1000,
                1000,
                180,
                workshops,
                new Brand("VW","Germany", "065481215","jvnajf@kndwidn.con"));
        Vehicle car3 = new Vehicle("A6",
                5000,
                1000,
                180,
                workshops,
                new Brand("Audi","Germany", "065481215","jvnajf@kndwidn.con"));
        Vehicle car4 = new Vehicle("Golf",
                3500,
                1000,
                180,
                workshops,
                new Brand("VW","Germany", "065481215","jvnajf@kndwidn.con"));
         VehicleAdministration test = VehicleAdministration.getInstance();
         test.addVehicle(car1);
         test.addVehicle(car2);
         test.addVehicle(car3);
         test.addVehicle(car4);
         test.addVehicle("A4",655,454,150,workshops,
                 new Brand("VW","Germany", "065481215","jvnajf@kndwidn.con"));
         test.printAllVehiclesByWeight();
    }
}
