package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private static Stage stg;
	
	
	public static void main(String[] args) 
	{
	
		launch(args);
	}
	
	public void start(Stage primaryStage) 
	{
		try 
		{
			stg=primaryStage;
			   
			Parent root=FXMLLoader.load(getClass().getResource("/view/homeScreen.fxml"));
			primaryStage.setTitle("Pakistan Cricket Board");
			primaryStage.setScene(new Scene(root, 600, 400));
			primaryStage.show();
			
		} 	
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void changeScene(String fxml) throws Exception{
		Parent pane=FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	}
}
