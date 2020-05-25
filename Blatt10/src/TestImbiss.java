
public class TestImbiss {

	public static void main(String[] args) {
		
		Gericht b1 = new Bratwurst();
		b1.druckeBeschreibung();
		System.out.println("Kosten: "+b1.berechneKosten()+"\n");
		
		Gericht b2 = new Bratwurst();
		b2 = new Senf(b2);
		b2 = new Krautsalat(b2);
		b2.druckeBeschreibung();
		System.out.println("Kosten: "+b2.berechneKosten()+"\n");
		
		Gericht h1 = new Hendl();
		h1 = new Krautsalat(h1);
		h1 = new Gurke(h1);
		h1 = new Spezialsauce(h1);
		h1.druckeBeschreibung();
		System.out.println("Kosten: "+h1.berechneKosten()+"\n");
		
		
		/* Ausgabe
	
		Bratwurst
		Kosten: 5.0

		Bratwurst
		mit Senf
		mit Krautsalat
		Kosten: 6.2

		Hendl
		mit Krautsalat
		mit Gurke
		mit Spezialsauce
		Kosten: 9.2
		
		*/
		
		
	

	}

}
