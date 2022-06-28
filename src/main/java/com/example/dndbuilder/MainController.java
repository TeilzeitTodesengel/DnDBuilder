package com.example.dndbuilder;


import com.example.dndbuilder.controllers.build.AbilityScorePaneController;
import com.example.dndbuilder.controllers.build.ClassPaneController;
import com.example.dndbuilder.controllers.InspectorController;
import com.example.dndbuilder.controllers.build.LanguagePaneController;
import com.example.dndbuilder.controllers.build.RacePaneController;
import com.example.dndbuilder.datatypes.AbilityScore;
import com.example.dndbuilder.datatypes.Character;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class MainController{

	File loadedChar = null;

	static List<AbilityScore> abilityScores = new ArrayList<AbilityScore>();


	public static Character currentCharacter = new Character(
			"Isaac",
			0,
			abilityScores,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null
	);


	// Inject the other controllers into the main controller for access
	@FXML private ClassPaneController classPaneController;
	@FXML private RacePaneController racePaneController;
	@FXML private InspectorController inspectorController;
	@FXML private LanguagePaneController languagePaneController;
	@FXML private AbilityScorePaneController abilityScorePaneController;
	@FXML private MenuItem loadMenuItem;
	@FXML private MenuItem saveMenuItem;
	@FXML private Menu charName;


	@FXML
	private void initialize() {
		// Inject the main Controller into the other controllers for access
		classPaneController.injectMainController(this);
		racePaneController.injectMainController(this);
		inspectorController.injectMainController(this);
		languagePaneController.injectMainController(this);
		abilityScorePaneController.injectMainController(this);

		// Inject other controllers to them
		racePaneController.injectInspectorController(inspectorController);
		classPaneController.injectInspectorController(inspectorController);
		languagePaneController.injectInspectorController(inspectorController);

		// Save & Load Logic
		loadMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				try {
					onLoad();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});

		saveMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				try {
					onSave();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		});

		// Initialize Global Lists
		for(int i = 0; i < 6; i++) {
			abilityScores.add(new AbilityScore(1,  false));
		}
	}

	private void onLoad() throws IOException {
		// FileChooser to select the file to load
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JSON", "*.json"));

		// Saving the file in a local variable
		loadedChar = fileChooser.showOpenDialog(Stage.getWindows().get(0));

		// Turns the Json Object into an object of type character
		ObjectMapper mapper = new ObjectMapper();
		currentCharacter = mapper.readValue(
				loadedChar,
				Character.class
		);
		System.out.println("Character loaded");

		// Changes the Character Name Field in the Top Bar
		charName.setText(currentCharacter.getName());

		// onLoad Methods of single components
		abilityScorePaneController.onLoad(currentCharacter.getAbilityScores());
		// TODO Race onLoad
		// TODO Class onLoad
		// TODO Languages onLoad
	}

	// Saves Character in external file
	private void onSave() throws IOException {

		// onSave Methods form the single components
		abilityScorePaneController.onSave();
		// TODO Race onSave
		// TODO Class onSave
		// TODO Languages onSave

		// Turns currentCharacter object into Json Object
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(currentCharacter);

		// File Picker, so that the User can choose a location and name for the save
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JSON", "*.json"));

		// File Writer init
		PrintWriter writer;
		if(loadedChar == null) { // If there is no file loaded save into a new File
			writer = new PrintWriter(fileChooser.showSaveDialog(Stage.getWindows().get(0)));
		} else { // If a file is loaded overwrite the existing
			writer = new PrintWriter(loadedChar);
		}

		// Writing the file.
		writer.println(json);
		writer.close();
		System.out.println("Character saved");
		System.out.println("Json: \n" + json);
	}
}
