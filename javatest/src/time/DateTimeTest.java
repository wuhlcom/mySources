package time;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        long t2 = new Date().getTime();

        Date date = new Date();
        java.sql.Date date2 = new java.sql.Date(2620012345L);
        Time time = new Time(1550012345L);
        System.out.println(t1);
        System.out.println(t2);

        System.out.println(date);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(date));// new Date()为获取当前系统时间

        System.out.println(date2);
        System.out.println(time);
    }
}
