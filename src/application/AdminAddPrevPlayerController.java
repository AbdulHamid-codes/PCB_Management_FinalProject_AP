package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Player;
import model.Squad;
public class AdminAddPrevPlayerController {
    @FXML
    private Button addButtonInExixP;

    @FXML
    private Label messageInAddExisP;

    @FXML
    private Button backInAddExisP;

    @FXML
    private TextField shirtNoInExisP;


    @FXML
    private ChoiceBox<String> squadTypeInAddPreP;
    
    private ObservableList<String>sqT =FXCollections.observableArrayList("T20",
  		  "ODI", "Test");
    
    @FXML void initialize() {
    	squadTypeInAddPreP.setValue("Select");
    	squadTypeInAddPreP.setItems(sqT); 
	 }
    @FXML
    void clickAddButtonInExixP(ActionEvent event) {
    	int shirtNo = Integer.parseInt(shirtNoInExisP.getText());
    	Squad sq=new Squad();
    	String Stype=squadTypeInAddPreP.getValue();
    	boolean flag=sq.addPlayer(shirtNo, Stype);
    	if(flag){
    		messageInAddExisP.setText("Added player to the squad");
    	}
    	else
    		messageInAddExisP.setText("Either player or squad is not found or already added");
    }

    @FXML
    void clickBackInAddExisP(ActionEvent event)throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminPlayerOption.fxml");
    }


}
