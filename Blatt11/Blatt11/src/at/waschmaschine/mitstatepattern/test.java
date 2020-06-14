package at.waschmaschine.mitstatepattern;


import at.waschmaschine.ohnestatepattern.Waschmaschine;

public class test {

	public static void main(String[] args) {
		at.waschmaschine.ohnestatepattern.Waschmaschine wm = new Waschmaschine(2);

		wm.euroEinwerfen();
		wm.waschen();
		wm.waescheEntfernen();
		System.out.println("-------------------------------------------------------");
		wm.euroEinwerfen();
		wm.euroAuswerfen();
		wm.waschen();
		wm.waescheEntfernen();
		System.out.println("-------------------------------------------------------");
		wm.waescheEntfernen();
		wm.waschen();
		wm.euroAuswerfen();
		wm.euroEinwerfen();
		wm.euroEinwerfen();
		wm.waschen();
		wm.waescheEntfernen();
		System.out.println("-------------------------------------------------------");
		wm.euroEinwerfen();
		wm.waschen();
		wm.waescheEntfernen();


	}

}
