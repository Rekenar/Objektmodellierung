package at.waschmaschine.mitstatepattern;

public class Waschmaschine {
	public Waschmaschine(int kapazitaetMuenzbehaelter){
		setAktuellerZustand(new KeinEuro(this));
		this.kapazitaetMuenzbehaelter = kapazitaetMuenzbehaelter;
	}

	private int kapazitaetMuenzbehaelter;
	private Zustand aktuellerZustand;

	public int getKapazitaetMuenzbehaelter() {
		return kapazitaetMuenzbehaelter;
	}

	public void setAktuellerZustand(Zustand aktuellerZustand){
		this.aktuellerZustand = aktuellerZustand;
	}

	public void euroEinwerfen(){
		aktuellerZustand.euroEinwerfen();
	}

	public void euroAuswerfen(){
		aktuellerZustand.euroAuswerfen();
	}

	public void waschen(){
		aktuellerZustand.waschen();
	}

	public void waescheEntfernen(){
		aktuellerZustand.waescheEntfernen();
	}

}
