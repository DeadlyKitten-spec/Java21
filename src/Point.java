public class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(Math.sqrt(this.x*this.x + this.y*this.y) > Math.sqrt(o.x*o.x + o.y*o.y)){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
