package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdminTournamentController {
	
    @FXML
    private Button scheduleDomesticOption;

    @FXML
    private Button addInternationalOption;

    @FXML
    private Button backInTournament;

    @FXML
    void clickAddInternationalOpt(ActionEvent event) throws Exception {
		Main m=new Main();
		m.changeScene("/view/adminAddIntFixture.fxml");
    }

    @FXML
    void clickBackInTournament(ActionEvent event) throws Exception {
		Main m=new Main();
		m.changeScene("/view/adminOptions.fxml");
    }

    @FXML
    void clickScheduleDomestic(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/adminScheduleDomTournament.fxml");
    }

}
