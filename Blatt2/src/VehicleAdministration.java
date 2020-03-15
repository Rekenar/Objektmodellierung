import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class VehicleAdministration {
    private ArrayList<Vehicle> vehicles;

    public VehicleAdministration(){
        this.vehicles = new ArrayList<>();
    }
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
    public void removeVehicle(int vehicleId){
        for(int i = 0; i<vehicles.size();i++){
            if(vehicles.get(i).getId()== vehicleId){
                vehicles.remove(i);
            }
        }
    }
    public void search(int vehicleId){
        for(int i = 0; i<vehicles.size();i++){
            if(vehicles.get(i).getId()== vehicleId){
                vehicles.get(i).printInfo();
            }
        }
    }
    public void printAllVehicles(){
        for(Vehicle e: vehicles){
            e.printInfo();
        }
    }
    public void printAllVehiclesbyWeight(){
        SortedbyWeight sorted = new SortedbyWeight();
        Collections.sort(vehicles,sorted);
        for(Vehicle e:vehicles){
            e.printInfo();
        }
    }
}
