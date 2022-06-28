package com.example.dndbuilder.datatypes;

import com.fasterxml.jackson.databind.ObjectMapper;

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

	public Character() {

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<AbilityScore> getAbilityScores() {
		return abilityScores;
	}

	public void setAbilityScores(List<AbilityScore> abilityScores) {
		this.abilityScores = abilityScores;
	}

	public CharClass getCharClass() {
		return charClass;
	}

	public void setCharClass(CharClass charClass) {
		this.charClass = charClass;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<ToolProficiency> getToolProficiencies() {
		return toolProficiencies;
	}

	public void setToolProficiencies(List<ToolProficiency> toolProficiencies) {
		this.toolProficiencies = toolProficiencies;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public List<CharFeature> getFeatures() {
		return features;
	}

	public void setFeatures(List<CharFeature> features) {
		this.features = features;
	}

	public List<Spell> getSpells() {
		return spells;
	}

	public void setSpells(List<Spell> spells) {
		this.spells = spells;
	}
}
