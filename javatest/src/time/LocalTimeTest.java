package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeTest {
    public static void main(String[] args) {
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        // System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        //
        // Date date = new Date();
        // System.out.println(date.getTime());
        // System.out.println(System.currentTimeMillis());
        //
        // LocalDateTime localDateTime =LocalDateTime.now();
        // System.out.println(localDateTime);
        //
        // LocalDate localDate=LocalDate.now();
        // System.out.println(localDate);


        // LocalDateTime格式化
        // LocalDateTime time=LocalDateTime.now();
        //
        // System.out.println(time);
        //
        // DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //
        // String strDate2 = dtf2.format(time);
        //
        // System.out.println(strDate2);


        // LocalDate转String ，String转LocalDate

        // LocalDate data=LocalDate.now();
        //
        // System.out.print(data);
        //
        // DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //
        // String strDate3 = dtf3.format(data);
        //
        // System.out.println(strDate3);
        //
        // strDate3=strDate3+" 04:00:00";
        //
        // LocalDateTime time1=LocalDateTime.parse(strDate3,dtf2);
        //
        // System.out.print(time1);
        //
        // System.out.print(time.isAfter(time1));



        // Date date = new Date();
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // System.out.println(sdf.format(date));
        // sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // System.out.println(sdf.format(date));
        // sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // System.out.println(sdf.format(date));

        String str = "2019-05-09 15:44:37";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        System.out.println(dateTime);

        // DateTimeFormatter dtf31 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // String strDat2e3 = dtf31.format(dateTime);
        // System.out.println(strDat2e3);


        //
        // System.out.println(LocalDateTime.now().toString());
        // LocalDateTime dateTime2 = LocalDateTime.parse(LocalDateTime.now().toString(), formatter);
        // System.out.println(dateTime2);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime cc = LocalDateTime.now();
        String localTime = df.format(cc);

        LocalDateTime ldt = LocalDateTime.parse("2017-09-28 17:07:05",df);
        System.out.println(ldt);

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dt= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dflocalTimeStr = dt.format(localDateTime);
        System.out.println(dflocalTimeStr);

    }
}
