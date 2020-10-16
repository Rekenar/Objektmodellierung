package main.java.logic.algorithms;

import main.java.logic.entities.Location;
import main.java.logic.entities.Order;

import java.util.Collections;
import java.util.List;

public class RandomAlgorithm implements AlgorithmStrategy {


	@Override
	public void handleOrders(List<Order> allOrders, Location location) {
		Collections.shuffle(allOrders);

		for (int i = 0; i < allOrders.size()-1  ; i++) {
			allOrders.get(i).checkOrder();
		}
	}

	@Override
	public String getName() {
		return "RandomAlgorithm";
	}



}
