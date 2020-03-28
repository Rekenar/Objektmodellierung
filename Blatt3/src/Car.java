import java.util.ArrayList;

public class Car extends Vehicle {
    private double fuel;
    private double maxFuel;
    private double fuelConsumption;

    /**
     * Constructor Car that calls the constructor of the superclass.
     * @param maxFuel
     * @param fuelConsumption
     */

    public Car(String name, int weight, int maxPermissableWeight,
               double maxSpeed, ArrayList<Workshop> workshops, Brand brand, double maxFuel, double fuelConsumption){
        super(name, weight,maxPermissableWeight,maxSpeed, workshops,brand);
        setFuel(0);
        setMaxFuel(maxFuel);
        setFuelConsumption(fuelConsumption);
    }

    /**
     * Getter
     */

    public double getFuel() {
        return fuel;
    }
    public double getMaxFuel() {
        return maxFuel;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Setter
     */

    private void setFuel(double fuel){
        if(fuel >= 0){
            this.fuel = fuel;
        }
    }
    private void setMaxFuel(double maxFuel){
        if(maxFuel >= getFuel()){
            this.maxFuel = maxFuel;
        }
    }
    private void setFuelConsumption(double fuelConsumption){
        if(fuelConsumption > 0){
            this.fuelConsumption = fuelConsumption;
        }
    }

    /**
     * Method fillUp()
     * Can only fill up to maxFuel.
     * Excess fuel goes into nothingness.
     * @param fuel
     */

    public void fillUp(double fuel){
        if(getFuel()+ fuel >= getMaxFuel()){
            setFuel(getMaxFuel());
        }else{
            setFuel(getFuel() + fuel);
        }
    }
    @Override
    /**
     * Method drive()
     * Overrides the drive() Method from Vehicle.
     * Fuel should decrease per kilometer based on the fuel consumption
     * If not enough fuel left it gives back the driven kilometers
     * @param kilometers
     * */
    public void drive(int kilometers){
        double nfuelConsumption = fuelConsumption/100;
        for(int  i = kilometers; i > 0; i--){
            if(getFuel() >= roundAvoid(nfuelConsumption,2)){
                setFuel(roundAvoid(getFuel(),2) - roundAvoid(nfuelConsumption,2));
                continue;
            }
            System.out.println("Not enough fuel!!");
            System.out.println("Driven kilometers: " + (kilometers-i));
            break;
        }
    }

    /**
     * Method for rounding because the last kilometer isn't driven when not rounded.
     * We use a power of ten (depending on how many decimal places we want)
     * @param value
     * @param places
     * @return
     */
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
    @Override
    /**
     * Method printInfo()
     * Overrides the printInfo() Method from Vehicle.
     * Gives back every Information of the Car including "fuel", "maxFuel", "fuelConsumption"
     */
    public void printInfo(){
        System.out.println("Standard information:");
        System.out.println("ID:" + getId() + ", Name:" + getName() + ", Weight:" + getWeight() + ", MaxPermissableWeight: "
                + getMaxPermissableWeight() + ", Speed: " + getSpeed() + ", MaxSpeed: " + getMaxSpeed() + ", Fuel: " + getFuel()
                + ", MaxFuel: " + getMaxFuel() + ", FuelConsumption: " + getFuelConsumption());

        System.out.println("Brand:");
        System.out.println("Name: "+ getBrand().getName() + ", Country: " + getBrand().getCountry()
                + ", eMail: " + getBrand().getEmail() + ", Phone: " + getBrand().getPhone());

        System.out.println("Workshops:");
        for(Workshop i:getWorkshops()){
            System.out.println("Name: " +i.getName() + ", Country: " + i.getCountry() + ", City: " + i.getCity()
                    + ", Postcode: " + i.getPostcode()+ ", Street : " +i.getStreet() + ", Phone: " + i.getPhone());
        }
    }
}