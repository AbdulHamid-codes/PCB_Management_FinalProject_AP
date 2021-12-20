package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class VisitorDisplaySeriesController {
    @FXML
    private DatePicker startDate;

    @FXML
    private ListView<String> seriesDetails;

    @FXML
    private Button display;

    @FXML
    private Button backInDispSeriesDetails;

    @FXML
    void clickBackInDispSeriesDetails(ActionEvent event) throws Exception {
       	Main m=new Main();
    		m.changeScene("/view/visitor.fxml");
    }

    @FXML
    void displayDetails(ActionEvent event) {
 
    }
}
