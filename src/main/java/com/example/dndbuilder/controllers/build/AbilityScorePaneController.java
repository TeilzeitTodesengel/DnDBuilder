package com.example.dndbuilder.controllers.build;

import com.example.dndbuilder.MainController;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class AbilityScorePaneController {

	MainController mainController;

	@FXML
	private ChoiceBox strSelection;
	@FXML
	private ChoiceBox dexSelection;
	@FXML
	private ChoiceBox conSelection;
	@FXML
	private ChoiceBox intSelection;
	@FXML
	private ChoiceBox wisSelection;
	@FXML
	private ChoiceBox chaSelection;


	String[] selectionValues = {"1 (-5)", "2 (-4)", "3 (-4)", "4 (-3)", "5 (-3)", "6 (-2)", "7 (-2)", "8 (-1)", "9 (-1)", "10 (0)", "11 (0)",
	"12 (+1)", "13 (+1)", "14 (+2)", "15 (+2)", "16 (+3)", "17 (+3)", "18 (+4)", "19 (+4)", "20 (+5)"};

	@FXML
	private void initialize() {
		strSelection.getItems().setAll((Object[]) selectionValues);
		dexSelection.getItems().setAll((Object[]) selectionValues);
		conSelection.getItems().setAll((Object[]) selectionValues);
		intSelection.getItems().setAll((Object[]) selectionValues);
		wisSelection.getItems().setAll((Object[]) selectionValues);
		chaSelection.getItems().setAll((Object[]) selectionValues);
	}

	public void injectMainController(MainController controller) {
		mainController = controller;
	}
}
