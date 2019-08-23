package time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestMain {

    public static void main(String[] args) {
        // timeVoid();
        //
        // Timer timer = new Timer();
        // timer.schedule(new TimerTaskTest(), 500, 2000);
        // // timer.cancel();

        System.out.println(dateToStrTime(new Date()));

    }

    public static String dateToStrTime(Date date) {
        if (date == null) {
            return null;
        } else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String strDate = formatter.format(date);
            return strDate;
        }
    }

    public static void timeVoid(){
        final Timer timer = new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务开始");
                timer.cancel();
            }
        };
        timer.schedule(tt, 2000);
    }

}
