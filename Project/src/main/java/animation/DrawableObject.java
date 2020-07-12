package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;

public interface DrawableObject {
    void draw(GraphicsContext gc);

    DoubleProperty getXproperty();

    DoubleProperty getYproperty();
}
