import java.util.ArrayList;
import java.util.Collections;

public class VehicleAdministration {
    private ArrayList<Vehicle> vehicles;

//Initialize an empty ArrayList

    public VehicleAdministration(){
        this.vehicles = new ArrayList<>();
    }

//Add a Vehicle in the ArrayList but when the Id is used don't add it

    public void addVehicle(Vehicle vehicle){
        try{
            for(Vehicle e:vehicles){
                if(vehicle.getId() == e.getId()){
                    throw new IllegalArgumentException("ID is used!");
                }
            }
            vehicles.add(vehicle);
        }catch(IllegalArgumentException e){
            System.out.println("ID is used. Use another!");
        }
    }

//Add a Vehicle in the ArrayList but initialize the object while adding

public void addVehicle(String name, int weight, int maxPermissableWeight,
                       double maxSpeed, ArrayList<Workshop> workshops, Brand brand){
        vehicles.add(new Vehicle(name, weight, maxPermissableWeight,maxSpeed,workshops,brand));
}

//Remove a Vehicle if its in the List

    public void removeVehicle(int vehicleId){
        for(int i = 0; i<vehicles.size();i++){
            if(vehicles.get(i).getId()== vehicleId){
                vehicles.remove(i);
            }
        }
    }

//Search for a Vehicle via the Id and give back the Information

    public void search(int vehicleId){
        for(int i = 0; i<vehicles.size();i++){
            if(vehicles.get(i).getId()== vehicleId){
                vehicles.get(i).printInfo();
            }
        }
    }

//Print the Information from all Vehicles

    public void printAllVehicles(){
        for(Vehicle e: vehicles){
            e.printInfo();
        }
    }

//Print the Information from all Vehicles sorted by weight

    public void printAllVehiclesByWeight(){
        //Create an Object of the sorted by weight class
        SortedByWeight sorted = new SortedByWeight();
        //Giving the Collections.sort method our vehicles ArrayList and our object sorted of the SortedByWeight class
        //The Sort method invokes the compare method to sort the Objects in the List.
        //sorted sets the condition for sorting
        Collections.sort(vehicles,sorted);
        for(Vehicle e:vehicles){
            e.printInfo();
        }
    }

//Search for a similar brandName and print the Vehicle

    public void search(String brandName){
        for(Vehicle e:vehicles){
            //We use .equals() because "==" compares only the reference but we want the same brandName
            if(e.getBrand().getName().equals(brandName)){
                System.out.println(e.getName());
            }
        }
    }
}
