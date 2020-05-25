public class Krautsalat extends ExtrasDecorator {

	/**
	 * 
	 * @param gericht
	 */
	public Krautsalat(Gericht gericht) {
		super(gericht);
	}

	public void druckeBeschreibung() {
		System.out.println("mit Krautsalat");
	}

	public double berechneKosten() {
		return gericht.berechneKosten() + 1.00;
	}

}