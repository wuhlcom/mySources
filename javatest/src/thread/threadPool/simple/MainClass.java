package thread.threadPool.simple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

        public static void main(String[] args) {
            //1、创建线程池对象，控制要创建几个线程对象
            ExecutorService pool = Executors.newFixedThreadPool(2);
            //可以执行Runnable对象或者Callable对象代表的线程
            pool.submit(new MyRunnable());
            pool.submit(new MyRunnable());

            //结束线程池
            // pool.shutdown();
        }
    }

