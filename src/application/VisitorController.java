package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VisitorController {
    @FXML
    private Button tournaments;

    @FXML
    private Button series;

    @FXML
    private Button squad;

    @FXML
    private Button players;

    @FXML
    private Button awards;

    @FXML
    private Button backInVisitor;
    
    @FXML
    void clickBackInVisitor(ActionEvent event) throws Exception {
    	Main m=new Main();
		m.changeScene("/view/homeScreen.fxml");
    }
    
    @FXML
    void awardsClicked(ActionEvent event) throws Exception {
		Main m=new Main();
		m.changeScene("/view/visitorAwards.fxml");
    }

    @FXML
    void playersClicked(ActionEvent event) throws Exception{
		Main m=new Main();
		m.changeScene("/view/visitorPlayer.fxml");
    }

    @FXML
    void seriesClicked(ActionEvent event) throws Exception {
		Main m=new Main();
		m.changeScene("/view/visitorSeries.fxml");
    }

    @FXML
    void squadClicked(ActionEvent event) throws Exception{
		Main m=new Main();
		m.changeScene("/view/visitorSquad.fxml");
    }

    @FXML
    void tournamentClicked(ActionEvent event)throws Exception {
		Main m=new Main();
		m.changeScene("/view/visitorTournament.fxml");
    }
}
