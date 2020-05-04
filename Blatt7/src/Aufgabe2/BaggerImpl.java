package Aufgabe2;
public class BaggerImpl extends BaumaschineImpl implements Bagger{
	public BaggerImpl(String name, int leistung, double geschwindigkeit, double gewicht, double grabtiefe, double reichweite) {
		super(name, leistung, geschwindigkeit, gewicht);
		setGrabtiefe(grabtiefe);
		setReichweite(reichweite);
	}

	public double grabtiefe;
	public double reichweite;

	@Override
	public double getGrabtiefe() {
		return this.grabtiefe;
	}

	@Override
	public void setGrabtiefe(double grabtiefe) {
		if(grabtiefe>MAX_GRABTIEFE){
			System.out.println("Die maximale Grabtiefe wird überschritten!");
		}
		else{
			this.grabtiefe = grabtiefe;
		}
	}

	@Override
	public double getReichweite() {
		return this.reichweite;
	}

	@Override
	public void setReichweite(double reichweite) {
		if(reichweite>MAX_REICHWEITE){
			System.out.println("Die maximale Reichweite wird überschritten!");
		}
		else{
			this.reichweite = reichweite;
		}
	}


	@Override
	public String toString() {
		return "BaggerImpl{" +
				"grabtiefe=" + grabtiefe +
				", reichweite=" + reichweite +
				", name='" + name + '\'' +
				", leistung=" + leistung +
				", geschwindigkeit=" + geschwindigkeit +
				", gewicht=" + gewicht +
				'}';
	}

	/*
	@Override
	public void druckeBeschreibung(){       //not necessary
		System.out.println(toString());
	}

	 */

}
