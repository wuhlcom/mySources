package thread.threadPool.producerConsumer.demo2;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 生产者
 */
public class MyProvider implements Runnable {
    private volatile LinkedBlockingQueue queue;
    private List<Person> people;
    private String type;
    private static boolean stopFlag = false;

    // 回调接口的对象
    Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public MyProvider(LinkedBlockingQueue queue, List<Person> people, String type) {
        this.queue = queue;
        this.people = people;
        this.type = type;
    }

    public void toStop() {
        System.out.println("stop..");
        this.stopFlag = true;
    }

    @Override
    public void run() {
        while (!stopFlag) {
            try {
                callback.method(people, queue, type);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//    @Override
//    public Object call() throws Exception {
//        return null;
//    }

    public interface Callback {
        void method(List<Person> people, LinkedBlockingQueue queue, String type);
    }

}