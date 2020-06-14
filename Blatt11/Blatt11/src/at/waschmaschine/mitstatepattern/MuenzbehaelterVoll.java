package at.waschmaschine.mitstatepattern;

public class MuenzbehaelterVoll extends Zustand{
	public MuenzbehaelterVoll(Waschmaschine waschmaschine){
		this.waschmaschine = waschmaschine;
	}

	private Waschmaschine waschmaschine;

	@Override
	public void euroEinwerfen(){
		System.out.println("Münzbehälter voll, wenden Sie sich an das Servicepersonal");
	}

	@Override
	public void euroAuswerfen(){
		System.out.println("Es wurde vorher kein Euro eingeworfen");
	}

	@Override
	public void waschen(){
		System.out.println("Waschen nicht möglich");;
	}

	@Override
	public void waescheEntfernen(){
		System.out.println("Es wurde keine Wäsche gewaschen");
	}

	@Override
	public void muenzbehaelterLeeren(){
		System.out.println("Der Münzbehälter wurde geleert");
		setMuenze(0);
		waschmaschine.setAktuellerZustand(new KeinEuro(waschmaschine));
	}
}
