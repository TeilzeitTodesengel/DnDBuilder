package com.example.dndbuilder.controllers.build;

import com.example.dndbuilder.MainController;
import com.example.dndbuilder.controllers.InspectorController;
import com.example.dndbuilder.datatypes.Language;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import java.util.List;

public class LanguagePaneController {
	private MainController mainController;
	private InspectorController inspectorController;

	@FXML
	private ListView<Language> languageList;
	@FXML
	private ListView<Language> selectedLanguageList;
	@FXML
	private Button selectButton;
	@FXML
	private Button removeButton;


	private Language[] languages = {new Language("Common", "Die Gemeinsprache der Welt."),
			new Language("Celestial", "Die Sprache der Engel und Götter."),
			new Language("Infernal", "Die Sprache der Teufel."),
			new Language("Abyssal", "Die Sprache der Dämonen."),
			new Language("Grung", "Die Sprache der Grung."),};

	private Language currentSelection;

	@FXML
	private void initialize() {
		selectButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				onSelect();
			}
		});
		removeButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				onRemove();
			}
		});

		// Initialize current selected Languages
		removeButton.setVisible(false);
		selectedLanguageList.setVisible(false);

		selectedLanguageList.setCellFactory(param -> new ListCell<Language>() {
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

		selectedLanguageList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
			if (!selectedLanguageList.getItems().isEmpty()) {
				currentSelection = selectedLanguageList.getSelectionModel().getSelectedItem();
				inspectorController.setNameContent(currentSelection.getName());
				inspectorController.setDescriptionContent(currentSelection.getDescription());
				System.out.println("Current Selection: " + currentSelection.getName());
			}
		});

		// Initialize language list
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

	public void onSelect() {
		removeButton.setVisible(true);
		selectedLanguageList.setVisible(true);

		if (!selectedLanguageList.getItems().contains(currentSelection)) {
			selectedLanguageList.getItems().add(currentSelection);
		}
	}

	public void onRemove() {
		if ((selectedLanguageList.getItems().contains(currentSelection)) && currentSelection != null) {
			System.out.println(currentSelection.getName());
			selectedLanguageList.getItems().remove(currentSelection);
		}
		if (selectedLanguageList.getItems().isEmpty()) {
			removeButton.setVisible(false);
			selectedLanguageList.setVisible(false);
		}
	}


	public void injectMainController(MainController controller) {
		mainController = controller;
	}
	public void injectInspectorController(InspectorController controller) {
		inspectorController = controller;
	}

}
