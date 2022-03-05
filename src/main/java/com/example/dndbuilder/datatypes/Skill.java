package com.example.dndbuilder.datatypes;

public class Skill {
	private AbilityScore abilityScore;
	private String name;
	private boolean isSkilled;
	private int modificator;

	public Skill(AbilityScore abilityScore, String name, boolean isSkilled, int modificator) {
		this.abilityScore = abilityScore;
		this.name = name;
		this.isSkilled = isSkilled;
		this.modificator = modificator;
	}

	// Getters & Setters
	public AbilityScore getAbilityScore() {
		return abilityScore;
	}

	public void setAbilityScore(AbilityScore abilityScore) {
		this.abilityScore = abilityScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSkilled() {
		return isSkilled;
	}

	public void setSkilled(boolean skilled) {
		isSkilled = skilled;
	}

	public int getModificator() {
		return modificator;
	}

	public void setModificator(int modificator) {
		this.modificator = modificator;
	}
}
