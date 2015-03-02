package uk.ac.ucl.oracc.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.text.TextFlow;
import uk.ac.ucl.oracc.MainApp;

public class RootLayoutController {

	// Elements in the view
	@FXML
	private MenuItem newAtfFile;
	@FXML
	private MenuItem openAtfFile;
	@FXML
	private MenuItem saveAtfFile;
	@FXML
	private MenuItem quitNammu;
	@FXML
	private MenuItem copyText;
	@FXML
	private MenuItem cutText;
	@FXML
	private MenuItem pasteText;
	@FXML
	private MenuItem validateAtf;
	@FXML
	private MenuItem lemmatizeAtf;
	@FXML
	private MenuItem consoleView;
	@FXML
	private MenuItem modelView;
	@FXML
	private MenuItem unicodeMode;
	@FXML
	private MenuItem nammuAbout;
	@FXML
	private MenuItem nammuHelp;

	// Reference to the main application
	private MainApp mainApp;

	/**
	 * The constructor. The constructor is called before the initialize()
	 * method.
	 */
	public RootLayoutController() {
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {

	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

	}

}
