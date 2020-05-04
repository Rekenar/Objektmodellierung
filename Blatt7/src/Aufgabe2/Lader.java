package Aufgabe2;
public interface Lader extends Baumaschine{
	static final double MAX_SCHAUFELVOLUMEN = 10;
	static final double MAX_KIPPHOEHE = 5;

	double getSchaufelvolumen();
	void setSchaufelvolumen(double schaufelvolumen);
	double getKipphoehe();
	void setKipphoehe(double kipphohe);

	/*

	@Override
	default void druckeBeschreibung(){}

	 */

}
