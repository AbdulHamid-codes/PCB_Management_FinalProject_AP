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
import model.Series;

public class VisitorCheckSeriesController {
    @FXML
    private Button checkSeries;

    @FXML
    private Button backInCheckSeriesFixture;

    @FXML
    private ListView<String> seriesF;

    @FXML
    void checkSeriesFIxtureOnTheGivenDate(ActionEvent event)throws Exception {
       	try {
    			Connection con=dbConnection.getConnection();
    			Statement stmt  = con.createStatement();
    			String sql = "SELECT * " +
    		             "FROM series ";

    		ResultSet rs    = stmt.executeQuery(sql);
    		seriesF.getItems().add("Format    Type         StartDate         endDate ");
    		while (rs.next()) {
    			String line=rs.getString("fromat");
    			line+="          "+rs.getString("type");
    			line+="          "+rs.getObject("startDate");
    			line+="         "+rs.getObject("endDate");
    			seriesF.getItems().add(line);	
    			}
    		}
    		catch(Exception e) {
    			System.out.println(e);
    			String s=e.getMessage();
    			//messageInCreateSq.setText(s);
    		}
    }

    @FXML
    void clickBackInCheckSeriesFixture(ActionEvent event) throws Exception {
       	Main m=new Main();
    		m.changeScene("/view/visitor.fxml");
    }

 
}
