package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("FXMLs/Main_Menu.fxml"));
//			Parent root = FXMLLoader.load(getClass().getResource("FXMLs/Start_Screen.fxml"));
//			Parent root = FXMLLoader.load(getClass().getResource("FXMLs/Gameover.fxml"));
//			Parent root = FXMLLoader.load(getClass().getResource("FXMLs/You_won.fxml"));
//			Parent root = FXMLLoader.load(getClass().getResource("FXMLs/Playing_Screen.fxml"));
			// Creating Icon Image object for adding it to the title bar.
			Image game_icon = new Image(getClass().getResourceAsStream("IMAGES/Game_Icon.png"));
			primaryStage.getIcons().add(game_icon);
			// Creating paint object to paint the Scene Background.
			Paint paint = Color.ALICEBLUE;
			Scene scene = new Scene(root,paint);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//Setting the Title Name of our Game.
			primaryStage.setTitle("The Will Hero Game");
			// Adding the scene to the Stage
			primaryStage.setScene(scene);

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}