package main.java.logic.entities;

import main.java.animation.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import main.java.logic.algorithms.Algorithm;

import java.awt.geom.Point2D;
import java.util.*;


public abstract class Location extends GameObject {
    public Point point;
    static double DIAMETER = XX; //Set this value
    Circle circle;
    Algorithm algorithm = new DefaultAlgorithm();

    List<Order> orders = new ArrayList<>();
    List<Recipe> recipes = new ArrayList<>();

    public Location(Point point, String name) {
        super(name);
        this.point = point;
        circle = new Circle(point,DIAMETER, AnimationHelper.getRandomColor());
        circle.setText(name,XX); //Set this value
    }

    @Override
    public DrawableObject getDrawable() {
        return circle;
    }

    @Override
    public void update(double delta){

        //TODO Every n seconds produce/add Resources that have been added to the production via "addResources"

        for (Recipe recipe: recipes) {
            recipe.checkRecipe(this, delta);
        }

        algorithm.handleOrders(orders,this);

        //TODO set the circle description to display the resources present
        circle.setDescription("TODO DISPLAY RESOURCES",13);
    }

    public void addRecipe(Recipe recipe) {
        //TODO Implement
    }

    public void removeRecipe(Recipe recipe) {
        //TODO Implement
    }

    public void addOrder(Order order) {
        //TODO Implement
    }

    public void removeOrder(Order order) {
        //TODO Implement
    }

    public void addResources(String resource, int qunatity){
        //TODO Implement
    }


    public void addProduction(String resource, int qunatity){
        //TODO Implement
    }


    @Override
    public boolean overlaps(Point point) {
        if(Point2D.distance(point.x-(DIAMETER/2),point.y-(DIAMETER/2),this.point.x,this.point.y)<=DIAMETER/2){
            return true;
        }
        return false;
    }

    @Override
    public void onClick(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            System.out.println(name + " got clicked on");
        }
    }

    @Override
    public String toString()
    {
        return getName() + " ("+(int)point.y + ":" + (int)point.y+ ")";
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
}
