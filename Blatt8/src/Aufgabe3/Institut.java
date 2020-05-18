package Aufgabe3;
import java.util.ArrayList;
import java.util.List;

public class Institut implements University {

	private List<University> University;
	public Institut(){
		University = new ArrayList<>();
	}

	@Override
	public int getEmployees() {
		int count = 0;
		for (University u : University){
			count += u.getEmployees();
		}
		return count;
	}

	@Override
	public int getPublications() {
		int count = 0;
		for (University u : University) {
			count += u.getPublications();
		}
		return count;
	}

	public void addUniversity(University u){
		University.add(u);
	}

	public void removeUniversity(University u){
		University.remove(u);
	}
}

