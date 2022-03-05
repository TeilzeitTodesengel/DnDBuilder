package com.example.dndbuilder.datatypes;

public class Inventory {
	private CharItem[] items;
	private double weight;

	public Inventory(CharItem[] items, double weight) {
		this.items = items;
		this.weight = weight;
	}

	// Getters & Setters
	public CharItem[] getItems() {
		return items;
	}

	public void setItems(CharItem[] items) {
		this.items = items;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
