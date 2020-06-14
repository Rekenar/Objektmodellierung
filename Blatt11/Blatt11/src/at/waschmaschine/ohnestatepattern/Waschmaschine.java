package at.waschmaschine.ohnestatepattern;



public class Waschmaschine {
	
	private final static int KEIN_EURO = 0;
	private final static int EURO_EINGEWORFEN = 1;
	private final static int MUENZBEHAELTER_VOLL = 2;
	private final static int GEWASCHEN = 3;
	
	private int zustand = KEIN_EURO;
	
	private int kapazitaetMunzbehaelter;
	private int anzahlMuenzen; 
	
	public Waschmaschine(int kapazitaetMunzbehaelter){
		this.kapazitaetMunzbehaelter=kapazitaetMunzbehaelter;
		this.anzahlMuenzen = 0;
	}

	
	public void euroEinwerfen(){
		if(zustand == KEIN_EURO){
			System.out.println("Euro eingeworfen, Waschprogramm kann gestartet werden");
			anzahlMuenzen++;
			zustand = EURO_EINGEWORFEN;
		}
		else if (zustand == EURO_EINGEWORFEN){
			System.out.println("Es wurde bereits ein Euro eingeworfen");
		}
		else if (zustand == MUENZBEHAELTER_VOLL){
			System.out.println("Münzbehälter voll, wenden Sie sich an das Servicepersonal");
		}
		else if (zustand == GEWASCHEN){
			System.out.println("Wäsche wurde bereits gewaschen, kein Euro mehr notwendig");
		}
	}
	
	public void euroAuswerfen(){
		if(zustand == KEIN_EURO){
			System.out.println("Es wurde vorher kein Euro eingeworfen");
		}
		else if (zustand == EURO_EINGEWORFEN){
			System.out.println("Euro wird ausgeworfen");
			anzahlMuenzen--;
			zustand = KEIN_EURO;
		}
		else if (zustand == MUENZBEHAELTER_VOLL){
			System.out.println("Es wurde vorher kein Euro eingeworfen");
		}
		else if (zustand == GEWASCHEN){
			System.out.println("Wäsche wurde bereits gewaschen");
		}
	}

	public void waschen(){
		if(zustand == KEIN_EURO){
			System.out.println("Kein Euro eingeworfen, waschen nicht möglich");
		}
		else if (zustand == EURO_EINGEWORFEN){
			System.out.println("Wäsche wird gewaschen");
			zustand = GEWASCHEN;
		}
		else if (zustand == MUENZBEHAELTER_VOLL){
			System.out.println("Waschen nicht möglich");
		}
		else if (zustand == GEWASCHEN){
			System.out.println("Wäsche wurde bereits gewaschen");
		}
	}
	
	public void waescheEntfernen(){
		if(zustand == KEIN_EURO){
			System.out.println("Es wurde keine Wäsche gewaschen");
		}
		else if (zustand == EURO_EINGEWORFEN){
			System.out.println("Es wurde keine Wäsche gewaschen");
		}
		else if (zustand == MUENZBEHAELTER_VOLL){
			System.out.println("Es wurde keine Wäsche gewaschen");
		}
		else if (zustand == GEWASCHEN){
			System.out.println("Ihre Wäsche ist nun sauber");
			if(anzahlMuenzen >= kapazitaetMunzbehaelter){
				zustand = MUENZBEHAELTER_VOLL;
			}
			else{
				zustand = KEIN_EURO;
			}
		}
	}
	
}
