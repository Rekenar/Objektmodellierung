package main.java.animation;
import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;


public class Circle extends DrawableObjectsComposite implements DrawableObject{

    private Paint color;
    private DoubleProperty x;
    private DoubleProperty y;
    private double diameter;

    Circle(Paint color, DoubleProperty x, DoubleProperty y, double diameter){
        this.color = color;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(
                x.doubleValue(),
                y.doubleValue(),
                diameter,
                diameter
        );
        super.draw(gc);
    }

    public void setText(String s, int fontsize) {
        new Label(x, y, color, s, diameter / 2, -5, fontsize);
        //Hint: new Label(x, y, color, s, diameter / 2, -5, fontsize);

    }

    public void setDescription(String s, int fontsize) {
        new Label(x, y, color, s, -diameter / 2, diameter+10, fontsize);
        //Hint: new Label(x, y, color, s, -diameter / 2, diameter+10, fontsize);

    }
}
