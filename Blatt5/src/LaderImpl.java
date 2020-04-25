public class LaderImpl extends BaumaschineImpl implements Lader {

    /**
     * ----------------------------------------------------------------------
     *  Instance variables
     * ----------------------------------------------------------------------
     */

    private double Kipphoehe;
    private double Schaufelvolumen;

    /**
     * ----------------------------------------------------------------------
     *  Constructor
     * ----------------------------------------------------------------------
     */

    public LaderImpl(String Name, int Leistung, double Geschwindigkeit, double Gewicht, double Kipphoehe, double Schaufelvolumen){
        super(Name, Leistung, Geschwindigkeit, Gewicht);
        try{
            if(Kipphoehe > MAX_KIPPHOEHE || Schaufelvolumen > MAX_SCHAUFELVOLUMEN){
                throw new Exception("Either 'Kipphoehe' or 'Schaufelvolumen is not in range'");
            }
            this.Kipphoehe = Kipphoehe;
            this.Schaufelvolumen = Schaufelvolumen;
        }catch (Exception e){
            System.out.println("Try again with another value for 'Kipphoehe' or 'Schaufelvolumen'");
        }
    }

    /**
     * ----------------------------------------------------------------------
     *  Getter Methods
     * ----------------------------------------------------------------------
     */

    @Override
    public double getSchaufelvolumen() {
        return Schaufelvolumen;
    }
    @Override
    public double getKipphoehe() {
        return Kipphoehe;
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
    public void setSchaufelvolumen(double schaufelvolumen) {
        if(Schaufelvolumen <= MAX_SCHAUFELVOLUMEN){
            Schaufelvolumen = schaufelvolumen;
        }
    }
    @Override
    public void setKipphoehe(double kipphoehe) {
        if(Kipphoehe <= MAX_KIPPHOEHE){
            Kipphoehe = kipphoehe;
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


    @Override
    public void druckeBeschreibung() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Name = " + getName());
        System.out.println("Kipphoehe = " + getKipphoehe());
        System.out.println("Schaufelvolumen = " + getSchaufelvolumen());
        System.out.println("Leistung = " + getLeistung());
        System.out.println("Geschwindigkeit = " + getGeschwindigkeit());
        System.out.println("Gewicht = " + getGewicht());
    }
}
