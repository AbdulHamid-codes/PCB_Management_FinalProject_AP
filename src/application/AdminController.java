package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Admin;

public class AdminController {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button login;

    @FXML
    private Label invalidLogin;

    @FXML
    void AdminLogin(ActionEvent event) throws Exception {
    	boolean flag;
    	String uname=username.getText().toString();
    	String pass=password.getText().toString();
    	
    	Admin admin=new Admin(uname, pass);
    	
    	flag = admin.validate();
    	if(flag) {
    		Main m=new Main();
    		m.changeScene("/view/adminOptions.fxml");
    	}
		  else { invalidLogin.setText("Invalid or empty username or Password"); }
    }
    
    @FXML
    private Button playerOption;

    @FXML
    private Button tournamentOption;

    @FXML
    private Button squadOption;

    @FXML
    private Button seriesOption;

    @FXML
    private Button awardsOption;
    
    @FXML
    private Button backInAdmin;
    
    @FXML
    void clickBackInAdmin(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/homeScreen.fxml");
    }

    @FXML
    void clickPlayerOption(ActionEvent event) throws Exception {
		Main m=new Main();
		m.changeScene("/view/adminPlayer.fxml");
    }
    
    @FXML
    void clickTournamentOption(ActionEvent event) throws Exception {
		Main m=new Main();
		m.changeScene("/view/adminTournament.fxml");
    }

    @FXML
    void clickSquadOption(ActionEvent event) throws Exception {
		Main m=new Main();
		m.changeScene("/view/adminSquad.fxml");
    }
    
    @FXML
    void clickSeriesOpition(ActionEvent event) throws Exception{
		Main m=new Main();
		m.changeScene("/view/adminSeries.fxml");
    }
    
    @FXML
    void clickAwardsoption(ActionEvent event)throws Exception {
		Main m=new Main();
		m.changeScene("/view/adminAwards.fxml");
    }


}
