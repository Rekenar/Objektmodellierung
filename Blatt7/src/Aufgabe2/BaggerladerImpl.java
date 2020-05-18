package Aufgabe2;
public class BaggerladerImpl extends BaggerImpl implements Baggerlader {

	public BaggerladerImpl(String name, int leistung, double geschwindigkeit, double gewicht, double grabtiefe, double reichweite, double schaufelvolumen, double kipphohe) {
		super(name, leistung, geschwindigkeit, gewicht, grabtiefe, reichweite);
		setSchaufelvolumen(schaufelvolumen);
		setKipphoehe(kipphohe);
	}

	public double schaufelvolumen;
	public double kipphohe;

	@Override
	public double getSchaufelvolumen() {
		return this.schaufelvolumen;
	}

	@Override
	public void setSchaufelvolumen(double schaufelvolumen) {
		if(schaufelvolumen>MAX_SCHAUFELVOLUMEN){
			System.out.println("Das maximale Schaufelvolumen wird überschritten!");
		}
		else{
			this.schaufelvolumen = schaufelvolumen;
		}
	}

	@Override
	public double getKipphoehe() {
		return this.kipphohe;
	}

	@Override
	public void setKipphoehe(double kipphohe) {
		if (kipphohe>MAX_KIPPHOEHE){
			System.out.println("Die maximale Kipphoehe wird überschritten!");
		}
		else{
			this.kipphohe = kipphohe;
		}
	}

	@Override
	public String toString() {
		return "BaggerladerImpl{" +
				"schaufelvolumen=" + schaufelvolumen +
				", kipphohe=" + kipphohe +
				", grabtiefe=" + grabtiefe +
				", reichweite=" + reichweite +
				", name='" + name + '\'' +
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
