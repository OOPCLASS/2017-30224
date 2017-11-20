package javasmmr.zoowsome.models.employees;

import java.util.Random;
import java.math.BigDecimal;

public abstract class Employee {

	private String name;
	private Long id;
	private BigDecimal salary;
	private Boolean isDead = false;

	public Employee(String name, BigDecimal salary,Boolean isDead) {

		this.name = name;
		this.id = generateId();
		this.salary = salary;
		this.isDead = isDead;

	}

	public void setName(String Name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}

	public boolean getIsDead() {
		return this.isDead;
	}

	private static long generateId() {
		long multiplier = 0;
		for (int i = 0; i < 13; i++) {
			multiplier = multiplier * 10;
			multiplier = multiplier + (new Random()).nextInt(9);
		}

		return multiplier;
	}

}