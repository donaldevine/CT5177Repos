package samplepaperquestion3;

import java.util.List;
import java.util.ArrayList;

public class Company {
	
	protected List<Employee> employees = null;
	
	public Company() {
		this.employees = new ArrayList<Employee>();;
	}
	
	public void addEmployee(String name, long id) {
		this.employees.add(new Employee(name, id));
	}
	
	public void removeEmployee(long id) {
		
		for(Employee e : this.employees) {
			if(e.getID() == id) {
				this.employees.remove(e);
			}
		}		
	}
	
	public List<Employee>getEmployees() {
		return this.employees;
	}
	
	public class Employee {
		private String name = "";
		private long id = 0;
		
		public Employee(String name, long id) {
			this.name = name;
			this.id = id;
		}
		
		public String getName() {
			return this.name;
		}
		
		public long getID() {
			return this.id;
		}
		
		public String toString() {
			return "Name: " + this.name + ". ID: " + this.id + ". ";
		}
	}
}
