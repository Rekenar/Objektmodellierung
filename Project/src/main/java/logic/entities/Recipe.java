package main.java.logic.entities;

public class Recipe {
	public Recipe(Resource inputresource, Resource outputresource) {
		this.inputresource = inputresource;
		this.outputresource = outputresource;
	}

	private Resource inputresource;
	private Resource outputresource;

	public void checkRecipe(Location location, double delta ){
		int inputindex  = 0;
		int outputindex = 0;

		for (int i = 0; i < location.resources.size(); i++) {
			if(location.resources.get(i).getName().equals(inputresource.getName())){
				inputindex = i;
			}
		}
		for (int i = 0; i < location.resources.size() ; i++) {
			if(location.resources.get(i).getName().equals(outputresource.getName())){
				outputindex = i;
			}
		}

		location.resources.get(outputindex).setQuantity(location.resources.get(inputindex).getQuantity());
	}
}
