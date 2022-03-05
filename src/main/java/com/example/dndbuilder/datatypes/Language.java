package com.example.dndbuilder.datatypes;

public class Language {
	private String name;
	private String description;

	public Language(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
