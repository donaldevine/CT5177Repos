package samplepaperquestion3;

import java.util.Comparator;

public class SortById implements Comparator<Company.Employee> {
	public int compare(Company.Employee a, Company.Employee b) {
		return (int)a.getID() - (int)b.getID();
	}
}