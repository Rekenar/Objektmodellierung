package Aufgabe2;
public interface Bagger extends Baumaschine{
	static final double MAX_GRABTIEFE = 15;
	static final double MAX_REICHWEITE = 18;

	double getGrabtiefe();
	void setGrabtiefe(double grabtiefe);
	double getReichweite();
	void setReichweite(double reichweite);

	/*
	@Override
	default void druckeBeschreibung(){
		System.out.println(
				"Grabtiefe=" + getGrabtiefe() +
				", Reichweite=" + getReichweite() +
				", Name='" + getName() + '\'' +
				", Leistung=" + getLeistung() +
				", Geschwindigkeit=" + getGeschwindigkeit() +
				", Gewicht=" + getGewicht()
				);
	}

	 */

}
