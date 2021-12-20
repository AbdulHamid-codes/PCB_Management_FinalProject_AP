package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdminSubstitutePlayerController {
    @FXML
    private Button nextInSubsP;

    @FXML
    private ChoiceBox<String> squadTypeInSubsP;

    @FXML
    private Label messageInSubsPlayer;

    @FXML
    private Button backInSubsP;

    @FXML
    private ChoiceBox<String> playerOptInSubsP;
    
    private ObservableList<String>optsToAddPlayer
	  =FXCollections.observableArrayList("New Player", "Existing Player");
    private ObservableList<String>squadOpts=FXCollections.observableArrayList("T20", "ODI", "Test");
    
	 @FXML 
	 void initialize() {
		 playerOptInSubsP.setValue("Select");
		 playerOptInSubsP.setItems(optsToAddPlayer);
		 
		 squadTypeInSubsP.setValue("Select");
		 squadTypeInSubsP.setItems(squadOpts);
		 
	}
    @FXML
    private TextField shirtNoInSubsP;

    @FXML
    void clickBackInSubsP(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminSquad.fxml");
    }

    @FXML
    void clickNextInSubsP(ActionEvent event) {

    }
}
