package application;

import java.net.URL;
import application.CLASSES.*;
import java.util.ResourceBundle;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Playing_Screen_Controller implements Initializable{
	@FXML
	private ImageView red_orc1;
	@FXML
	private ImageView penguin_hero;
	@FXML
	private AnchorPane anchorPane;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Orc or = new Orc();
		TranslateTransition translate_pos = new TranslateTransition();
		TranslateTransition translate_pos_x = new TranslateTransition();
		TranslateTransition translate_pos2 = new TranslateTransition();
		TranslateTransition anchorpane = new TranslateTransition();
		
		
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
		
		// handling OnClick event
		anchorPane.addEventFilter(MouseEvent.MOUSE_CLICKED, key_event->{
			translate_pos.pause();
			
			
			anchorpane.setNode(anchorPane);
			anchorpane.setDuration(Duration.seconds(0.15));
			anchorpane.setByX(-60);
			anchorpane.play();
			
			translate_pos_x.setNode(penguin_hero);
			translate_pos_x.setDuration(Duration.millis(0.1));
			translate_pos_x.setByX(60);
			translate_pos_x.play();
			
			translate_pos.play();
			
//			if(translate_pos_x.getStatus().equals("STOPPED")) {
//				
//			}
			
			
//			if(key_event.getCode() == KeyCode.SPACE) {
//				System.out.println("hello\n");
//			}
		});
//		anchorPane.addEventHandler(KeyEvent.KEY_PRESSED, event);
		while(true) {
			System.out.println("hora\n");
			break;
		}
		
	}
	
}
