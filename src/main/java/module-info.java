module com.example.dndbuilder {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;

	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires eu.hansolo.tilesfx;

	opens com.example.dndbuilder to javafx.fxml;
	exports com.example.dndbuilder;
}