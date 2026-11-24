public class Point {
    private int x;
    private int y;

    Point(){
        this.x = 10;
        this.y = 20;
    }

    Point(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    @Override
    public String toString() {
        return " x is : " + x + " y is : "  + y;
    }
}
