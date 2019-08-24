package thread.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//CyclicBarrier也是一个同步辅助类，它允许一组线程相互等待，直到到达某个公共屏障点（common barrier point）。
//        通过它可以完成多个线程之间相互等待，只有当每个线程都准备就绪后，才能各自继续往下执行后面的操作。
//        类似于CountDownLatch，它也是通过计数器来实现的。当某个线程调用await方法时，
//        该线程进入等待状态，且计数器加1，当计数器的值达到设置的初始值时，
//        所有因调用await进入等待状态的线程被唤醒，继续执行后续操作。因为CycliBarrier在释放等待线程后可以重用，所以称为循环barrier。CycliBarrier支持一个可选的Runnable，
//        在计数器的值到达设定值后（但在释放所有线程之前），该Runnable运行一次，注，Runnable在每个屏障点只运行一个。
//        使用场景类似于CountDownLatch与CountDownLatch的区别
//        CountDownLatch主要是实现了1个或N个线程需要等待其他线程完成某项操作之后才能继续往下执行操作，描述的是1个线程或N个线程等待其他线程的关系。
//        CyclicBarrier主要是实现了多个线程之间相互等待，直到所有的线程都满足了条件之后各自才能继续执行后续的操作，描述的多个线程内部相互等待的关系。
//        CountDownLatch是一次性的，而CyclicBarrier则可以被重置而重复使用。

public class CyclicBarrierExample3 {

    private static CyclicBarrier barrier = new CyclicBarrier(5, () -> {
//        log.info("callback is running");
        System.out.println("callback is running");
    });

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int threadNum = i;
            Thread.sleep(1000);
            executor.execute(() -> {
                try {
                    race(threadNum);
                } catch (Exception e) {
//                    log.error("exception", e);
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }

    private static void race(int threadNum) throws Exception {
        Thread.sleep(1000);
//        log.info("{} is ready", threadNum);
        System.out.println("is ready:"+threadNum);

        barrier.await();
//        log.info("{} continue", threadNum);
        System.out.println("continue:"+threadNum);
    }
}