package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Person;

public class MainWindowController {

	@FXML private Label label;
	@FXML private TextField field;
	
	private Person person;
	private Main main;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void handleButton() {
		String text = field.getText();
		this.label.setText(text);
		this.field.clear();
	}
}
