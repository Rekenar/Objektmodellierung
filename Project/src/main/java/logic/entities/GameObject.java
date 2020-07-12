package main.java.logic.entities;

import main.java.animation.DrawableObject;
import javafx.scene.input.MouseEvent;


public abstract class GameObject {

    DrawableObject dob;
    String name;

    public GameObject(String name) {
        this.name = name;
    }

    public DrawableObject getDrawable() {
        return dob;
    }

    public void update(double delta) {};

    public boolean overlaps(Point point) {
        return false;
    };

    public void onClick(MouseEvent event) {};

    public String getName() {
        return name;
    }

}
