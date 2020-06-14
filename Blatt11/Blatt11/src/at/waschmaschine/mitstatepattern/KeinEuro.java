package at.waschmaschine.mitstatepattern;

public class KeinEuro extends Zustand{
	public KeinEuro(Waschmaschine waschmaschine){
		this.waschmaschine = waschmaschine;
	}

	private Waschmaschine waschmaschine;

	@Override
	public void euroEinwerfen(){
		System.out.println("Euro eingeworfen, Waschprogramm kann gestartet werden");
		waschmaschine.setAktuellerZustand(new EuroEingeworfen(waschmaschine));
		addMuenze();
	}

	@Override
	public void euroAuswerfen(){
		System.out.println("Es wurde vorher kein Euro eingeworfen");
	}

	@Override
	public void waschen(){
		System.out.println("Kein Euro eingeworfen, waschen nicht möglich");
	}

	@Override
	public void waescheEntfernen(){
		System.out.println("Es wurde keine Wäsche gewaschen");
	}

}
