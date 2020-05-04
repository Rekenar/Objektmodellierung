public interface Bagger extends Baumaschine {
    double MAX_GRABTIEFE = 15;
    double MAX_REICHWEITE = 18;
    double getGrabtiefe();
    void setGrabtiefe(double grabtiefe);
    double getReichweite();
    void setReichweite(double reichweite);
    @Override
    default void druckeBeschreibung(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Grabtiefe = " + getGrabtiefe());
        System.out.println("Reichweite = " + getReichweite());
        System.out.println("Name = " + getName());
        System.out.println("Leistung = " + getLeistung());
        System.out.println("Geschwindigkeit = " + getGeschwindigkeit());
        System.out.println("Gewicht = " + getGewicht());
    }
}
