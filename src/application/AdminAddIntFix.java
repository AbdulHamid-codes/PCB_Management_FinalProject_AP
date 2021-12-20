package application;

import java.time.LocalDate;

import CustomExceptions.EndDateGreaterThanStartDateException;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.DomesticTournament;
import model.InternationalTournament;

public class AdminAddIntFix {
	
    @FXML
    private Label messageInINTf;
    
    @FXML
    private Button scheduleFixButton;

    @FXML
    private TextField name;

    @FXML
    private DatePicker matchDateIntTournament;

    @FXML
    private DatePicker startDateIntTournament;

    @FXML
    private Button backInAddIntFix;

    @FXML
    void clickBackInAddIntFix(ActionEvent event)throws Exception {
       	Main main=new Main();
    	main.changeScene("/view/adminTournament.fxml");
    }

    @FXML
    void clickScheduleFixButton(ActionEvent event) throws Exception {
    	boolean flag;
    	String n=name.getText();
    	LocalDate endD=matchDateIntTournament.getValue();
    	LocalDate startD=startDateIntTournament.getValue();
    	
    	if(endD.isBefore(startD)) {
    		messageInINTf.setText("End date cannot be earlier than start Date");
    		throw new EndDateGreaterThanStartDateException("End date cannot be earlier than start Date");
    	}
    	InternationalTournament intT=new InternationalTournament();
    	intT.setName(n);
    	intT.setEndDate(endD);
    	intT.setStartDate(startD);
    	flag=intT.save();
    	
    	if(flag) {
    		messageInINTf.setText("Created International Tournament");
    	}
    	else {
    		messageInINTf.setText("Could not create international tournament");
    	}
    }

 
}
