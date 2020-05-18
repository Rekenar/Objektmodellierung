package Aufgabe3;
public class Forschungsgruppe implements University {

	String Bezeichnung;
	String NameLeiter;
	int Employees;
	int Publications;
	public Forschungsgruppe(String bezeichnung, String nameLeiter, int employees, int publications) {
		Bezeichnung = bezeichnung;
		NameLeiter = nameLeiter;
		Employees = employees;
		Publications = publications;
	}

	@Override
	public int getEmployees() {
		return this.Employees;
	}

	@Override
	public int getPublications() {
		return this.Publications;
	}
}
