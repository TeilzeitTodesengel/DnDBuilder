package com.example.dndbuilder.datatypes;

public class Character {
	private String name;
	private int level;
	private AbilityScore[] abilityScores;
	private CharClass charClass; // TODO Create CharClass
	private Race race; // TODO Create Race
	private Language[] languages;
	private Skill[] skills;
	private ToolProficiency[] toolProficiencies;
	private Inventory inventory;
	private CharFeature[] features; // TODO Create CharFeature
	private Spell[] spells;

	public Character(String name, int level, AbilityScore[] abilityScores, CharClass charClass, Race race, Language[] languages, Skill[] skills, ToolProficiency[] toolProficiencies, Inventory inventory, CharFeature[] features, Spell[] spells) {
		this.name = name;
		this.level = level;
		this.abilityScores = abilityScores;
		this.charClass = charClass;
		this.race = race;
		this.languages = languages;
		this.skills = skills;
		this.toolProficiencies = toolProficiencies;
		this.inventory = inventory;
		this.features = features;
		this.spells = spells;
	}

	// Getter & Setter

}
