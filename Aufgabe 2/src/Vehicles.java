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
        ArrayList<Integer> nids = new ArrayList<>();
        ArrayList<String> nnames = new ArrayList<>();
        ArrayList<Integer> nweights = new ArrayList<>();

        for (int i = 0; i < weights.size(); i++) {
            nids.add(ids.get(i));
            nnames.add(names.get(i));
            nweights.add(weights.get(i));
        }
        for (int j = 0; j < nweights.size() - 1; j++) {
            for (int i = 1; i < nweights.size()-j-1; i++) {
                if (nweights.get(j) > nweights.get(i)) {

                    int temp1 = nids.get(j);
                    nids.set(j, nids.get(i));
                    nids.set(i, temp1);

                    String temp2 = nnames.get(j);
                    nnames.set(j, nnames.get(i));
                    nnames.set(i, temp2);

                    int temp3 = nweights.get(j);
                    nweights.set(j, nweights.get(i));
                    nweights.set(i, temp3);
                }
            }
            for (int i = 0; i < nids.size(); i++) {
                System.out.println(nids.get(i) + "," + nnames.get(i) + "," + nweights.get(i));
            }
        }

    }
}