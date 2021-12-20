package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class AdminAddPlayerToSquadController {

    @FXML
    private Button nextInAddPtoSquad;

	 private ObservableList<String>playerOp=FXCollections.observableArrayList("New Player", "Existing Payer");
 
    @FXML
    private ChoiceBox<String> addPlayerOpts;

    @FXML 
	  void initialize() {  
		 addPlayerOpts.setValue("Select");
		 addPlayerOpts.setItems(playerOp); 
	  }
    
    @FXML
    private Label messageInAddPtoSquad;

    @FXML
    private Button backInAddPtoSquad;


    @FXML
    void clickBackInAddPtoSquad(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminSquad.fxml");
    }

    @FXML
    void clickNextInAddPtoSquad(ActionEvent event) throws Exception {
		if(addPlayerOpts.getValue().toString().equals("New Player")){
	    	Main main=new Main();
	    	main.changeScene("/view/adminNewPlayerInSquad.fxml");
		}
		else if(addPlayerOpts.getValue().toString().equals("Existing Payer")) {
	    	Main main=new Main();
	    	main.changeScene("/view/adminPrevPlayerInSquad.fxml");
		}
    }
}
