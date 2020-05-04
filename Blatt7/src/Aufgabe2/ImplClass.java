package Aufgabe2;
public class ImplClass implements Bagger, Lader {
	public ImplClass(String name, int leistung, double geschwindigkeit, double gewicht, double grabtiefe, double reichweite, double schaufelvolumen, double kipphohe) {
		setGrabtiefe(grabtiefe);
		setReichweite(reichweite);
		setSchaufelvolumen(schaufelvolumen);
		setKipphoehe(kipphohe);
		setName(name);
		setLeistung(leistung);
		setGewicht(gewicht);
		setGeschwindigkeit(geschwindigkeit);
	}
	public String name;
	public int leistung;
	public double geschwindigkeit;
	public double gewicht;
	public double grabtiefe;
	public double reichweite;
	public double schaufelvolumen;
	public double kipphohe;

	/**
	 * Bagger
	 *
	 *============================================================================
	 */

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

	/**
	 * Lader
	 *
	 *============================================================================
	 */

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

	/**
	 * Baumaschine
	 *
	 *============================================================================
	 */
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



}
