public class Gurke extends ExtrasDecorator {

	/**
	 * 
	 * @param gericht
	 */
	public Gurke(Gericht gericht) {
		super(gericht);

	}

	public void druckeBeschreibung() {
		System.out.println("mit Gurke");
	}

	public double berechneKosten() {
		return gericht.berechneKosten() + 0.50;
	}

}