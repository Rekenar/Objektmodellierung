package Aufgabe2;
public abstract class BaumaschineImpl implements Baumaschine {
	public String name;
	public int leistung;
	public double geschwindigkeit;
	public double gewicht;

	public BaumaschineImpl(String name, int leistung, double geschwindigkeit, double gewicht) {
		setName(name);
		setLeistung(leistung);
		setGewicht(gewicht);
		setGeschwindigkeit(geschwindigkeit);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getLeistung() {
		return leistung;
	}

	@Override
	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	@Override
	public double getGeschwindigkeit() {
		return this.geschwindigkeit;
	}

	@Override
	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	@Override
	public double getGewicht() {
		return this.gewicht;
	}

	@Override
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return "BaumaschineImpl{" +
				"name='" + name + '\'' +
				", leistung=" + leistung +
				", geschwindigkeit=" + geschwindigkeit +
				", gewicht=" + gewicht +
				'}';
	}
	/*
	@Override
	public void druckeBeschreibung() {
		System.out.println(toString());
	}
	*/
}
