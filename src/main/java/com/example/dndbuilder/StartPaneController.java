package com.example.dndbuilder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StartPaneController {
	private Stage stage;
	private Scene scene;
	private Parent parent;

	@FXML private Button newCharButton;
	@FXML private Button loadCharButton;
	@FXML private Button exitButton;

	@FXML
	private void initialize() {
		newCharButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					switchScene(event);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});

		loadCharButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					loadAndSwitch(event);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});
	}

	private void switchScene(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("mainView.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	private void loadAndSwitch(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("mainView.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}


}
