public interface Lader extends Baumaschine{
    double MAX_SCHAUFELVOLUMEN = 10;
    double MAX_KIPPHOEHE = 5;
    double getSchaufelvolumen();
    void setSchaufelvolumen(double schaufelvolumen);
    double getKipphoehe();
    void setKipphoehe(double kipphoehe);
    @Override
    default void druckeBeschreibung(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Kipphoehe = " + getKipphoehe());
        System.out.println("Schaufelvolumen = " + getSchaufelvolumen());
    }
}
