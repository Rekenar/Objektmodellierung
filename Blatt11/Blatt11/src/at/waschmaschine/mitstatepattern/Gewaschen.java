package at.waschmaschine.mitstatepattern;

public class Gewaschen extends Zustand{
	public Gewaschen(Waschmaschine waschmaschine){
		this.waschmaschine = waschmaschine;
	}

	private Waschmaschine waschmaschine;

	@Override
	public void euroEinwerfen(){
		System.out.println("Wäsche wurde bereits gewaschen, kein Euro mehr notwendig");
	}

	@Override
	public void euroAuswerfen(){
		System.out.println("Wäsche wurde bereits gewaschen");
	}

	@Override
	public void waschen(){
		System.out.println("Wäsche wurde bereits gewaschen");
	}

	@Override
	public void waescheEntfernen(){
		System.out.println("Ihre Wäsche ist nun sauber");

		if(getMuenze()<waschmaschine.getKapazitaetMuenzbehaelter()){
			waschmaschine.setAktuellerZustand(new KeinEuro(waschmaschine));
		}
		else{
			waschmaschine.setAktuellerZustand(new MuenzbehaelterVoll(waschmaschine));
		}
	}

}
