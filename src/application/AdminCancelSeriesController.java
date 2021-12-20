package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class AdminCancelSeriesController {
    @FXML
    private Button cancelSeriesButton;

    @FXML
    private DatePicker startDateCancelSeries;

    @FXML
    private Label noSeriesMessage;

    @FXML
    private Button backInCancelSeries;

    @FXML
    void clickBackInCancelSeries(ActionEvent event) throws Exception{
    	Main main=new Main();
    	main.changeScene("/view/adminSeries.fxml");
    }

    @FXML
    void clickCancelSeriesButton(ActionEvent event) {

    }
}
