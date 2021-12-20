package application;

import java.sql.Connection;
import java.sql.PreparedStatement;

import CustomExceptions.MaxPlayerInSquadLimitSquad;
import db.dbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Squad;

public class AdminCreateSquadController {
    @FXML
    private Button nextFromCreate;

    @FXML
    private TextField noOfPlayersInSquad;

    @FXML
    private ChoiceBox<String> squadTypeOptions;
    
	  private ObservableList<String>
	  squadOpts=FXCollections.observableArrayList("T20", "ODI", "Test");
	  
	  @FXML void initialize() {
		  squadTypeOptions.setValue("Select");
		  squadTypeOptions.setItems(squadOpts);
	  }
	 
    @FXML
    private Label messageInCreateSq;

    @FXML
    private Button backFromCreate;

    @FXML
    void clickBackFromCreate(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminSquad.fxml");
    }

    @FXML
    void clicknextFromCreate(ActionEvent event) throws Exception {

    	String type=squadTypeOptions.getValue().toString();
    	int p = Integer.parseInt(noOfPlayersInSquad.getText());
    	if(p>30) {
    		messageInCreateSq.setText("a Squad cannot have more than 30 players");
    		throw new MaxPlayerInSquadLimitSquad("a Squad cannot have more than 30 players");
    	}
    	Squad sq=new Squad(p, type);
    	
    	String s=sq.saveSquad();
    	messageInCreateSq.setText(s);
    	
    }
}
