package main.java.logic.entities;

import main.java.animation.DrawableObject;
import main.java.animation.Point;

public class Lumberjack extends Location {
	public Lumberjack(Point point, String name) {
		super(point, name);
	}

	private String name;
	private Point point;
	private DrawableObject form;

}
