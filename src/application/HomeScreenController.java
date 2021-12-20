package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeScreenController {
	

    @FXML
    private Button vistorButton;

    @FXML
    private Button adminButton;

    @FXML
    void clickAdminButton(ActionEvent event) throws Exception {
		Main m=new Main();
		m.changeScene("/view/AdminLogin.fxml");
    }

    @FXML
    void clickVistorButton(ActionEvent event)throws Exception {
		Main m=new Main();
		m.changeScene("/view/visitor.fxml");
    }
	

}
