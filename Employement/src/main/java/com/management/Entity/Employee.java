package com.management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
private long id;
private String name;
private String position;
private Double salary;
public Employee() {
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
}
