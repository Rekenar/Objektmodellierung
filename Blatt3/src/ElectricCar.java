import java.util.ArrayList;

public class ElectricCar extends Vehicle {

    private double batteryLevel;
    private double maxBatteryCapacity;
    private double powerConsumption;

    /**
     * Constructor ElectricCar that calls the constructor of the superclass.
     * @param maxBatteryCapacity
     * @param powerConsumption
     */
    public ElectricCar(String name, int weight, int maxPermissableWeight,
                       double maxSpeed, ArrayList<Workshop> workshops,
                       Brand brand, double maxBatteryCapacity, double powerConsumption){
        super(name, weight,maxPermissableWeight,maxSpeed, workshops,brand);
        this.batteryLevel = 0;
        this.maxBatteryCapacity = maxBatteryCapacity;
        this.powerConsumption = powerConsumption;
    }
    /**
     * Getter
     */
    public double getBatteryLevel(){
        return batteryLevel;
    }
    public double getMaxBatteryCapacity(){
        return maxBatteryCapacity;
    }
    public double getPowerConsumption(){
        return powerConsumption;
    }

    /**
     * Setter
     */
    private void setBatteryLevel(double batteryLevel){
        if(batteryLevel > 0){
            this.batteryLevel =  batteryLevel;
        }
    }
    private void setMaxBatteryCapacity(double maxBatteryCapacity){
        if(maxBatteryCapacity < getBatteryLevel()){
            this.maxBatteryCapacity = maxBatteryCapacity;
        }
    }
    private void setPowerConsumption(double powerConsumption){
        if(powerConsumption > 0){
            this.powerConsumption = powerConsumption;
        }
    }
    /**
     * Method charge(double power, double hours)
     * Add the power to the BatteryLevel.
     * @param hours duration of charging
     * @param power power that gets charged
     */
    public void charge(double power, double hours){
        double powerPerhour = power/hours;
        for(int i = 0;i<hours;i++){
            if(getBatteryLevel() + powerPerhour > getMaxBatteryCapacity()){
                setBatteryLevel(getMaxBatteryCapacity());
                break;
            }
            setBatteryLevel(getBatteryLevel() + powerPerhour);
        }
    }
    @Override
    /**
     * Method drive(int kilometers)
     *
     */
    public void drive(int kilometers){
        for(int i = kilometers; i > 0; i++){
            if(getBatteryLevel() -  getPowerConsumption() < 0.0){
                System.out.println("Not enough power!!");
                System.out.println("Driven kilometers: " + (kilometers - i));
            }
            setBatteryLevel(getBatteryLevel()-getPowerConsumption());
        }
    }
    @Override
    /**
     * Method brake()
     * If this.speed is greater than zero add 0.001 to the batteryLevel.
     * @return
     */
    public double brake(){
        if(getSpeed()>0){
            setBatteryLevel(getBatteryLevel()+0.001);
            return getBatteryLevel();
        }
        return getBatteryLevel();
    }
    @Override
    /**
     * Method printInfo()
     * Overrides method from superclass and additionally gives Info about the charge.
     */
    public void printInfo() {
        System.out.println("Standard information:");
        System.out.println("ID:" + getId() + ", Name:" + getName() + ", Weight:" + getWeight() + ", MaxPermissableWeight: "
                + getMaxPermissableWeight() + ", Speed: " + getSpeed() + ", MaxSpeed: " + getMaxSpeed() + ", Battery: " + getBatteryLevel()
                + ", MaxBatteryCapacity: " + getMaxBatteryCapacity() + ", PowerConsumption: " + getPowerConsumption());

        System.out.println("Brand:");
        System.out.println("Name: " + getBrand().getName() + ", Country: " + getBrand().getCountry()
                + ", EMail: " + getBrand().getEmail() + ", Phone: " + getBrand().getPhone());

        System.out.println("Workshops:");
        for (Workshop i : getWorkshops()) {
            System.out.println("Name: " + i.getName() + ", Country: " + i.getCountry() + ", City: " + i.getCity()
                    + ", Postcode: " + i.getPostcode() + ", Street: " + i.getStreet() + ", Phone: " + i.getPhone());
        }
    }
}
