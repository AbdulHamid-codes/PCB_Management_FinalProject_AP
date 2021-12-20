package application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdminPlayerOptionsController {
    @FXML
    private Button nextInPlayerOption;

    @FXML
    private Button backInPlayerOption;

    @FXML
    private ChoiceBox<String> selectPlayerOpt;
    
	  private ObservableList<String>
	  pOpts=FXCollections.observableArrayList("New Player","Previous Player");
	  
	  @FXML void initialize() {
		  selectPlayerOpt.setValue("Select");
		  selectPlayerOpt.setItems(pOpts);
	  }

	    @FXML
	    private Button backInPlayerOptions;

	    @FXML
	    void clickBackInPlayerOptions(ActionEvent event) throws Exception {
	    	Main main=new Main();
	    	main.changeScene("/view/adminSquad.fxml");
	    }

    @FXML
    void clicknNxtInPlayerOption(ActionEvent event) throws Exception {
    		if(selectPlayerOpt.getValue().toString().equals("New Player")){
    	    	Main main=new Main();
    	    	main.changeScene("/view/adminNewPlayerInSquad.fxml");
    		}
    		else if(selectPlayerOpt.getValue().toString().equals("Previous Player")) {
    	    	Main main=new Main();
    	    	main.changeScene("/view/adminPrevPlayerInSquad.fxml");
    		}
    }
}
