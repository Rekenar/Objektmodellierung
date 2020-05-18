package Aufgabe2;

import java.util.ArrayList;
import java.util.Random;

public class SomeSensor {

	private long currentValue;
	private ArrayList<SomeSensorReaderInterface> change = new ArrayList();
	public SomeSensor() {
		System.out.println("Initializing sensor...");
		currentValue = -1;
		Thread t = new Thread(new ValueGenerator());
		t.start();
	}
	public void addObserver(SomeSensorReaderInterface channel) {
		this.change.add(channel);
	}
	public void removeObserver(SomeSensorReaderInterface channel) {
		this.change.remove(channel);
	}

	// simulate dynamic change of sensor values
	private class ValueGenerator implements Runnable {

		@Override
		public void run() {
			while (true) {
				setCurrentValue(new Random().nextLong());
				System.out.println("SENSOR - Changing value: "+getCurrentValue());
				update();
				long timeToSleep = new Random().nextInt(12);
				try {
					Thread.sleep(timeToSleep * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}

	}
	public void update(){
		for(SomeSensorReaderInterface change: change){
			change.update(getCurrentValue());
		}
	}
	public long getCurrentValue() {
		return currentValue;
	}

	private void setCurrentValue(long currentValue) {
		this.currentValue = currentValue;
	}

}
