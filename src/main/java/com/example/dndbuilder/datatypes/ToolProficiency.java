package com.example.dndbuilder.datatypes;

public class ToolProficiency {
	private String tool;
	private int bonus;

	public ToolProficiency(String tool, int bonus) {
		this.tool = tool;
		this.bonus = bonus;
	}

	// Getters & Setters
	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
