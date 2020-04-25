public interface Bagger extends Baumaschine {
    double MAX_GRABTIEFE = 15;
    double MAX_REICHWEITE = 18;
    double getGrabtiefe();
    void setGrabtiefe(double grabtiefe);
    double getReichweite();
    void setReichweite(double reichweite);
    void druckeBeschreibung();
}
