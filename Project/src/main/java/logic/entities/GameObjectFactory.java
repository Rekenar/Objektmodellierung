package main.java.logic.entities;

import main.java.animation.Point;

public class GameObjectFactory {

	public static GameObject getGameObject(String objectType, Point point){
		if(objectType == null){
			return null;
		}
		if(objectType.equalsIgnoreCase("Farm")){
			return new Farm(point,"Farm");
		}
		else if(objectType.equalsIgnoreCase("Butcher")){
			return new Butcher(point,"Butcher");
		}
		else if(objectType.equalsIgnoreCase("Logging")){
			return new Logging(point,"Logging");
		}
		else if(objectType.equalsIgnoreCase("Sawmill")){
			return new Sawmill(point,"Sawmill");
		}
		else if(objectType.equalsIgnoreCase("Carpentry")){
			return new Carpentry(point,"Carpentry");
		}
		return null;
	}
}
