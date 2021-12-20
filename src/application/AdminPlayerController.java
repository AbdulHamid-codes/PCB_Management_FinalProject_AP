package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AdminPlayerController {

    @FXML
    private Button updateButton;

    @FXML
    private TextField shirtNo;

    @FXML
    void clickUpdate(ActionEvent event) {

    }
    @FXML
    private Button backInPlayer;

    @FXML
    void clickBackInPlayer(ActionEvent event) throws Exception{
    	Main m=new Main();
    	m.changeScene("/view/adminOptions.fxml");
    }
    
    @FXML
    private Button updateProfileBatsmen;

    @FXML
    private TextField runsScored;

    @FXML
    private TextField ballsPlayed;

    @FXML
    private TextField catchesTakenBatsmen;

    @FXML
    void updateProfileBatsmen(ActionEvent event) {

    }
    
    @FXML
    private Button updateProfileButtonBowler;

    @FXML
    private TextField runsConceeded;

    @FXML
    private TextField ballsBowled;

    @FXML
    private TextField wicketsTaken;

    @FXML
    private TextField catchesCaughtBowler;

    @FXML
    void clickUpdateProfileBowlerr(ActionEvent event) {

    }
    @FXML
    private Button updateProfileButtonKeeper;

    @FXML
    private TextField runsScoredKeeper;

    @FXML
    private TextField ballsPlayedKeeper;

    @FXML
    private TextField catchesTakenKeeper;

    @FXML
    private TextField stumpsBlown;

    @FXML
    void clickUpdateProfileButtonKeeper(ActionEvent event) {

    }
}
