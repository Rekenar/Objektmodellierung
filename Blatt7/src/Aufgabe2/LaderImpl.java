package Aufgabe2;
public class LaderImpl extends BaumaschineImpl implements Lader {
	public LaderImpl(String name, int leistung, double geschwindigkeit, double gewicht, double schaufelvolumen, double kipphohe) {
		super(name, leistung, geschwindigkeit, gewicht);
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
		return "LaderImpl{" +
				"schaufelvolumen=" + schaufelvolumen +
				", kipphohe=" + kipphohe +
				", name='" + name + '\'' +
				", leistung=" + leistung +
				", geschwindigkeit=" + geschwindigkeit +
				", gewicht=" + gewicht +
				'}';
	}

	/*
	public void druckeBeschreibung(){       //still not necessary
		System.out.println(toString());
	}

	 */
}
