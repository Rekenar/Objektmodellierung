package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class Label implements DrawableObject {

    private DoubleProperty x;
    private DoubleProperty y;
    private Color color;
    private String text;
    private double offsetX;
    private double offsetY;
    private int fontsize = -1;

    public Label(double x, double y, Color color, String text, double offsetX, double offsetY, int fontsize){
        this.x = new SimpleDoubleProperty(x);
        this.y = new SimpleDoubleProperty(y);
        this.color = color;
        this.text = text;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.fontsize = fontsize;

    }
    @Override
    public void draw(GraphicsContext gc) {
        if (fontsize != -1)
            gc.setFont(new Font(fontsize));
        gc.setTextAlign(TextAlignment.CENTER);
        gc.setFill(color);
        gc.fillText(text, x.doubleValue() + offsetX, y.doubleValue() + offsetY);
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
