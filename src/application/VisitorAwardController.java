package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class VisitorAwardController {
    @FXML
    private TextField year;

    @FXML
    private ListView<String> awards;

    @FXML
    private Button displayButton;

    @FXML
    private Button backInAwards;

    @FXML
    void clickBackInAwards(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/visitor.fxml");
    }

    @FXML
    void displayAwards(ActionEvent event) {

    }
}
