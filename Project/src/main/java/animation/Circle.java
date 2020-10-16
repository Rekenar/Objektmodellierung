package main.java.animation;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Circle extends DrawableObjectsComposite{

    private Point point;
    private double diameter;
    private Color color;

    public Circle(Point point, double diameter, Color color){

        this.diameter = diameter;
        this.color = color;
        this.point = point;

        Label Text = new Label(point.getX(),point.getY(),color,"",diameter/2,-5,5);
        Label Description = new Label(point.getX(),point.getY(),color,"",diameter/2,diameter+10,5);

        getChildrenDrawableObject().add(Text);
        getChildrenDrawableObject().add(Description);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(
                getXproperty().doubleValue(),
                getYproperty().doubleValue(),
                diameter,
                diameter
        );
        super.draw(gc);
    }

    public void setText(String s, int fontsize) {
        //TODO Implement
        //Hint: new Label(x, y, color, s, diameter / 2, -5, fontsize);
        Label label = new Label(getXproperty().doubleValue(),getYproperty().doubleValue(),color,s, diameter/2,-5,fontsize);

        getChildrenDrawableObject().set(0,label);
    }

    public void setDescription(String s, int fontsize) {
        //TODO Implement
        //Hint: new Label(x, y, color, s, -diameter / 2, diameter+10, fontsize);
        Label label = new Label(getXproperty().doubleValue(), getYproperty().doubleValue(), color, s, diameter/2, diameter+10, fontsize);


        getChildrenDrawableObject().set(1,label);
    }
}
