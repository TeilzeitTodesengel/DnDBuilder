package com.example.dndbuilder.controllers.build;

import com.example.dndbuilder.MainController;
import com.example.dndbuilder.controllers.InspectorController;
import com.example.dndbuilder.datatypes.Language;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

public class LanguagePaneController {
	private MainController mainController;
	private InspectorController inspectorController;

	@FXML
	private ListView<Language> languageList;

	private Language[] languages = {new Language("Common", "Die Gemeinsprache der Welt."),
			new Language("Celestial", "Die Sprache der Engel und Götter."),
			new Language("Infernal", "Die Sprache der Teufel."),
			new Language("Abyssal", "Die Sprache der Dämonen."),
			new Language("Grung", "Die Sprache der Grung."),};

	private Language currentSelection;

	@FXML
	private void initialize() {
		languageList.getItems().addAll(languages);

		languageList.setCellFactory(param -> new ListCell<Language>() {
			@Override
			protected void updateItem(Language item, boolean empty) {
				super.updateItem(item, empty);

				if (empty || item == null || item.getName() == null) {
					setText(null);
				} else {
					setText(item.getName());
				}
			}
		});

		languageList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
			currentSelection = languageList.getSelectionModel().getSelectedItem();
			inspectorController.setNameContent(currentSelection.getName());
			inspectorController.setDescriptionContent(currentSelection.getDescription());
		});

	}


	public void injectMainController(MainController controller) {
		mainController = controller;
	}
	public void injectInspectorController(InspectorController controller) {
		inspectorController = controller;
	}
}
