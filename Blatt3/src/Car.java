import java.util.ArrayList;

public class Car extends Vehicle {
    private double fuel;
    private double maxfuel;
    private double fuelConsumption;

    /**
     * Constructor Car that calls the constructor of the superclass.
     * @param maxfuel
     * @param fuelConsumption
     */

    public Car(String name, int weight, int maxPermissableWeight,
               double maxSpeed, ArrayList<Workshop> workshops, Brand brand, double maxfuel, double fuelConsumption){
        super(name, weight,maxPermissableWeight,maxSpeed, workshops,brand);
        this.fuel = 0;
        this.maxfuel = maxfuel;
        this.fuelConsumption = fuelConsumption;
    }
/**
 * Getter
 */
    public
}
