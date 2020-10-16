package main.java.logic.algorithms;

import main.java.logic.entities.Location;
import main.java.logic.entities.Order;

import java.util.List;

public class Context {
    private AlgorithmStrategy algorithmStrategy;

    public void setAlgorithmStrategy(AlgorithmStrategy algorithmStrategy){
        this.algorithmStrategy  = algorithmStrategy;
    }
    public void executeAlgorithmStrategy(List<Order> allOrders, Location location){
        algorithmStrategy.handleOrders(allOrders, location);
    }
}
