package application.CLASSES;

import java.util.Objects;

public class Game_Objects implements Collision{

    private Coordinates coordinate;
    private int Obj_id;
    private String color;
    private static int incrementer=0;

    public Game_Objects(String col){
        this.Obj_id=incrementer++;
        this.color=col;
    }
    @Override
    public void collision(Game_Objects g) {
        // write code here
    }
    public Coordinates get_coordinates(){
        return coordinate;
    }

    public void setCoordinate(Coordinates coor) {
        this.coordinate = coor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game_Objects that = (Game_Objects) o;
        return Obj_id == that.Obj_id && Objects.equals(coordinate, that.coordinate) && Objects.equals(color, that.color);
    }

}