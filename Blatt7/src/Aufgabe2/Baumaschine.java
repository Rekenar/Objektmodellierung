package Aufgabe2;
public interface Baumaschine {
	String getName();
	void setName(String name);
	int getLeistung();
	void setLeistung(int leistung);
	double getGeschwindigkeit();
	void setGeschwindigkeit(double geschwindigkeit);
	double getGewicht();
	void setGewicht(double gewicht);

	default void druckeBeschreibung(){
		System.out.println(toString());
	}
}
