package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.DomesticTournament;

public class AdminScheduleDomTournamentController {

    @FXML
    private Button scheduleDomButton;

    @FXML
    private TextField noOfTeams;

    @FXML
    private DatePicker startDateDomestic;

    @FXML
    private DatePicker endDateDomestic;

    @FXML
    private Label domDateClashMessage;

    @FXML
    private Button backInScheduleDomTou;

    @FXML
    void clickBackInScheduleDomTou(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminTournament.fxml");
    }

    @FXML
    void clickScheduleDom(ActionEvent event) {
    	boolean flag;
    	int teams = Integer.parseInt(noOfTeams.getText());
    	LocalDate startD=startDateDomestic.getValue();
    	LocalDate endD=endDateDomestic.getValue();
    	
    	DomesticTournament domT=new DomesticTournament();
    	domT.setNoOfTeams(teams);
    	domT.setEndDate(endD);
    	domT.setStartDate(startD);
    	flag=domT.save();
    	
    	if(flag) {
    		domDateClashMessage.setText("Created domestic Tournament");
    	}
    	else {
    		domDateClashMessage.setText("Could not create Domestic tournament");
    	}
    	
    }
}
