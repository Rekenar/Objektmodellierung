package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class DrawableObjectsComposite implements DrawableObject {
    private ArrayList<DrawableObject> children;


    public void add(DrawableObject drawableObject){
        children.add(drawableObject);
    }
    public void remove(DrawableObject drawableObject){
        children.remove(drawableObject);
    }
    public ArrayList<DrawableObject> getChildren(DrawableObject drawableObject){
        return children;
    }
    public void draw(GraphicsContext gc){
        for(DrawableObject child:children){
            child.draw(gc);
        }
    }

    @Override
    public DoubleProperty getXproperty() {
        for(DrawableObject child:children){
            child.getXproperty();
        }

    }

    @Override
    public DoubleProperty getYproperty() {
        for(DrawableObject child:children){
            child.getYproperty();
        }

    }

}