public interface Baggerlader extends Bagger, Lader {
    @Override
    default void druckeBeschreibung(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Grabtiefe = " + getGrabtiefe());
        System.out.println("Reichweite = " + getReichweite());
        System.out.println("Name = " + getName());
        System.out.println("Leistung = " + getLeistung());
        System.out.println("Geschwindigkeit = " + getGeschwindigkeit());
        System.out.println("Gewicht = " + getGewicht());
        System.out.println("Schaufelvolumen = " + getSchaufelvolumen());
        System.out.println("Kipphoehe = " + getKipphoehe());
    }
}
