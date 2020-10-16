package main.java.logic.algorithms;

import main.java.logic.entities.Location;
import main.java.logic.entities.Order;

import java.util.List;

public class FirstSmallQuantityAlgorithm implements AlgorithmStrategy{
	@Override
	public void handleOrders(List<Order> allOrders, Location location) {
		int n = allOrders.size();

		for (int i = 0; i < n-1 ; i++) {
			for (int j = 0; j < n-i-1 ; j++) {
				if(allOrders.get(j).getQuantity() > allOrders.get(j+1).getQuantity()){
					Order temp = allOrders.get(j);
					allOrders.set(j,allOrders.get(j+1));
					allOrders.set(j+1, temp);
				}
			}
		}

		for (int i = 0; i < allOrders.size()-1  ; i++) {
			allOrders.get(i).checkOrder();
		}


	}

	@Override
	public String getName() {
		return "QuantityAlgorithm";
	}
}
