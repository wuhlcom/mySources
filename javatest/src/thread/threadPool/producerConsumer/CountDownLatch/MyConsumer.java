package thread.threadPool.producerConsumer.CountDownLatch;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

public class MyConsumer<T> implements Callable<Object> {
    private volatile LinkedBlockingQueue<T> queue;
    private int listSize;
    private static boolean stopFlag = false;

    public MyConsumer(LinkedBlockingQueue<T> queue, int listSize) {
        this.queue = queue;
        this.listSize = listSize;
    }

    public void toStop() {
        System.out.println("stop..");
        this.stopFlag = true;
    }

    @Override
    public Object call() throws Exception {
        List<T> list = null;
        System.out.println("consumer:" + Thread.currentThread().getName() + ":"+listSize+" running");
        int count = 0;
        while (true) {
            try {
//                Object take = queue.poll(500L, TimeUnit.MILLISECONDS);
                T take = queue.poll();
                if (take != null) {
                    count = 0;
                    System.out.println("consumer:" + take);
                    list.add(take);
                    Thread.sleep(1000);
                } else {
                    count++;
                    Thread.sleep(500);
                    System.out.println("consumer waiting");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
            listSize--;
        }
        return list;
    }

    private void consume(Integer n) {
        System.out.println("Thread:" + Thread.currentThread().getName() + " consume: " + n);
    }

}
