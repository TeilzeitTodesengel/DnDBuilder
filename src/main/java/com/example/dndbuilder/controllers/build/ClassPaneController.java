package com.example.dndbuilder.controllers.build;

import com.example.dndbuilder.MainController;
import com.example.dndbuilder.controllers.InspectorController;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ClassPaneController{

	private MainController mainController;
	private InspectorController inspectorController;

	@FXML
	private ListView<String> classList;

	private String[] foods = {"Pizza", "Soup", "Schurkilade"};

	private String currentSelection;

	@FXML
	private void initialize() {
		classList.getItems().addAll(foods);

		classList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
			currentSelection = classList.getSelectionModel().getSelectedItem();
			inspectorController.setNameContent(currentSelection);
		});
	}

	public void injectMainController(MainController controller) {
		mainController = controller;
	}
	public void injectInspectorController(InspectorController controller) {
		inspectorController = controller;
	}
}
