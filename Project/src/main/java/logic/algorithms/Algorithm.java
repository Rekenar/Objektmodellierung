package main.java.logic.algorithms;

import main.java.logic.entities.Location;

import java.util.List;

public interface Algorithm {

    void handleOrders(List<Order> allOrders, Location location);
    String getName();

}
