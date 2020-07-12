package main.java.animation;


import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.canvas.GraphicsContext;

public class Point implements DrawableObject{
    private DoubleProperty x;
    private DoubleProperty y;

    Point (double x, double y){
        this.x = new SimpleDoubleProperty(x);
        this.y = new SimpleDoubleProperty(y);
    }

    @Override
    public void draw(GraphicsContext gc) {

    }

    @Override
    public DoubleProperty getXproperty() {
        return x;
    }

    @Override
    public DoubleProperty getYproperty() {
        return y;
    }

    public double getX() {
        return x.get();
    }

    public void setX(double x) {
        this.x.set(x);
    }

    public double getY() {
        return y.get();
    }

    public void setY(double y) {
        this.y.set(y);
    }
}
