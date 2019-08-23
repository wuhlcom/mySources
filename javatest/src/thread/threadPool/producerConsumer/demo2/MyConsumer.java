package thread.threadPool.producerConsumer.demo2;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyConsumer implements Runnable {
    private volatile LinkedBlockingQueue queue;
    private static boolean stopFlag = false;

    public MyConsumer(LinkedBlockingQueue queue) {
        this.queue = queue;
    }

    public void toStop() {
        System.out.println("stop..");
        this.stopFlag = true;
    }

    @Override
    public void run() {
        System.out.println("consumer:" + Thread.currentThread().getName() + " running");
        int count = 0;
        while (!stopFlag) {
            try {
                Object take = queue.poll(500L, TimeUnit.MILLISECONDS);
                if (take != null) {
                    count = 0;
                    System.out.println("consumer:" + take);
                    Thread.sleep(1000);
                } else {
                    count++;
                    Thread.sleep(500);
                    System.out.println("consumer waiting");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
