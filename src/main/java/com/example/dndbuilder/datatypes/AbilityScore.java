package com.example.dndbuilder.datatypes;

public class AbilityScore {
	private int rawValue;
	private int modificator;
	private boolean isSkilledSave;

	public AbilityScore(int rawValue, int modificator, boolean isSkilledSave) {
		this.rawValue = rawValue;
		this.modificator = modificator;
		this.isSkilledSave = isSkilledSave;
	}

	// Getter & Setters


	public int getRawValue() {
		return rawValue;
	}

	public void setRawValue(int rawValue) {
		this.rawValue = rawValue;
	}

	public int getModificator() {
		return modificator;
	}

	public void setModificator(int modificator) {
		this.modificator = modificator;
	}

	public boolean isSkilledSave() {
		return isSkilledSave;
	}

	public void setSkilledSave(boolean skilledSave) {
		isSkilledSave = skilledSave;
	}
}
