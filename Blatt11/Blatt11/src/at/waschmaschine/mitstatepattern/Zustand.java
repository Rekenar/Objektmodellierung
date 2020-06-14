package at.waschmaschine.mitstatepattern;

public abstract class Zustand {
	public abstract void euroEinwerfen();
	public abstract void euroAuswerfen();
	public abstract void waschen();
	public abstract void waescheEntfernen();
	public void muenzbehaelterLeeren(){
		System.out.println("Der Münzbehälter ist noch nicht voll");
	}

	private int muenze = 0;

	public int getMuenze() {
		return muenze;
	}

	public void setMuenze(int muenze) {
		this.muenze = muenze;
	}

	public void addMuenze(){
		this.muenze++;
	}

	public void subMuenze(){
		this.muenze--;
	}


}
