package main.java.logic.entities;

import main.java.animation.AnimationHelper;
import main.java.animation.Circle;
import main.java.animation.DrawableObject;
import main.java.animation.Point;


public class Carrier extends GameObject {
    static double DIAMETER = 15;
    Point point;
    Circle circle;

    public Carrier(Point point) {
        super("Carrier");
        this.point = point;
        circle = new Circle(point, DIAMETER, AnimationHelper.getRandomColor());
    }

    @Override
    public DrawableObject getDrawable() {
        return circle;
    }

    @Override
    public void update(double delta) {

    }

    public void setName(String s) {
        super.name = s;
        circle.setText(name, 15);
    }
}
