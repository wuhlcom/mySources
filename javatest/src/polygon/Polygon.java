package polygon;


import com.snatik.polygon.Point;

import java.util.List;

public class Polygon {

        /**
         * 构建单个多边形围栏
         */
        public com.snatik.polygon.Polygon buildFence(List<Point> points) {
            return getPolygon(points);
        }

        private com.snatik.polygon.Polygon getPolygon(List<Point> points) {
            com.snatik.polygon.Polygon polygon;
            com.snatik.polygon.Polygon.Builder polygonBuilder = new com.snatik.polygon.Polygon.Builder();
            for (Point point : points) {
                polygonBuilder.addVertex(point);
            }
            polygon = polygonBuilder.build();
            return polygon;
        }


        /**
         * 判断和多边形的关系
         */
        public Boolean isInFence(List<Point> points, Point point) {
            com.snatik.polygon.Polygon polygon = this.buildFence(points);
            return polygon.contains(point);
        }

}
