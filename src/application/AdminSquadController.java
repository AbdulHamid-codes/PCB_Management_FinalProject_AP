package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdminSquadController {
    @FXML
    private Button createSquadOpt;

    @FXML
    private Button removePlayerToSquadOpt;

    @FXML
    private Button addPlayerToSquadOpt;

    @FXML
    private Button substitutePlayerInSquadOpt;

    @FXML
    private Button backInAdminSquad;

    @FXML
    void clickAddPlayerToSquad(ActionEvent event) throws Exception{
    	Main main=new Main();
    	main.changeScene("/view/adminPlayerOption.fxml");
    }

    @FXML
    void clickBackInAdminSquad(ActionEvent event) throws Exception{
    	Main main=new Main();
    	main.changeScene("/view/adminOptions.fxml");
    }

    @FXML
    void clickCreateSquadOpt(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminCreateSquad.fxml");
    }

    @FXML
    void clickRemovePlayerToSquadOpt(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminRemovePlayerFromSquad.fxml");
    }

    @FXML
    void clickSubstitutePlayerInSquadOpt(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminSubPlayerInSquad.fxml");
    }
}
