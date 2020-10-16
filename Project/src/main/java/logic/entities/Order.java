package main.java.logic.entities;

import main.java.logic.GameLogic;

public class Order {

	private Location originLocation;
	private Location targetLocation;
	private Resource resource;

	public Order(Location originLocation, Location targetLocation,String resource, int quantity) {
		this.originLocation = originLocation;
		this.targetLocation = targetLocation;
		this.resource = new Resource(resource, quantity);
	}

	public Location getOriginLocation() {
		return originLocation;
	}

	public void setOriginLocation(Location originLocation) {
		this.originLocation = originLocation;
	}

	public Location getTargetLocation() {
		return targetLocation;
	}

	public void setTargetLocation(Location targetLocation) {
		this.targetLocation = targetLocation;
	}

	public int getQuantity() {
		return resource.getQuantity();
	}

	public void checkOrder(){
		if(originLocation.resources.contains(resource)){
			int index = originLocation.resources.indexOf(resource);
			if(originLocation.resources.get(index).getQuantity()>=resource.getQuantity()){
				originLocation.addResources(resource.getName(),-resource.getQuantity());
				GameLogic.getGameLogic().spawnCarrier(this);


			}
		}
	}

	public void onArrival(){
		int index = targetLocation.resources.indexOf(resource);
		targetLocation.resources.get(index).setQuantity(targetLocation.resources.get(index).getQuantity() + resource.getQuantity());
	}
}
