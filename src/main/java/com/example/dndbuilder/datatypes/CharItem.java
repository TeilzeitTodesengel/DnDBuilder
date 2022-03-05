package com.example.dndbuilder.datatypes;

public class CharItem {
	private String name;
	private double weight;
	private int count;

	public CharItem(String name, double weight, int count) {
		this.name = name;
		this.weight = weight;
		this.count = count;
	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
