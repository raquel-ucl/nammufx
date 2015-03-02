package uk.ac.ucl.oracc.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.TextFlow;
import uk.ac.ucl.oracc.MainApp;

public class AtfEditorController {
	
	//Elements in the view
	@FXML
    private Button newAtfFile;
	@FXML
	private Button openAtfFile;
	@FXML
	private Button saveAtfFile;
	@FXML
	private Button copyText;
	@FXML
	private Button cutText;
	@FXML
	private Button pasteText;
	@FXML
	private Button validateAtf;
	@FXML
	private Button lemmatizeAtf;
	@FXML
	private Button consoleView;
	@FXML
	private Button modelView;
	@FXML
	private Button unicodeMode;
	@FXML
	private Button nammuHelp;
	@FXML
	private TextFlow textFlow;
	

    // Reference to the main application
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public AtfEditorController() {
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
