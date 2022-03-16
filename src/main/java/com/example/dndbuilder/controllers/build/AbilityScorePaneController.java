package com.example.dndbuilder.controllers.build;

import com.example.dndbuilder.MainController;
import com.example.dndbuilder.datatypes.AbilityScore;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
	@FXML
	private Label strLabel;
	@FXML
	private Label dexLabel;
	@FXML
	private Label conLabel;
	@FXML
	private Label intLabel;
	@FXML
	private Label wisLabel;
	@FXML
	private Label chaLabel;



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

	@FXML
	private void initialize() {
		// Setting the cell Factories for the Combo boxes & Setting the Button Cell for the Combo Box
		// that the Objects are displayed correct
		strSelection.setCellFactory(new Callback<>() {

			@Override
			public ListCell<AbilityScore> call(ListView<AbilityScore> param) {
				return new ListCell<>() {

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
		});
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
		dexSelection.setCellFactory(new Callback<>() {

			@Override
			public ListCell<AbilityScore> call(ListView<AbilityScore> param) {
				return new ListCell<>() {

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
		conSelection.setCellFactory(new Callback<>() {

			@Override
			public ListCell<AbilityScore> call(ListView<AbilityScore> param) {
				return new ListCell<>() {

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
		intSelection.setCellFactory(new Callback<>() {

			@Override
			public ListCell<AbilityScore> call(ListView<AbilityScore> param) {
				return new ListCell<>() {

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
		wisSelection.setCellFactory(new Callback<>() {

			@Override
			public ListCell<AbilityScore> call(ListView<AbilityScore> param) {
				return new ListCell<>() {

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
		chaSelection.setCellFactory(new Callback<>() {

			@Override
			public ListCell<AbilityScore> call(ListView<AbilityScore> param) {
				return new ListCell<>() {

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
}
