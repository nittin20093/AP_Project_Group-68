package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import jdk.jfr.TransitionTo;

public class Treasure extends Game_Objects {
    private String category;
    private TranslateTransition tt;
    public Treasure(String s){
        this.category=s;
    }
    public String get_category(){
        return this.category;
    }

    public void collision( ImageView treasure , ImageView hero_playscreen , Hero hero){
        if(hero_playscreen.getBoundsInParent().intersects(treasure.getBoundsInParent())) {
//            System.out.println("colll\n");
//            if(hero_playscreen.getBoundsInParent().getCenterY() >)
            tt.setNode(treasure);
            tt.setDuration(Duration.millis(1000));
            tt.setByY(-25);
            tt.setAutoReverse(true);
            tt.setCycleCount(TranslateTransition.INDEFINITE);
            tt.play();
//            hero.set_weapon(this);
        }
    }


}
