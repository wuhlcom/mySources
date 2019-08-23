package time;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTask {

    public void test() {

        // true 说明这个timer以daemon方式运行（优先级低，
        // 程序结束timer也自动结束），注意，javax.swing
        // 包中也有一个Timer类，如果import中用到swing包，
        // 要注意名字的冲突。
       Timer timer = new Timer(true);

        TimerTask task = new TimerTask() {
            public void run() {
                //每次需要执行的代码放到这里面。
                System.out.println("任务执行中");
            }
        };

        //以下是几种调度task的方法：
        // time为Date类型：在指定时间执行一次。
        Date date = new Date();
        System.out.println(date);
        timer.schedule(task, date);

        // firstTime为Date类型,period为long,从firstTime时刻开始，每隔period毫秒执行一次。
        long period = 2000;
        Date firstTime = new Date();
        timer.schedule(task, firstTime, period);

        // delay 为long类型：从现在起过delay毫秒执行一次
        long delay = 2000;
        timer.schedule(task, delay);

        // delay为long,period为long：从现在起过delay毫秒以后，每隔period,毫秒执行一次。
        timer.schedule(task, delay, period);
    }

}
