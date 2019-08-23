package polygon.myPolygon;

public class Point {
    private  double x;
    private  double y;
    private  double z;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
