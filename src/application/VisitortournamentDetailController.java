package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class VisitortournamentDetailController {

    @FXML
    private ListView<String> details;

    @FXML
    private Button detailsButton;

    @FXML
    private Button backInTournDetails;

    @FXML
    void clickBackInTournDetails(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/visitorTournament.fxml");
    }

    @FXML
    void displayDetails(ActionEvent event) throws Exception {
      	try {
    			Connection con=dbConnection.getConnection();
    			Statement stmt  = con.createStatement();
    			String sql = "SELECT * " +
    		             "FROM domestic_tournament ";

    		ResultSet rs    = stmt.executeQuery(sql);
    		details.getItems().add("noOfTeams       StartDate         endDate ");
    		while (rs.next()) {
    			String line= Integer.toString(rs.getInt("noOfTeams"));
    			line+="          "+rs.getObject("startDate");
    			line+="         "+rs.getObject("endDate");
    			details.getItems().add(line);	
    			}
    		}
    		catch(Exception e) {
    			System.out.println(e);
    			String s=e.getMessage();
    			//messageInCreateSq.setText(s);
    		}

    }


}
