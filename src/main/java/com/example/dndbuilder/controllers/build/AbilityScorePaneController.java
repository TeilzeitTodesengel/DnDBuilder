package com.example.dndbuilder.controllers.build;

import com.example.dndbuilder.MainController;
import com.example.dndbuilder.datatypes.AbilityScore;
import com.example.dndbuilder.datatypes.Language;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class AbilityScorePaneController {

	MainController mainController;

	@FXML
	private ComboBox<AbilityScore> strSelection;
	@FXML
	private ComboBox<AbilityScore> dexSelection;
	@FXML
	private ComboBox<AbilityScore> conSelection;
	@FXML
	private ComboBox<AbilityScore> intSelection;
	@FXML
	private ComboBox<AbilityScore> wisSelection;
	@FXML
	private ComboBox<AbilityScore> chaSelection;


	AbilityScore[] selectionValues = {new AbilityScore(1,-5, false),
			new AbilityScore(2,-4, false),
			new AbilityScore(3,-4, false),
			new AbilityScore(4,-3, false),
			new AbilityScore(5,-3, false),
			new AbilityScore(6,-2, false),
			new AbilityScore(7,-2, false),
			new AbilityScore(8,-1, false),
			new AbilityScore(9,-1, false),
			new AbilityScore(10,0, false),
			new AbilityScore(11,0, false),
			new AbilityScore(12,1, false),
			new AbilityScore(13,1, false),
			new AbilityScore(14,2, false),
			new AbilityScore(15,2, false),
			new AbilityScore(16,3, false),
			new AbilityScore(17,3, false),
			new AbilityScore(18,4, false),
			new AbilityScore(19,4, false),
			new AbilityScore(20,5, false),};

	// TODO Finish CellFactories

	@FXML
	private void initialize() {
		strSelection.setCellFactory(new Callback<ListView<AbilityScore>, ListCell<AbilityScore>>() {

			@Override
			public ListCell<AbilityScore> call(ListView<AbilityScore> param) {
				final ListCell<AbilityScore> cell = new ListCell<AbilityScore>() {

					@Override
					protected void updateItem(AbilityScore item, boolean empty) {
						super.updateItem(item, empty);
						if (item != null) {
							setText(String.valueOf(item.getRawValue()));
						} else {
							setText(null);
						}
					}
				};
				return cell;
			}
		});
		strSelection.setButtonCell(new ListCell<AbilityScore>() {

			@Override
			protected void updateItem(AbilityScore item, boolean empty) {
				super.updateItem(item, empty);
				if (item != null) {
					setText(String.valueOf(item.getRawValue()));
				} else {
					setText(null);
				}
			}
		});
		strSelection.getItems().setAll(selectionValues);
		dexSelection.getItems().setAll(selectionValues);
		conSelection.getItems().setAll(selectionValues);
		intSelection.getItems().setAll(selectionValues);
		wisSelection.getItems().setAll(selectionValues);
		chaSelection.getItems().setAll(selectionValues);
	}

	public void injectMainController(MainController controller) {
		mainController = controller;
	}
}
