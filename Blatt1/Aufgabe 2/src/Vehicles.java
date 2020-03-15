import java.util.ArrayList;
import java.util.Scanner;

public class Vehicles {

    private static ArrayList<Integer> ids = new ArrayList<>();
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<Integer> weights = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Commands: q=quit, n=New Vehicle, p=print all Vehicles, s=Sort vehicles by weight");
        System.out.print("Command:");
        Scanner command = new Scanner(System.in);
        String input = command.nextLine();

        while (!input.equals("q")) {
            if (input.equals("n")) {
                System.out.println("Add a new vehicle");
                System.out.print("Enter an id: ");
                int id = command.nextInt();
                command.nextLine();
                System.out.print("Enter a name: ");
                String name = command.nextLine();
                System.out.print("Enter a weight: ");
                int weight = command.nextInt();
                System.out.println("Create new vehicle");
                try {
                    addvehicle(id, name, weight);
                } catch (IllegalArgumentException e) {
                    System.out.println("One or more of the values is not valid! Try again");
                }

            } else if (input.equals("p")) {
                printAllVehicles();
            } else if (input.equals("s")) {
                /*
                ids.add(151);
                ids.add(251);
                ids.add(385486);
                ids.add(4848);
                ids.add(563);
                ids.add(68);
                names.add("dwa");
                names.add("dawd");
                names.add("fawfa");
                names.add("fawofk");
                names.add("omko");
                names.add("ijio");
                weights.add(2);
                weights.add(8);
                weights.add(3);
                weights.add(15);
                weights.add(10);
                weights.add(1);*/
                printAllVehiclesbyWeight();

            }

            System.out.println("Commands: q=quit, n=New Vehicle, p=print all Vehicles, s=Sort vehicles by weight");
            System.out.print("Command:");
            input = command.nextLine();
        }
    }

    private static void addvehicle(int id, String name, int weight) {
        if (id >= 0 && !ids.contains(id) && name.length() > 0 && weight > 0) {
            ids.add(id);
            names.add(name);
            weights.add(weight);
        } else {
            throw new IllegalArgumentException("One or more of the values is not valid!");
        }
    }

    private static void printAllVehicles() {
        for (int i = 0; i < ids.size(); i++) {
            System.out.println(ids.get(i) + "," + names.get(i) + "," + weights.get(i));
        }
    }

    private static void printAllVehiclesbyWeight() {
        ArrayList<Integer> nweights = new ArrayList<>();

        for (int i = 0; i < weights.size(); i++) {
            nweights.add(weights.get(i));
        }
        int temp;
        for(int i=1; i<nweights.size(); i++) {
            for(int j=0; j<nweights.size()-i; j++) {
                if (nweights.get(j) > nweights.get(j + 1)) {
                    temp = nweights.get(j);
                    nweights.set(j, nweights.get(j + 1));
                    nweights.set(j + 1, temp);
                }
            }
        }
        for(int i = 0; i<nweights.size();i++){
            for(int j = 0;j<weights.size();j++){
                if(nweights.get(i)==weights.get(j)){
                    System.out.println(ids.get(j) + "," + names.get(j) + "," + weights.get(j));
                    break;
                }
            }
        }
    }
}