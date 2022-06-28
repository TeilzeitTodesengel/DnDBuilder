package com.example.dndbuilder.controllers.build;

import com.example.dndbuilder.MainController;
import com.example.dndbuilder.datatypes.AbilityScore;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Callback;

import java.util.List;

public class AbilityScorePaneController {

	MainController mainController;

	@FXML
	private ComboBox<AbilityScore> strSelection, dexSelection, conSelection, intSelection, wisSelection, chaSelection;

	@FXML
	private Label strLabel, dexLabel, conLabel, intLabel, wisLabel, chaLabel;

	AbilityScore[] selectionValues = {
			new AbilityScore(1, false),
			new AbilityScore(2, false),
			new AbilityScore(3, false),
			new AbilityScore(4, false),
			new AbilityScore(5, false),
			new AbilityScore(6, false),
			new AbilityScore(7, false),
			new AbilityScore(8, false),
			new AbilityScore(9, false),
			new AbilityScore(10, false),
			new AbilityScore(11, false),
			new AbilityScore(12, false),
			new AbilityScore(13, false),
			new AbilityScore(14, false),
			new AbilityScore(15, false),
			new AbilityScore(16, false),
			new AbilityScore(17, false),
			new AbilityScore(18, false),
			new AbilityScore(19, false),
			new AbilityScore(20, false)
	};

	@FXML
	private void initialize() {
		// Setting the cell Factories for the Combo boxes that the Objects are displayed correctly
		dexSelection.setCellFactory(cellFactory);
		strSelection.setCellFactory(cellFactory);
		conSelection.setCellFactory(cellFactory);
		intSelection.setCellFactory(cellFactory);
		wisSelection.setCellFactory(cellFactory);
		chaSelection.setCellFactory(cellFactory);

		// Setting the Button Cell for the Combo Box that the Objects are displayed correctly
		strSelection.setButtonCell(new ListCell<>() {

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
		dexSelection.setButtonCell(new ListCell<>() {

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
		conSelection.setButtonCell(new ListCell<>() {

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
		intSelection.setButtonCell(new ListCell<>() {

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
		wisSelection.setButtonCell(new ListCell<>() {

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
		chaSelection.setButtonCell(new ListCell<>() {

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

		// Adding the Selection Values to the ComboBoxes
		strSelection.getItems().setAll(selectionValues);
		dexSelection.getItems().setAll(selectionValues);
		conSelection.getItems().setAll(selectionValues);
		intSelection.getItems().setAll(selectionValues);
		wisSelection.getItems().setAll(selectionValues);
		chaSelection.getItems().setAll(selectionValues);

		// Adding listeners for the modificator Labels
		strSelection.getSelectionModel().selectedItemProperty().addListener((options, old, now) -> strLabel.setText(String.valueOf(now.getModificator())));
		dexSelection.getSelectionModel().selectedItemProperty().addListener((options, old, now) -> dexLabel.setText(String.valueOf(now.getModificator())));
		conSelection.getSelectionModel().selectedItemProperty().addListener((options, old, now) -> conLabel.setText(String.valueOf(now.getModificator())));
		intSelection.getSelectionModel().selectedItemProperty().addListener((options, old, now) -> intLabel.setText(String.valueOf(now.getModificator())));
		wisSelection.getSelectionModel().selectedItemProperty().addListener((options, old, now) -> wisLabel.setText(String.valueOf(now.getModificator())));
		chaSelection.getSelectionModel().selectedItemProperty().addListener((options, old, now) -> chaLabel.setText(String.valueOf(now.getModificator())));
	}

	public void injectMainController(MainController controller) {
		mainController = controller;
	}


	Callback cellFactory = new Callback() {

		@Override
		public Object call(Object param) {
			return new ListCell<AbilityScore>() {

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
		}
	};

	public void onLoad(List<AbilityScore> selectedValues) {

		if (selectedValues.get(0) != null) {
			strSelection.getSelectionModel().select(selectedValues.get(0).getRawValue() - 1);
		}
		if (selectedValues.get(1) != null) {
			dexSelection.getSelectionModel().select(selectedValues.get(1).getRawValue() - 1);
		}
		if (selectedValues.get(2) != null) {
			conSelection.getSelectionModel().select(selectedValues.get(2).getRawValue() - 1);
		}
		if (selectedValues.get(3) != null) {
			intSelection.getSelectionModel().select(selectedValues.get(3).getRawValue() - 1);
		}
		if (selectedValues.get(4) != null) {
			wisSelection.getSelectionModel().select(selectedValues.get(4).getRawValue() - 1);
		}
		if (selectedValues.get(5) != null) {
			chaSelection.getSelectionModel().select(selectedValues.get(5).getRawValue() - 1);
		}
	}

	public void onSave() {
		// getting the ability score list of the current character
		List<AbilityScore> tempList = MainController.currentCharacter.getAbilityScores();

		// setting the copied global values to th currently selected ones
		tempList.get(0).setRawValue(strSelection.getSelectionModel().getSelectedItem().getRawValue());
		tempList.get(1).setRawValue(dexSelection.getSelectionModel().getSelectedItem().getRawValue());
		tempList.get(2).setRawValue(conSelection.getSelectionModel().getSelectedItem().getRawValue());
		tempList.get(3).setRawValue(intSelection.getSelectionModel().getSelectedItem().getRawValue());
		tempList.get(4).setRawValue(wisSelection.getSelectionModel().getSelectedItem().getRawValue());
		tempList.get(5).setRawValue(chaSelection.getSelectionModel().getSelectedItem().getRawValue());

		// overwriting the global values
		MainController.currentCharacter.setAbilityScores(tempList);
	}
}
