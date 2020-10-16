package main.java.logic.algorithms;

import main.java.logic.entities.Location;
import main.java.logic.entities.Order;

import java.util.List;

public interface AlgorithmStrategy {
    void handleOrders(List<Order> allOrders, Location location);
    String getName();
}
