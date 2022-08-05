package com.customer;

public class Customer {
private int id;
private String name;
private int age;
private int purchaseAmount;

public Customer() {
	super();
	
}

public Customer(int id, String name, int age, int purchaseAmount) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.purchaseAmount = purchaseAmount;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getPurchaseAmount() {
	return purchaseAmount;
}

public void setPurchaseAmount(int purchaseAmount) {
	this.purchaseAmount = purchaseAmount;
}

@Override
public String toString() {
	return "Customer [getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
			+ ", getPurchaseAmount()=" + getPurchaseAmount() + "]";
}



}
