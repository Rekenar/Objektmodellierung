package Aufgabe2;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SomeSensor someSensor = new SomeSensor();
		SomeSensorReader someSensorReader = new SomeSensorReader();
		someSensor.addObserver(someSensorReader);
	}
	

}
