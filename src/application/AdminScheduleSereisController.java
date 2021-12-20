package application;

import java.time.LocalDate;

import CustomExceptions.EndDateGreaterThanStartDateException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Series;

public class AdminScheduleSereisController {
    @FXML
    private Button scheduleButton;

    @FXML
    private TextField hostName;

    @FXML
    private TextField type;
    
    @FXML
    private ChoiceBox<String> format;
    
    private ObservableList<String> formats=FXCollections.observableArrayList("T20I","ODI", "Test");
	@FXML
	void initialize() {
		format.setValue("Select");
		format.setItems(formats);	
	}
   
    @FXML
    private DatePicker startDate;

    @FXML
    private DatePicker endDate;

    @FXML
    private Label clashMessage;

    @FXML
    private Button backInScheduleSeries;

    @FXML
    void clickBackInScheduleSeries(ActionEvent event) throws Exception{
    	Main main=new Main();
    	main.changeScene("/view/adminSeries.fxml");
    }

    @FXML
    void clickSchedule(ActionEvent event) throws Exception {
    	
    	boolean flag;
    	String hos=hostName.getText();
    	String t=type.getText();
    	String form=format.getValue();
    	LocalDate startD=startDate.getValue();
    	LocalDate endD=endDate.getValue();
    	
    	if(endD.isBefore(startD)) {
    		clashMessage.setText("End date cannot be earlier than start Date");
    		throw new EndDateGreaterThanStartDateException("End date cannot be earlier than start Date");
    	}
    	Series s = new Series(form, t, hos, startD, endD);
    	flag=s.Save();
    	
    	if(flag)
    		clashMessage.setText("Scheduled the Series");
    	else
    		clashMessage.setText("Could not schedule series");
    		
    	
    }
}
