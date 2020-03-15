import java.util.ArrayList;

public class Vehicle {
private int id;
private String name;
private Brand brand;
private ArrayList<Workshop> workshops;
private int weight;
private int maxPermissableWeight;
private double speed;
private double maxSpeed;

    public Vehicle(String name, int id, int weight, int maxPermissableWeight,
             double maxSpeed, ArrayList<Workshop> workshops, Brand brand){
        this.name =name;
        this.id = id;
        this.weight = weight;
        this.maxPermissableWeight = maxPermissableWeight;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.workshops = workshops;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }
    public ArrayList<Workshop> getWorkshops() {
        return workshops;
    }
    public int getWeight() {
        return weight;
    }

    public int getMaxPermissableWeight() {
        return maxPermissableWeight;
    }

    public double getSpeed() {
        return speed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setId(int id) {
        if(id>=0){
            this.id = id;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setWorkshops(ArrayList<Workshop> workshops) {
        for(Workshop e:workshops){
            this.workshops.add(e);
        }
    }

    public void setWeight(int weight) {
        if(weight>0){
            this.weight = weight;
        }
    }

    public void setMaxPermissableWeight(int maxPermissableWeight) {
        if(maxPermissableWeight>=0){
            this.maxPermissableWeight = maxPermissableWeight;
        }
    }

    public void setSpeed(double speed) {
        if(speed >=0){
            if(this.speed + speed <= maxSpeed){
                this.speed += speed;
            }
        }else{
            if(this.speed + speed >= 0){
                this.speed += speed;
            }
        }
    }

    public void setMaxSpeed(double maxSpeed) {
        if(maxSpeed>=0){
            this.maxSpeed = maxSpeed;
        }
    }

    public double accelerate(){
        setSpeed(10);
        return speed;
    }
    public double brake(){
        setSpeed(-10);
        return speed;
    }
    public void drive(int kilometers){
        for(int i = kilometers; i>0; i--){
            accelerate();
            accelerate();
            accelerate();
            brake();
            brake();
            brake();
        }
    }
    public void printInfo(){
        System.out.println("Standard information:");
        System.out.println("ID:" + getId() + ", Name:" + getName() + ", Weight:" + getWeight() + ", MaxPermissableWeight: "
                + getMaxPermissableWeight() + ", Speed: " + getSpeed() + ", MaxSpeed: " + getMaxSpeed());

        System.out.println("Brand:");
        System.out.println("Name: " + getBrand().getName() + ", Country: " + getBrand().getCountry()
                + ", eMail:" + getBrand().getEmail() + ", Phone: " + getBrand().getPhone());

        System.out.println("Workshops:");
        for(Workshop i:getWorkshops()){
            System.out.println("Name:" +i.getName() + ", Country:" + i.getCountry() + ", City:" + i.getCity()
                    + ", Postcode:" + i.getPostcode()+ ", Street:" +i.getStreet() + ", Phone:" + i.getPhone());
        }
    }
    public Workshop getWorkshop(int postcode){
        for(Workshop e:workshops){
            if(e.getPostcode()==postcode){
                return e;
            }
        }
        return null;
    }
}
