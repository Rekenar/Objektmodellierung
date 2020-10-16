package main.java.logic.algorithms;

import main.java.logic.entities.Location;
import main.java.logic.entities.Order;

import java.util.List;

public class LIFOAlgorithm implements AlgorithmStrategy {
	@Override
	public void handleOrders(List<Order> allOrders, Location location) {

		int n = allOrders.size();

		for (int i = 0; i < n-1 ; i++) {
			Order temp = allOrders.get(i);
			allOrders.set(i,allOrders.get(n - 1 - i));
			allOrders.set(n - 1 - i, temp);
			allOrders.get(i).checkOrder();
		}

	}

	@Override
	public String getName() {
		return "LIFOAlgorithm";
	}
}
