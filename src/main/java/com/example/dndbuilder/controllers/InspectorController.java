package com.example.dndbuilder.controllers;

import com.example.dndbuilder.MainController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InspectorController {

	private MainController mainController;

	@FXML
	private Label name;
	@FXML
	private Label description;

	@FXML
	private void initialize() {

	}

	public void injectMainController(MainController controller) {
		mainController = controller;
	}

	public void setNameContent(String content) {
		name.setText(content);
	}

	public void setDescriptionContent(String content) {
		description.setText(content);
	}
}
