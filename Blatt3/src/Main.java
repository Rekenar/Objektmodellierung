import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Workshop autohaus = new Workshop("Eisner","austria",
                "Klagenfurt","Bakerstreet 9","066481561", 8484);
        ArrayList<Workshop> workshops = new ArrayList<>();
        workshops.add(autohaus);
        Car car4 = new Car("Golf",
                3500,
                1000,
                180,
                workshops,
                new Brand("VW","Germany", "065481215","jvnajf@kndwidn.con"),
                50.0, 5.0);
        VehicleAdministration vehicles = new VehicleAdministration();
        vehicles.addVehicle(car4);
        vehicles.fillUpAllCars(50);
        car4.drive(800);
        car4.printInfo();





    }
}
/*public class A {
    public static int answer = 0;
    public static String getClassName() {
        return "Name of class: A";
    }
    public String callMethod() {
        return "Method of class: A";
    }
}
public class B extends A {
    public static int answer = 42;
    public static String getClassName() {
        return "Name of class: B";
    }
    @Override
    public String callMethod() {
        return "Method of class: B";
    }
}
public class Main {
    public static void main(String args[]) {
        B b1 = new B();
        System.out.println(b1.answer);
        System.out.println(b1.getClassName());
        System.out.println(b1.callMethod());
        A b2 = new B();
        System.out.println(b2.answer);
        System.out.println(b2.getClassName());
        System.out.println(b2.callMethod());
    }
}*/