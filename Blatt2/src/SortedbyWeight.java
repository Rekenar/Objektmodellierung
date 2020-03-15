import java.util.Comparator;

public class SortedbyWeight implements Comparator<Vehicle> {
    public int compare(Vehicle v1, Vehicle v2){
        if(v1.getWeight()<v2.getWeight()) return -1;
        if(v1.getWeight()>v2.getWeight()) return 1;
        else return 0;
    }
}
