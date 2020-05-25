public class Spezialsauce extends ExtrasDecorator {

	/**
	 * 
	 * @param gericht
	 */
	public Spezialsauce(Gericht gericht) {
		super(gericht);

	}

	public void druckeBeschreibung() {
		System.out.println("mit Spezialsauce");
	}

	public double berechneKosten() {
		return gericht.berechneKosten() + 0.70;

	}

}