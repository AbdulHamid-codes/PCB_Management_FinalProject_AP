package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class AdminAddPlayerOptionsController {
	  @FXML
	    private Button nextInPlayerOption;

	    @FXML
	    private Button backInPlayerOption;

	    @FXML
	    private ChoiceBox<String> selectPlayerOpt;

	    private ObservableList<String> squadOpts=FXCollections.observableArrayList("New Player", "Previous Player");
		  
		  @FXML void initialize() {
			  selectPlayerOpt.setValue("Select");
			  selectPlayerOpt.setItems(squadOpts);
		  }
	    @FXML
	    private Button backInPlayerOpt;

	    @FXML
	    void clickBackInPlayerOpt(ActionEvent event) {

	    }

	    @FXML
	    void clickBackInPlayerOption(ActionEvent event) {

	    }

	    @FXML
	    void clicknNxtInPlayerOption(ActionEvent event)throws Exception {
			if(selectPlayerOpt.getValue().toString().equals("New Player")){
		    	Main main=new Main();
		    	main.changeScene("/view/adminNewPlayerInSquad.fxml");
			}
			else if(selectPlayerOpt.getValue().toString().equals("Existing Payer")) {
		    	Main main=new Main();
		    	main.changeScene("/view/adminPrevPlayerInSquad.fxml");
			}
	    }
}
