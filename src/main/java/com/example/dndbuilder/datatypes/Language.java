package com.example.dndbuilder.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Language {
	private String name;
	private String description;

	public Language(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Language() {

	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public String getDescription() {
		return description;
	}

	@JsonIgnore
	public void setDescription(String description) {
		this.description = description;
	}
}
