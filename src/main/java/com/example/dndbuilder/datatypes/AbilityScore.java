package com.example.dndbuilder.datatypes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AbilityScore {
	private int rawValue;
	private boolean isSkilledSave;

	public AbilityScore(int rawValue, boolean isSkilledSave) {
		this.rawValue = rawValue;
		this.isSkilledSave = isSkilledSave;
	}

	public AbilityScore() {

	}

	// Getter & Setters


	public int getRawValue() {
		return rawValue;
	}

	public void setRawValue(int rawValue) {
		this.rawValue = rawValue;
	}

	@JsonIgnore
	public int getModificator() {
		int modificator;
		switch (getRawValue()){
			case 0:
			case 1:
				modificator = -5;
			break;
			case 2:
			case 3:
				modificator = -4;
				break;
			case 4:
			case 5:
				modificator = -3;
				break;

			case 6:
			case 7:
				modificator = -2;
				break;
			case 8:
			case 9:
				modificator = -1;
				break;
			case 10:
			case 11:
				modificator = 0;
				break;
			case 12:
			case 13:
				modificator = 1;
				break;
			case 14:
			case 15:
				modificator = 2;
				break;
			case 16:
			case 17:
				modificator = 3;
				break;
			case 18:
			case 19:
				modificator = 4;
				break;
			case 20: modificator = 5;
				break;
			default: modificator = 999;

		}
		return modificator;

	}

	public boolean isSkilledSave() {
		return isSkilledSave;
	}

	public void setSkilledSave(boolean skilledSave) {
		isSkilledSave = skilledSave;
	}
}
