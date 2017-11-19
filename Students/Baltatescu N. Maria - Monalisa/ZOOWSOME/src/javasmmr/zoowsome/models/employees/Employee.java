package javasmmr.zoowsome.models.employees;

import java.util.Random;

public abstract class Employee {
	private String name;
	private long id;
	private double salary;
	private boolean isDead;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId() {
		Random random = new Random();
		long id = random.nextLong();
		this.id = id;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public boolean getIsDead() {
		return isDead;
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
}


