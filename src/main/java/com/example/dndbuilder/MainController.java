package com.example.dndbuilder;


import com.example.dndbuilder.controllers.build.ClassPaneController;
import com.example.dndbuilder.controllers.InspectorController;
import com.example.dndbuilder.controllers.build.LanguagePaneController;
import com.example.dndbuilder.controllers.build.RacePaneController;
import javafx.fxml.FXML;

public class MainController{

	// Inject the other controllers into the main controller for access
	@FXML private ClassPaneController classPaneController;
	@FXML private RacePaneController racePaneController;
	@FXML private InspectorController inspectorController;
	@FXML private LanguagePaneController languagePaneController;

	@FXML
	private void initialize() {
		// Inject the main Controller into the other controllers for access
		classPaneController.injectMainController(this);
		racePaneController.injectMainController(this);
		inspectorController.injectMainController(this);
		languagePaneController.injectMainController(this);

		// Inject other controllers to them
		racePaneController.injectInspectorController(inspectorController);
		classPaneController.injectInspectorController(inspectorController);
		languagePaneController.injectInspectorController(inspectorController);
	}
}
