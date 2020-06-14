package at.waschmaschine.mitstatepattern;

public class EuroEingeworfen extends Zustand{
	public EuroEingeworfen(Waschmaschine waschmaschine){
		this.waschmaschine = waschmaschine;
	}

	private Waschmaschine waschmaschine;

	@Override
	public void euroEinwerfen(){
		System.out.println("Es wurde bereits ein Euro eingeworfen");
	}

	@Override
	public void euroAuswerfen(){
		System.out.println("Euro wird ausgeworfen");
		waschmaschine.setAktuellerZustand(new KeinEuro(waschmaschine));
		subMuenze();
	}

	@Override
	public void waschen(){
		System.out.println("Wäsche wird gewaschen");
		waschmaschine.setAktuellerZustand(new Gewaschen(waschmaschine));
	}

	@Override
	public void waescheEntfernen(){
		System.out.println("Es wurde keine Wäsche gewaschen");
	}

}
