package polygon.myPolygon;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lxg
 */
public class MapTools {
    /**
     * 判断当前位置是否在围栏内
     *
     * @param mobilelocationEntity
     * @param enclosureList
     * @return
     */
    public static boolean isInPolygon(Point mobilelocationEntity, List<Point> enclosureList) {
        double p_x = mobilelocationEntity.getX();
        double p_y = mobilelocationEntity.getY();
        Point2D.Double point = new Point2D.Double(p_x, p_y);

        List<Point2D.Double> pointList = new ArrayList<Point2D.Double>();

        for (Point enclosure : enclosureList) {
            double polygonPoint_x = enclosure.getX();
            double polygonPoint_y = enclosure.getY();
            Point2D.Double polygonPoint = new Point2D.Double(polygonPoint_x, polygonPoint_y);
            pointList.add(polygonPoint);
        }
        MapTools test = new MapTools();
        return test.checkWithJdkGeneralPath(point, pointList);
    }

    /**
     * 返回一个点是否在一个多边形区域内
     *
     * @param point
     * @param polygon
     * @return
     */
    private boolean checkWithJdkGeneralPath(Point2D.Double point, List<Point2D.Double> polygon) {
        java.awt.geom.GeneralPath p = new java.awt.geom.GeneralPath();

        Point2D.Double first = polygon.get(0);
        p.moveTo(first.x, first.y);
        polygon.remove(0);
        for (Point2D.Double d : polygon) {
            p.lineTo(d.x, d.y);
        }

        p.lineTo(first.x, first.y);

        p.closePath();

        return p.contains(point);

    }

    public boolean checkWithJdkPolygon(Point2D.Double point, List<Point2D.Double> polygon) {
        Polygon p = new Polygon();
        // java.awt.geom.GeneralPath
        final int TIMES = 1000;
        for (Point2D.Double d : polygon) {
            int x = (int) d.x * TIMES;
            int y = (int) d.y * TIMES;
            p.addPoint(x, y);
        }
        int x = (int) point.x * TIMES;
        int y = (int) point.y * TIMES;
        return p.contains(x, y);
    }
}