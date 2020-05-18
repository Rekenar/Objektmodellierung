package Aufgabe3;

import java.util.Random;

public class TestUni {
	public static void main(String[] args) {
		Random rnd = new Random();
		Forschungsgruppe f1 = new Forschungsgruppe("KLU", "Carl", rnd.nextInt(10), rnd.nextInt(30));
		Forschungsgruppe f2 = new Forschungsgruppe("VIL", "Thomas", rnd.nextInt(10), rnd.nextInt(30));

		Institut institut1 = new Institut();
		institut1.addUniversity(f1);
		institut1.addUniversity(f2);
		System.out.println(institut1.getEmployees());
		System.out.println(institut1.getPublications());
	}
}

