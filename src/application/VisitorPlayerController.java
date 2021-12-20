package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class VisitorPlayerController {
    @FXML
    private TextField shirtNo;

    @FXML
    private Button displayButton;

    @FXML
    private ListView<String> stats;

    @FXML
    private Button backInPlayer;

    @FXML
    void clickBackInPlayer(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/visitor.fxml");
    }

    @FXML
    void displayStats(ActionEvent event){
    	
		try {

			Connection con=dbConnection.getConnection();
			Statement stmt  = con.createStatement();
			String sql = "SELECT * " +
		             "FROM player ";

		ResultSet rs    = stmt.executeQuery(sql);
		stats.getItems().add("Name     ShirtNo     matchPlayed   Total Runs ");
		while (rs.next()) {
			String line= rs.getString("name");
			line+="		       "+Integer.toString(rs.getInt("shirtNo"));
			line+="            "+Integer.toString(rs.getInt("matchPlayed"));
			line+="            "+Integer.toString(rs.getInt("totalRuns"));
			stats.getItems().add(line);
		
		}
		}
		catch(Exception e) {
			System.out.println(e);
			String s=e.getMessage();
			//messageInCreateSq.setText(s);
		}
    }

}
