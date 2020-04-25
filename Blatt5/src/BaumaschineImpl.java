public abstract class BaumaschineImpl implements Baumaschine{

    /**
     * ----------------------------------------------------------------------
     *  Instance variables
     * ----------------------------------------------------------------------
     */

    public String Name;
    public int Leistung;
    public double Geschwindigkeit;
    public double Gewicht;

    /**
     * ----------------------------------------------------------------------
     *  Constructor
     * ----------------------------------------------------------------------
     */

    public BaumaschineImpl(String Name, int Leistung, double Geschwindigkeit, double Gewicht){
        this.Name = Name;
        this.Leistung = Leistung;
        this.Geschwindigkeit = Geschwindigkeit;
        this.Gewicht = Gewicht;
    }

    /**
     * ----------------------------------------------------------------------
     *  Getter Methods
     * ----------------------------------------------------------------------
     */

    @Override
    public String getName() {
        return Name;
    }
    @Override
    public double getGeschwindigkeit() {
        return Geschwindigkeit;
    }
    @Override
    public double getGewicht() {
        return Gewicht;
    }
    @Override
    public int getLeistung() {
        return Leistung;
    }

    /**
     * ----------------------------------------------------------------------
     *  Setter Methods
     * ----------------------------------------------------------------------
     */

    @Override
    public void setName(String name) {
        Name = name;
    }
    @Override
    public void setGeschwindigkeit(double geschwindigkeit) {
        Geschwindigkeit = geschwindigkeit;
    }
    @Override
    public void setGewicht(double gewicht) {
        Gewicht = gewicht;
    }


    @Override
    public void druckeBeschreibung() {

    }
}
