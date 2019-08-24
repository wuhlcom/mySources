package thread.threadPool.producerConsumer.CountDownLatch;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 生产者
 */
public abstract class MyProvider<T> implements Callable<Object> {
    private volatile LinkedBlockingQueue<T> queue;
    private List<T> entityList;
    private String type;
    private static boolean stopFlag = false;
    // 回调接口的对象
    Callback callback;
    private CountDownLatch begin, end;

    //该抽象方法,该抽像方法将调用回调接口callback,实际的业务逻辑在callback中
    public abstract Object method(LinkedBlockingQueue<T> queue, List<T> entityList, String type);


    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public MyProvider(LinkedBlockingQueue queue, List<T> entityList, String type, CountDownLatch begin, CountDownLatch end) {
        this.queue = queue;
        this.entityList = entityList;
        this.type = type;
        this.begin = begin;
        this.end = end;
    }

    public void toStop() {
        System.out.println("stop..");
        this.stopFlag = true;
    }

    @Override
    public Object call() throws Exception {
        System.out.println("producer:" + Thread.currentThread().getName() + " running");
        Object res = 1;
        try {
            // 执行程序
            begin.await();
            method(queue, entityList, type);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 计数器减一
            end.countDown();
        }
        return res;
    }


    public interface Callback<T> {
        Object method(LinkedBlockingQueue<T> queue, List<T> entityList, String type);
    }

}