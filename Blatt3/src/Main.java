import java.util.ArrayList;

/*public class Main {
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
}*/
public class Main {
    public static void main(String args[]) {
        B b1 = new B();                             //Normal Object
        System.out.println(b1.answer);              //42                        //42
        System.out.println(b1.getClassName());      //Name of class: B          //B
        System.out.println(b1.callMethod());        //Method of class: B        //B


        A b2 = new B();                             //An Object of the Type A gets initialized with new B()
                                                    //This means the static attributes and methods are from the
                                                    // A class and the other attributes and methods are from the B class
        System.out.println(b2.answer);              //0                         //0     //It gives back 0 because answer is a static attribute
        System.out.println(b2.getClassName());      //Name of class: A          //A     //It gives back A because getClassName is a static Method
        System.out.println(b2.callMethod());        //Method of class: A        //B     //It gives back B because its the override method from B that's non-static
    }
}