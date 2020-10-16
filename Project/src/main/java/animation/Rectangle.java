package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Rectangle implements DrawableObject {

    private DoubleProperty x;
    private DoubleProperty y;
    private double width;
    private double hight;
    private Color color;

    public Rectangle(double x, double y, double width, double height, Color color){
        this.x = new SimpleDoubleProperty(x);
        this.y = new SimpleDoubleProperty(y);
        this.width = width;
        this.hight = height;
        this.color = color;
    }
    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(0, 0, width, hight);
    }

    @Override
    public DoubleProperty getXproperty() {
        return this.x;
    }

    @Override
    public DoubleProperty getYproperty() {
        return this.y;
    }
}
