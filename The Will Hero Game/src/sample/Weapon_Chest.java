package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class Weapon_Chest extends Treasure {
    private Weapon w;
    private String name;
    private boolean if_occupied;
    private TranslateTransition tt;

    public Weapon_Chest(String s,Weapon e){
        super(s);
        this.if_occupied=false;
        this.w=e;
    }
    public Weapon get_weapon(){
        return this.w;
    }
    public String get_name(){
        return this.name;
    }

    public void collision(ImageView treasure , ImageView hero_playscreen , Hero hero){
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

    public boolean if_occupied_true(){
        return this.if_occupied;
    }
    public void set_if_occupied(boolean y){
        this.if_occupied=y;
    }
}
