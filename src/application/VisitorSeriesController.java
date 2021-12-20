package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

public class VisitorSeriesController {
    @FXML
    private Button checkSeriesFixture;

    @FXML
    private Button displaySeries;

    @FXML
    private Button backInSeries;

    @FXML
    void clickBackInSeries(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/visitor.fxml");
    }

    @FXML
    void clickCheckSeries(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/visitorCheckSeriesFixture.fxml");
    }

    @FXML
    void clickDisplaySeries(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/visitorDisplaySeriesDetails.fxml");
    }
}
