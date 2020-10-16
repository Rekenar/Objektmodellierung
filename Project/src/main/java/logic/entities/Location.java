package main.java.logic.entities;

import main.java.animation.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import main.java.logic.algorithms.DefaultAlgorithm;

import java.awt.geom.Point2D;
import java.util.*;


public abstract class Location extends GameObject {
    public Point point;
    static double DIAMETER = 25; //Set this value
    Circle circle;
    Algorithm algorithm = new DefaultAlgorithm();

    List<Order> orders = new ArrayList<>();
    List<Recipe> recipes = new ArrayList<>();
    List<Resource> resources = new ArrayList<>();
    List<Production> productions = new ArrayList<>();

    public List<Order> getOrders(){
        return this.orders;
    }

    public Location(Point point, String name) {
        super(name);
        this.point = point;
        circle = new Circle(point,DIAMETER, AnimationHelper.getRandomColor());
        circle.setText(name,15); //Set this value
    }

    @Override
    public DrawableObject getDrawable() {
        return circle;
    }

    @Override
    public void update(double delta){

        //TODO Every n seconds produce/add Resources that have been added to the production via "addResources"
        double passedTime = 0;
        for (int i = 0; i < productions.size(); i++) {
            addResources(productions.get(i).getName(),productions.get(i).getQuantity());
        }

        for (Recipe recipe: recipes) {
            recipe.checkRecipe(this, delta);
        }

        algorithm.handleOrders(orders,this);

        //TODO set the circle description to display the resources present
        for (int i = 0; i < resources.size(); i++) {
            circle.setDescription(resources.get(i).getName(),13);
        }
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void addResources(String resource, int qunatity){
        Resource res = new Resource(resource,qunatity);

        if(resources.contains(res)){
            int index = resources.indexOf(res);
            resources.get(index).setQuantity(resources.get(index).getQuantity()+qunatity);
        }
        else{
            resources.add(res);
        }
    }

    public void addProduction(String resource, int qunatity){
        Production prod = new Production(resource,qunatity);

        if(productions.contains(prod)){
            int index = productions.indexOf(prod);
            productions.get(index).setQuantity(productions.get(index).getQuantity()+qunatity);
        }
        else{
            productions.add(prod);
        }
    }

    @Override
    public boolean overlaps(Point point) {
        if(Point2D.distance(point.getX() -(DIAMETER/2),point.getY()-(DIAMETER/2),this.point.getX(),this.point.getY())<=DIAMETER/2){
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
        return getName() + " ("+(int)point.getX() + ":" + (int)point.getY()+ ")";
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
}
