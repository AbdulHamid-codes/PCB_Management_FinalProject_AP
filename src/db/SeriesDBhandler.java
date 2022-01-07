package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Series;

public class SeriesDBhandler {

	public boolean save(Series s) {
		try {

			Connection con=dbConnection.getConnection();
			// the mysql insert statement
//		      String query = " insert into savingsaccount (accountNumber, balance, dateCreated, interestRate)"
//		        + " values (?, ?, ?, ?)";
			String query1 = " insert into series (fromat,type, host, startDate, endDate)" + "Values(?, ?,?,?,?)";
			
			
		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = con.prepareStatement(query1);
		      preparedStmt.setString   (1, s.getFormat());
		      preparedStmt.setString    (2, s.getType());
		      preparedStmt.setString    (3, s.getHost());
		      preparedStmt.setObject    (4, s.getStartDate());
		      preparedStmt.setObject   (5, s.getEndDate());
		      
		      // execute the preparedstateme
		      preparedStmt.execute();
		      
		      return true;
			//con.close();
			
		}
		catch(Exception e) {
			//System.out.println(e);
			String s1=e.getMessage();
			System.out.println(s1);
			//messageInCreateSq.setText(s);
			//return s;
			return false;
       }
	}
}
