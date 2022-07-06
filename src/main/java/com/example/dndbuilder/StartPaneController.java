package com.example.dndbuilder;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StartPaneController {
	private Stage stage;
	private Scene scene;
	@FXML private Button newCharButton;
	@FXML private Button loadCharButton;
	@FXML private Button exitButton;

	@FXML
	private void initialize() {
		newCharButton.setOnAction(event -> {
			try {
				switchScene(event);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});

		loadCharButton.setOnAction(event -> {
			try {
				loadAndSwitch(event);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});

		exitButton.setOnAction(event -> {
			Platform.exit();
			System.exit(0);
		});
	}

	private void switchScene(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainView.fxml")));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	private void loadAndSwitch(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainView.fxml")));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}


}
