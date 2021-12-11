package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Main_Menu_Controller implements Initializable{
	
	@FXML
	private ImageView penguin_hero;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TranslateTransition translate_pos = new TranslateTransition();
		
		// for translating position
		translate_pos.setNode(penguin_hero);
		translate_pos.setDuration(Duration.seconds(0.5));
		translate_pos.setByY(-80);
		translate_pos.setAutoReverse(true);
		translate_pos.setCycleCount(TranslateTransition.INDEFINITE);
		translate_pos.play();
		
	}
	
}