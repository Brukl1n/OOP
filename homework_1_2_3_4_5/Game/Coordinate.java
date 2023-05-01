package OOP.homework_1_2_3_4_5.Game;

public class Coordinate {
    public int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public float distance(Coordinate coordinate){
        float dx = coordinate.x - this.x;
        float dy = coordinate.y - this.y;
        return (float) Math.sqrt(dx*dx+dy*dy);
    }
}