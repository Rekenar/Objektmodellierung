package main.java.logic.entities;

public class PlanksToFurniture extends Recipe {
    public PlanksToFurniture() {
        super(new Resource("Planks",10), new Resource("Furniture",1));
    }
}
