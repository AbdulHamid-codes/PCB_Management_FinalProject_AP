package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

public class VisitorTournamentController {

	   @FXML
	    private Button displayDomTournament;

	    @FXML
	    private Button internatinalTournaments;

	    @FXML
	    private Button backInVisitorTourn;

	    @FXML
	    void clickBackInVisitorTourn(ActionEvent event) throws Exception {
	    	Main m=new Main();
			m.changeScene("/view/visitor.fxml");
	    }

	    @FXML
	    void clickInternatinalTournaments(ActionEvent event) throws Exception {
	       	Main m=new Main();
	    	m.changeScene("/view/visitorInternationalTournamentFixtures.fxml");
	    }

	    @FXML
	    void displayDomTournamentDetails(ActionEvent event) throws Exception {
	    	Main m=new Main();
			m.changeScene("/view/visitorTournamentDetails.fxml");
	    }
 
}
