public class BaggerladerImpl extends BaggerImpl implements Baggerlader {

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

    public BaggerladerImpl(String Name, int Leistung, double Geschwindigkeit, double Gewicht, double Kipphoehe, double Schaufelvolumen, double Grabtiefe, double Reichweite){

        super(Name, Leistung, Geschwindigkeit, Gewicht, Grabtiefe, Reichweite);
        try{
            if(Kipphoehe > MAX_KIPPHOEHE || Schaufelvolumen > MAX_SCHAUFELVOLUMEN || Grabtiefe > MAX_GRABTIEFE || Reichweite > MAX_REICHWEITE){
                throw new Exception("Either 'Kipphoehe' or 'Schaufelvolumen is not in range'");
            }
            this.Kipphoehe = Kipphoehe;
            this.Schaufelvolumen = Schaufelvolumen;
        }catch (Exception e){
            System.out.println("Set another value for 'Kipphoehe' or 'Schaufelvolumen'");
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

}