package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdminRemovePlayerController {
    @FXML
    private Button removePlayerButton;

    @FXML
    private ChoiceBox<String> squadTypeInRemvovePlayer;
    
  	private ObservableList<String>squadOpts=FXCollections.observableArrayList("T20", "ODI", "Test");
  	  
	 @FXML 
	 void initialize() {
		  squadTypeInRemvovePlayer.setValue("Select");
		  squadTypeInRemvovePlayer.setItems(squadOpts); 
	  }
    @FXML
    private Label messageInRemovePlayer;

    @FXML
    private Button backInRemovePlayer;

    @FXML
    private TextField shirtNoToRemove;

    @FXML
    void clickBackInRemovePlayer(ActionEvent event) throws Exception{
    	Main main=new Main();
    	main.changeScene("/view/adminSquad.fxml");
    }

    @FXML
    void clickRemovePlayerButton(ActionEvent event) {

    }
}
