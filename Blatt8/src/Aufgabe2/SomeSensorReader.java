package Aufgabe2;

public class SomeSensorReader implements SomeSensorReaderInterface {

	long sensor;

	public SomeSensorReader() {
		System.out.println("Start reading values...");
	}

	@Override
	public void update(Object o) {
		this.sensor = (long) o;
		System.out.println("New Value: " + sensor);
	}

}