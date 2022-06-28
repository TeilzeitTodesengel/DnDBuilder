module com.example.dndbuilder {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;

	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires eu.hansolo.tilesfx;
	requires com.fasterxml.jackson.databind;

	opens com.example.dndbuilder to javafx.fxml;
	opens com.example.dndbuilder.controllers to javafx.fxml;
	exports com.example.dndbuilder;
	opens com.example.dndbuilder.controllers.build to javafx.fxml;

	// Custom Exports
	exports com.example.dndbuilder.datatypes to com.fasterxml.jackson.databind;
	exports com.example.dndbuilder.states to com.fasterxml.jackson.databind;
}