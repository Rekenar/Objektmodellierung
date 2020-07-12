package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.Paint;

public class Label implements DrawableObject {

    private DoubleProperty x;
    private DoubleProperty y;
    private Paint color;
    private String text;
    private double offsetX;
    private double offsetY;
    private int fontsize = -1;

    Label(DoubleProperty x, DoubleProperty y, Paint color, String text, double offsetX, double offsetY, int fontsize){
        this.x = x;
        this.y = y;
        this.color = color;
        this.text = text;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
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

    public void setX(double x) {
        this.x.set(x);
    }
    public void setY(double y) {
        this.y.set(y);
    }

    public Paint getColor() {
        return color;
    }

    public void setColor(Paint color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public int getFontsize() {
        return fontsize;
    }

    public void setFontsize(int fontsize) {
        this.fontsize = fontsize;
    }
}
