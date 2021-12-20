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

public class VisitorIntTourFixController {
    @FXML
    private Button pakFixtures;

    @FXML
    private ListView<String> pakistanFixtureList;

    @FXML
    private Button backInIntTournFixture;

    @FXML
    void clickBackInIntTournFixture(ActionEvent event) throws Exception{
       	Main m=new Main();
       m.changeScene("/view/visitor.fxml");
    }

    @FXML
    void showPakFixtures(ActionEvent event) throws Exception {
      	try {
    			Connection con=dbConnection.getConnection();
    			Statement stmt  = con.createStatement();
    			String sql = "SELECT * " +
    		             "FROM International_tournament ";

    		ResultSet rs    = stmt.executeQuery(sql);
    		pakistanFixtureList.getItems().add("name       StartDate         endDate ");
    		while (rs.next()) {
    			String line= rs.getString("name");
    			line+="          "+rs.getObject("startDate");
    			line+="         "+rs.getObject("endDate");
    			pakistanFixtureList.getItems().add(line);	
    			}
    		}
    		catch(Exception e) {
    			System.out.println(e);
    			String s=e.getMessage();
    			//messageInCreateSq.setText(s);
    		}
    }

}
