package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Gameover_Controller implements Initializable{
	@FXML
	private ImageView game_over_img;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ScaleTransition scale = new ScaleTransition();
		// for scaling object
		scale.setNode(game_over_img);
		scale.setByX(0.24);
		scale.setByY(0.24);
		scale.setAutoReverse(true);
		scale.setCycleCount(ScaleTransition.INDEFINITE);
		scale.setDuration(Duration.seconds(0.8));
		scale.play();
		
	}
	
}