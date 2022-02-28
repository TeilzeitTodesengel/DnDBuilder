package com.example.dndbuilder.datatypes;

import com.example.dndbuilder.states.SpellState;

public class Spell {

	private String name;
	private String description;
	private SpellState spellState;
	private int spellGrade;

	public Spell(String name, String description, SpellState spellState, int spellGrade) {
		this.name = name;
		this.description = description;
		this.spellState = spellState;
		this.spellGrade = spellGrade;
	}

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

	public SpellState getSpellState() {
		return spellState;
	}

	public void setSpellState(SpellState spellState) {
		this.spellState = spellState;
	}

	public int getSpellGrade() {
		return spellGrade;
	}

	public void setSpellGrade(int spellGrade) {
		this.spellGrade = spellGrade;
	}
}
