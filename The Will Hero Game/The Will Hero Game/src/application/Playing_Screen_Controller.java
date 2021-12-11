package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Playing_Screen_Controller implements Initializable{
	@FXML
	private ImageView red_orc1;
	@FXML
	private ImageView penguin_hero;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TranslateTransition translate_pos = new TranslateTransition();
		TranslateTransition translate_pos2 = new TranslateTransition();
		
		translate_pos2.setNode(red_orc1);
		translate_pos2.setDuration(Duration.seconds(0.5));
		translate_pos2.setByY(-80);
		translate_pos2.setAutoReverse(true);
		translate_pos2.setCycleCount(TranslateTransition.INDEFINITE);
		translate_pos2.play();
		// for translating position
		translate_pos.setNode(penguin_hero);
		translate_pos.setDuration(Duration.seconds(0.5));
		translate_pos.setByY(-80);
		translate_pos.setAutoReverse(true);
		translate_pos.setCycleCount(TranslateTransition.INDEFINITE);
		translate_pos.play();
		
	}
	
}
