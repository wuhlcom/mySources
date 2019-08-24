package thread.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
//Semaphore与CountDownLatch相似，不同的地方在于Semaphore的值被获取到后是可以释放的，
//        并不像CountDownLatch那样一直减到底。它也被更多地用来限制流量，类似阀门的 功能。
//        如果限定某些资源最多有N个线程可以访问，那么超过N个主不允许再有线程来访问，
//        同时当现有线程结束后，就会释放，然后允许新的线程进来。有点类似于锁的lock与 unlock过程。相对来说他也有两个主要的方法：
//        用于获取权限的acquire(),其底层实现与CountDownLatch.countdown()类似;
//        用于释放权限的release()，其底层实现与acquire()是一个互逆的过程

public class SemaphoreExample1 {

    private final static int threadCount = 20;

    public static void main(String[] args) throws Exception {

        ExecutorService exec = Executors.newCachedThreadPool();
        // 每次最多三个线程获取许可
        final Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < threadCount; i++) {
            final int threadNum = i;
            exec.execute(() -> {
                try {
                    semaphore.acquire(); // 获取一个许可
                    test(threadNum);
                    System.out.println("dddddddddddddddddd");
                    semaphore.release(); // 释放一个许可
                } catch (Exception e) {
                    e.printStackTrace();
//                    log.error("exception", e);
                }
            });
        }
        exec.shutdown();
    }

    private static void test(int threadNum) throws Exception {
//        log.info("{}", threadNum);
        System.out.println(threadNum);
        Thread.sleep(1000);
    }
}