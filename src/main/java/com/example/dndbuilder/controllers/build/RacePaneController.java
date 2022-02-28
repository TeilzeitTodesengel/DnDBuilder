package com.example.dndbuilder.controllers.build;

import com.example.dndbuilder.MainController;
import com.example.dndbuilder.controllers.InspectorController;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class RacePaneController {

	private MainController mainController;
	private InspectorController inspectorController;

	@FXML
	private ListView<String> raceList;

	private String[] foods = {"Pizza", "Soup", "Schurkilade"};

	private String currentSelection;

	@FXML
	private void initialize() {
		raceList.getItems().addAll(foods);

		raceList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
			currentSelection = raceList.getSelectionModel().getSelectedItem();
			inspectorController.setNameContent(currentSelection);
		});

	}

	public void injectMainController(MainController controller) {
		mainController = controller;
	}

	public void injectInspectorController(InspectorController controller){
		inspectorController = controller;
	}
}
