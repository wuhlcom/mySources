package polygon;

import com.snatik.polygon.Point;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        // Point p1 = new Point(1.1,1.0);
        // Point p2 = new Point(1,1);
        // Point p3 = new Point(1,2);
        // Point p4 = new Point(2,1);
        // Point p5 = new Point(2,2);
        // List<Point> lp = new ArrayList<Point>();
        // lp.add(p2);
        // lp.add(p3);
        // lp.add(p4);
        // lp.add(p5);
        // boolean f = MapTools.isInPolygon(p1,lp);
        // System.out.println(f);
        List<Point> points=new ArrayList<Point>();
        points.add(new Point(1,0));
        points.add(new Point(1,1));
        points.add(new Point(1.5,2));
        points.add(new Point(2,1));
        points.add(new Point(2,0));

        Point testPoint=new Point(-1.6,-0.5);

        Polygon polygon=new Polygon();
        Boolean rs=polygon.isInFence(points,testPoint);
        if(rs){
            System.out.println("is in");
        }else{
            System.out.println("is out");
        }


    }
}
