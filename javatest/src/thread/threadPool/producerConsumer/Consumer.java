package thread.threadPool.producerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue q) {
        this.queue = q;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //模拟耗时
                Thread.sleep(2000);
                consume(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void consume(Integer n) {
        System.out.println("Thread:" + Thread.currentThread().getName() + " consume: " + n);
    }
}
