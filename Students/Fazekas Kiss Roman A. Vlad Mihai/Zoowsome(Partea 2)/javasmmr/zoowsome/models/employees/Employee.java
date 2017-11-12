package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Employee {
	
	private String name;
	private Long id;
	private BigDecimal salary;
	private Boolean isDead = false;
	
	public Employee(String name, BigDecimal salary, Boolean isDead){
		this.name = name;
		this.id = generateId();
		this.salary = salary;
		this.isDead = isDead;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public Boolean getIsDead() {
		return isDead;
	}

	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
	
	private static long generateId(){
		long x = 0;
		for (int i = 0; i<13; i++){
			x *= 10;
			x += (new Random()).nextInt(9);
		}
		return x;
	}
}
