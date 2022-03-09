package com.example.dndbuilder.datatypes;

import java.util.List;

public class Character {
	private String name;
	private int level;
	private List<AbilityScore> abilityScores;
	private CharClass charClass; // TODO Create CharClass
	private Race race; // TODO Create Race
	private List<Language> languages;
	private List<Skill> skills;
	private List<ToolProficiency> toolProficiencies;
	private Inventory inventory;
	private List<CharFeature> features; // TODO Create CharFeature
	private List<Spell> spells;

	public Character(String name, int level, List<AbilityScore> abilityScores, CharClass charClass, Race race, List<Language> languages, List<Skill> skills, List<ToolProficiency> toolProficiencies, Inventory inventory, List<CharFeature> features, List<Spell> spells) {
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


	public void addLanguage(Language language) {
		languages.add(language);
	}

	public void removeLanguage(Language language) {
		languages.remove(language);
	}

	// Getter & Setter

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
}
