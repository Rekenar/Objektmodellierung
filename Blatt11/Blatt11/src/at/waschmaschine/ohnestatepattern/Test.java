package at.waschmaschine.ohnestatepattern;

public class Test {

	public static void main(String[] args) {
		Waschmaschine wm = new Waschmaschine(2);
		
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
