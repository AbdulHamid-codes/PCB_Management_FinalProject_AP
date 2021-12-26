package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class VisitorAwardController {

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
    void displayAwards(ActionEvent event) throws Exception {
      	try {
    			Connection con=dbConnection.getConnection();
    			Statement stmt  = con.createStatement();
    			String sql = "SELECT * " +
    		             "FROM pcbawards ";

    		ResultSet rs    = stmt.executeQuery(sql);
    		awards.getItems().add("name       Year      Winner ");
    		while (rs.next()) {
    			String line= rs.getString("name");
    			line+="          "+Integer.toString(rs.getInt("year"));
    			line+="          "+rs.getString("winner");
    			awards.getItems().add(line);	
    			}
    		}
    		catch(Exception e) {
    			System.out.println(e);
    			String s=e.getMessage();
    			//messageInCreateSq.setText(s);
    		}
    }


}
