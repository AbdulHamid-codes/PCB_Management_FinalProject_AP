package application;

import java.time.LocalDate;

import CustomExceptions.InvalidShirtNoException;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Batsman;
import model.Bowler;
import model.WicketKeeper;

public class AdminAddNewPlayerToSquadController {

    @FXML
    private Button addPlayerButtonInAddNP;

    @FXML
    private ChoiceBox<String> playerRole;

    private ObservableList<String>playerR =FXCollections.observableArrayList("Batsmen",
	  "Bowler", "Keeper", "Alrounder");
	  

    @FXML
    private Label messageInAddNewP;

    @FXML
    private TextField playerShirtNo;

    @FXML
    private TextField playerName;

    @FXML
    private DatePicker playerDOB;
    
    @FXML
    private ChoiceBox<String> squadTypeInAddNewP;
    
    private ObservableList<String>sqT =FXCollections.observableArrayList("T20",
    		  "ODI", "Test");
    		  
	  @FXML 
	  void initialize() {
		  playerRole.setValue("Select");
		  playerRole.setItems(playerR); 
		  squadTypeInAddNewP.setValue("Select");
		 squadTypeInAddNewP.setItems(sqT); 
	 }

	  @FXML
	  private Button backInAddNewP;
	  @FXML
	   void clicBackInAddNewP(ActionEvent event) throws Exception {
		   Main main=new Main();
		   main.changeScene("/view/adminPlayerOption.fxml");
	    }

    @FXML
    void clidkAddPlayerButtonInAddNP(ActionEvent event) throws Exception {
    	int shirtNo = Integer.parseInt(playerShirtNo.getText());
    	String name = playerName.getText();
    	LocalDate dob=playerDOB.getValue();
    	String sqType=squadTypeInAddNewP.getValue();
    	String playerR=playerRole.getValue();
    	 if(shirtNo<=0) {
    		 messageInAddNewP.setText("Shirt Number should be greater than 0");
    		 throw new InvalidShirtNoException("Shirt Number should be greater than 0");
    	 }
    	boolean flag=false;
    	if(playerR.equals("Batsman")) {
    		Batsman b=new Batsman();
    		b.setShirtNo(shirtNo);
    		b.setName(name);
    		b.setDob(dob);
    		flag = b.savePlayer(sqType);
    	}
    	if(playerR.equals("Bowler")) {
    		Bowler bo=new Bowler();
    		bo.setShirtNo(shirtNo);
    		bo.setName(name);
    		bo.setDob(dob);
    		flag = bo.savePlayer(sqType);
    	}
    	if(playerR.equals("Keeper")) {
    		WicketKeeper k=new WicketKeeper();
    		k.setShirtNo(shirtNo);
    		k.setName(name);
    		k.setDob(dob);
    		flag = k.savePlayer(sqType);
    	}
    	if(flag)
    		messageInAddNewP.setText("Successfully Added Player");
    	else
    		messageInAddNewP.setText("Could No add The player");
    	
    }
}
