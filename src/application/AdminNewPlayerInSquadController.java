package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdminNewPlayerInSquadController {
    @FXML
    private Button addPlayerButtonInAddNP;

   
    @FXML
    private ChoiceBox<String> playerRole;
    
	  private ObservableList<String>
	  pRole=FXCollections.observableArrayList("Batsem", "Bowler", "Keeper");
	  
	  @FXML void initialize() {
		  playerRole.setValue("Select");
		  playerRole.setItems(pRole);
	  }
    

    @FXML
    private Label messageInAddNewP;

    @FXML
    private Button backInAddNewP;

    @FXML
    private TextField playerShirtNo;

    @FXML
    private TextField playerName;

    @FXML
    private TextField playerAge;

    @FXML
    private Button backInNewPlayer;

    @FXML
    void clicBackInAddNewP(ActionEvent event) {

    }

    @FXML
    void clickBackInNewPlayer(ActionEvent event) {

    }

    @FXML
    void clidkAddPlayerButtonInAddNP(ActionEvent event) {

    }
}
