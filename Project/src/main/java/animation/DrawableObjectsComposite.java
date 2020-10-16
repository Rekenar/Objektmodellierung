package main.java.animation;

import javafx.beans.property.DoubleProperty;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class DrawableObjectsComposite implements DrawableObject {

	private DoubleProperty xproperty;
	private DoubleProperty yproperty;
	private ArrayList<DrawableObject> childDrawableObject = new ArrayList<>();


	@Override
	public void draw(GraphicsContext gc) {
		for (DrawableObject drawableObject : childDrawableObject) {
			drawableObject.draw(gc);
		}
	}

	public ArrayList<DrawableObject> getChildrenDrawableObject(){
		return this.childDrawableObject;
	}

	public void add(DrawableObject draw){
		childDrawableObject.add(draw);
	}

	public void remove(DrawableObject draw){
		childDrawableObject.remove(draw);
	}

	@Override
	public DoubleProperty getXproperty() {
		return xproperty;
	}

	@Override
	public DoubleProperty getYproperty() {
		return yproperty;
	}



}
