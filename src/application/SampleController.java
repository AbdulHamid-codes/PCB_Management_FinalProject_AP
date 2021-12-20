package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import db.dbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
    @FXML
    private TextField message;
    @FXML
    private TextField response;
    @FXML
    private Button button;

    @FXML
    void buttonClicked(ActionEvent event) throws Exception {
    	
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
		        + " values (?, ?, ?, ?)";

		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setInt    (1, 600);
		      preparedStmt.setInt    (2, 600);
		     // preparedStmt.setDate   (3, (java.sql.Date) sa.getDateCreated());
		      preparedStmt.setDate (3, new java.sql.Date(2021));
		      preparedStmt.setDouble  (4, 600.0);
	
		      // execute the preparedstatement
		      preparedStmt.execute();
			
		      response.setText("Successfully inserted data into the datbase");
		     // System.out.println("Successfully inserted data into the datbase");
			
			//ResultSet rs=stmt.executeQuery("select * from student");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "+rs.getString(3));
//			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		
		}
    }
}
