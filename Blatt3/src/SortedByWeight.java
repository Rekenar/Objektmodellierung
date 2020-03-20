import java.util.Comparator;

//Class for sorting via the weight attribute

public class SortedByWeight implements Comparator<Vehicle> {

//overriding the compare method of the Comparator Interface
    public int compare(Vehicle v1, Vehicle v2){
        if(v1.getWeight()<v2.getWeight()) return -1;
        if(v1.getWeight()>v2.getWeight()) return 1;
        else return 0;
    }
}
