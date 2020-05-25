public abstract class ExtrasDecorator extends Gericht {

	protected Gericht gericht;

	/**
	 * 
	 * @param gericht
	 */
	public ExtrasDecorator(Gericht gericht) {
		this.gericht = gericht;
	}

	public abstract void druckeBeschreibung();

}