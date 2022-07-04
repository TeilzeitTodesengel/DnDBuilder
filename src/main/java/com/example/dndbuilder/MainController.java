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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class MainController{

	static File loadedCharacterFile = null;

	private Stage stage;
	private Scene scene;

	public static Character loadedCharacter = new Character(
			"Isaac",
			0,
			new ArrayList<AbilityScore>(),
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
	@FXML private MenuItem exitMenuItem;
	@FXML private Menu charName;
	@FXML private AnchorPane ap;


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

		exitMenuItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Parent root = null;
				try {
					root = FXMLLoader.load(getClass().getResource("startPane.fxml"));
					stage = (Stage)  ap.getScene().getWindow();
					scene = new Scene(root);
					stage.setScene(scene);
					stage.show();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}

			}
		});
	}

	public void onLoad() throws IOException {
		// FileChooser to select the file to load
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JSON", "*.json"));

		// Saving the file in a local variable
		loadedCharacterFile = fileChooser.showOpenDialog(Stage.getWindows().get(0));

		// Turns the Json Object into an object of type character
		ObjectMapper mapper = new ObjectMapper();
		loadedCharacter = mapper.readValue(
				loadedCharacterFile,
				Character.class
		);
		System.out.println("Character loaded");

		// Changes the Character Name Field in the Top Bar
		charName.setText(loadedCharacter.getName());

		// onLoad Methods of single components
		abilityScorePaneController.onLoad(loadedCharacter.getAbilityScores());
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
		String json = ow.writeValueAsString(loadedCharacter);

		// File Picker, so that the User can choose a location and name for the save
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JSON", "*.json"));

		// File Writer init
		PrintWriter writer;
		if(loadedCharacterFile == null) { // If there is no file loaded save into a new File
			writer = new PrintWriter(fileChooser.showSaveDialog(Stage.getWindows().get(0)));
		} else { // If a file is loaded overwrite the existing
			writer = new PrintWriter(loadedCharacterFile);
		}

		// Writing the file.
		writer.println(json);
		writer.close();
		System.out.println("Character saved");
		System.out.println("Json: \n" + json);
	}
}
