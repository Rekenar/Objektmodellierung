public class Senf extends ExtrasDecorator {

	/**
	 * 
	 * @param gericht
	 */
	public Senf(Gericht gericht) {
		super(gericht);

	}

	public void druckeBeschreibung() {
		System.out.println("mit Senf");
	}

	public double berechneKosten() {
		return gericht.berechneKosten() + 0.20;

	}

}