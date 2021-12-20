package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.PCBawards;

public class AdminAwardController {
    @FXML
    private Button createAwardButton;

    @FXML
    private Label messageInCreateAward;
    
    @FXML
    private TextField awardName;

    @FXML
    private TextField awardYear;

    @FXML
    private TextField awardWinner;

    @FXML
    void clickCreateAwardButton(ActionEvent event) {
    	boolean flag;
    	String name=awardName.getText();
    	int year = Integer.parseInt(awardYear.getText());
    	String w=awardWinner.getText();
    	
    	PCBawards award=new PCBawards();
    	award.setAwardName(name);
    	award.setWinner(w);
    	award.setYear(year);
    	
    	flag = award.save();
    	if(flag) {
    		messageInCreateAward.setText(" Award Created Successfully");
    	}
    	else {
    		messageInCreateAward.setText("Could not create an Award");
    	}
	
    }
    @FXML
    private Button backInCreateAward;
    @FXML
    void clickBackInCreateAward(ActionEvent event) throws Exception{
    	Main m=new Main();
    	m.changeScene("/view/adminOptions.fxml");
    }
}
