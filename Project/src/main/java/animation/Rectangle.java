package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;


public class Rectangle implements DrawableObject {

    private DoubleProperty x;
    private DoubleProperty y;
    private Paint color;
    private double width;
    private double height;

    Rectangle(DoubleProperty x, DoubleProperty y, Paint color, double width, double height){
        this.x = x;
        this.y = y;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(0, 0, width, height);
    }

    @Override
    public DoubleProperty getXproperty() {
        return this.x;
    }

    @Override
    public DoubleProperty getYproperty() {
        return this.y;
    }

    public Paint getColor() {
        return color;
    }

    public void setColor(Paint color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setX(double x) {
        this.x.set(x);
    }

    public void setY(double y) {
        this.y.set(y);
    }
}
