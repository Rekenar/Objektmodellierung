package Aufgabe3;

import at.omi.smarthome.interfaces.Actor;
import at.omi.smarthome.simulation1.SimulatedLight1;

public class SimulatedLight1Adapter extends SimulatedLight1 implements Actor {
    private String id;

    @Override
    public void switchOff() {
        sendCommand("CONTROL;STATUS;OFF");
    }
    @Override
    public void switchOn() {
        sendCommand("CONTROL;STATUS;ON");
    }

    @Override
    public void setId(String s) {
        this.id = s;
    }
    @Override
    public String getId() {
        return this.id;
    }
}
