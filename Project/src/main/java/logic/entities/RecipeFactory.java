package main.java.logic.entities;

public class RecipeFactory {

	public Recipe getRecipe(String objectType){
		if(objectType == null){
			return null;
		}
		if(objectType.equalsIgnoreCase("CowToMeat")){
			return new CowToMeat();
		}
		else if(objectType.equalsIgnoreCase("WoodToPlanks")){
			return new WoodToPlanks();
		}
		else if(objectType.equalsIgnoreCase("PlanksToFurniture")){
			return new PlanksToFurniture();
		}
		return null;
	}
}
