package com.example.dndbuilder;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ComponentManager implements Initializable {

	@FXML
	private ListView<String> testList;

	@FXML
	private Label InspectorText;

	String[] food = {"Pizza", "Soup", "Schurkilade"};

	String currentFood;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		testList.getItems().addAll(food);
		System.out.println(testList.getItems());

		testList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
			currentFood = testList.getSelectionModel().getSelectedItem();

			InspectorText.setText(currentFood);
		});
	}
}
