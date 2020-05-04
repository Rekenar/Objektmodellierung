public class BaggerImpl extends BaumaschineImpl implements Bagger{

    /**
     * ----------------------------------------------------------------------
     *  Instance variables
     * ----------------------------------------------------------------------
     */

    private double Grabtiefe;
    private double Reichweite;

    /**
     * ----------------------------------------------------------------------
     *  Constructor
     * ----------------------------------------------------------------------
     */

    public BaggerImpl(String Name, int Leistung, double Geschwindigkeit, double Gewicht, double Grabtiefe, double Reichweite){
        super(Name, Leistung, Geschwindigkeit, Gewicht);
        try{
            if(Grabtiefe > MAX_GRABTIEFE || Reichweite > MAX_REICHWEITE){
                throw new Exception("Either 'Grabtiefe' or 'Reichweite is not in range'");
            }
            this.Grabtiefe = Grabtiefe;
            this.Reichweite = Reichweite;
        }catch (Exception e){
            System.out.println("Try again with another value for 'Grabtiefe' or 'Reichweite'");
        }
    }

    /**
     * ----------------------------------------------------------------------
     *  Getter Methods
     * ----------------------------------------------------------------------
     */

    @Override
    public double getGrabtiefe() {
        return Grabtiefe;
    }
    @Override
    public double getReichweite() {
        return Reichweite;
    }
    @Override
    public String getName() {
        return Name;
    }
    @Override
    public int getLeistung() {
        return Leistung;
    }
    @Override
    public double getGeschwindigkeit() {
        return Geschwindigkeit;
    }
    @Override
    public double getGewicht() {
        return Gewicht;
    }

    /**
     * ----------------------------------------------------------------------
     *  Setter Methods
     * ----------------------------------------------------------------------
     */

    @Override
    public void setGrabtiefe(double grabtiefe) {
        if(Grabtiefe <= MAX_GRABTIEFE){
            Grabtiefe = grabtiefe;
        }
    }
    @Override
    public void setReichweite(double reichweite) {
        if(Reichweite <= MAX_REICHWEITE){
            Reichweite = reichweite;
        }
    }
    @Override
    public void setName(String name) {
        Name = name;
    }
    @Override
    public void setLeistung(int leistung) {
        Leistung = leistung;
    }
    @Override
    public void setGeschwindigkeit(double geschwindigkeit) {
        Geschwindigkeit = geschwindigkeit;
    }
    @Override
    public void setGewicht(double gewicht) {
        Gewicht = gewicht;
    }


}
