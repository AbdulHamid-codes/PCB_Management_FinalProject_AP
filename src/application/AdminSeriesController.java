package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AdminSeriesController {
    @FXML
    private Button scheduleOption;

    @FXML
    private Button cancelSeriesOption;

    @FXML
    private Button backInAdminSeries;

    @FXML
    void clickBackInAdminSeries(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminOptions.fxml");
    }

    @FXML
    void clickCancelSeriesOption(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminCancelSeries.fxml");
    }

    @FXML
    void clickScheduleOption(ActionEvent event) throws Exception {
    	Main main=new Main();
    	main.changeScene("/view/adminScheduleSeries.fxml");
    }
}
