package thread.threadPool.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: Main
 * @Description: 测试类
 * @author: yunche
 * @date: 2018/08/26
 */
public class MainClass {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);
        Producer p = new Producer(queue);
        Consumer c1 = new Consumer(queue);
        Consumer c2 = new Consumer(queue);

        Thread producer = new Thread(p);
        producer.setName("生产者线程");

        Thread consumer1 = new Thread(c1);
        consumer1.setName("消费者1");
        Thread consumer2 = new Thread(c2);
        consumer2.setName("消费者2");

        producer.start();

        // consumer1.start();
        // consumer2.start();

        //1、创建线程池对象，控制要创建几个线程对象
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //可以执行Runnable对象或者Callable对象代表的线程
        pool.submit(consumer1);
        pool.submit(consumer2);

    }
}