package main.java.logic.entities;

public class WoodToPlanks extends Recipe {
	public WoodToPlanks() {
		super(new Resource("Wood",2), new Resource("Planks",1));
	}
}
