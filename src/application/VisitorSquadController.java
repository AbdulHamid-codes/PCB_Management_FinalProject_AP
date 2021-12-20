package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.dbConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

public class VisitorSquadController {
    @FXML
    private Button display;

    @FXML
    private ListView<String> squadList;

    @FXML
    private Button backInSquad;

    @FXML
    void clickBackInSquad(ActionEvent event)throws Exception {
    	Main m=new Main();
		m.changeScene("/view/visitor.fxml");
    }

    @FXML
    void displaySquad(ActionEvent event) throws Exception {
      	try {
    			Connection con=dbConnection.getConnection();
    			Statement stmt  = con.createStatement();
    			String sql = "SELECT * " +
    		             "FROM squad ";

    		ResultSet rs    = stmt.executeQuery(sql);
    		squadList.getItems().add("type       noOfPlayers ");
    		while (rs.next()) {
    			String line= rs.getString("type");
    			line+="          "+Integer.toString(rs.getInt("noOfPlayers"));
    			squadList.getItems().add(line);	
    			}
    		}
    		catch(Exception e) {
    			System.out.println(e);
    			String s=e.getMessage();
    			//messageInCreateSq.setText(s);
    		}
    }




}
