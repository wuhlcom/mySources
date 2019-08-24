package thread.threadPool.producerConsumer.CountDownLatch;

//import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 线程池多线程并发处理批量数据
 *
 * @param <T>
 */
public class ThreadPoolTool<T> {

    private static final Logger LOG = LoggerFactory.getLogger(ThreadPoolTool.class);
    private static final int Num =Runtime.getRuntime().availableProcessors();
   //线程池大小 CPU数量/1-x
    private static final int THREAD_SIZE=(int)(Runtime.getRuntime().availableProcessors()/0.5);
    public static final String FAIL_TAG = "-fail";


    /**
     * 线程数
     */
    private int corePoolsize = 1;

    /**
     * 单线程处理数据量
     */
    private int singleCount;
    /**
     * 处理的总数据量
     */
    private int listSize;
    /**
     * 最大线程数
     */
    private int runSize = 1;
    /**
     * 操作的数据集
     */
    private List<T> list;
    /**
     * 计数器
     */
    private CountDownLatch begin, end;

//    private static final ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("thread-pool-%d").build();

    /**
     * 线程池
     */
    private ExecutorService executorService;
    /**
     * 回调
     */
    private CallBack callBack;

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public ThreadPoolTool(int singleCount, List<T> list) {
        this.singleCount = singleCount;
        this.list = list;
        if (list != null) {
            this.listSize = list.size();
            this.runSize = (this.listSize / this.singleCount) + 1;
        }
        if (runSize > THREAD_SIZE) {
            this.corePoolsize = THREAD_SIZE;
        } else {
            this.corePoolsize = runSize;
        }
    }

    public List<Future<Object>> excute() throws InterruptedException {
        executorService = new ThreadPoolExecutor(corePoolsize, this.runSize,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<Runnable>(1024), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        List<Future<Object>> resultList = new ArrayList<Future<Object>>();
        begin = new CountDownLatch(1);
        end = new CountDownLatch(runSize);
        //创建线程
        int startIndex = 0;
        int endIndex = 0;
        List<T> newList = null;

        for (int i = 0; i < runSize; i++) {
            //计算每个线程对应的数据
            if (i < (runSize - 1)) {
                startIndex = i * singleCount;
                endIndex = (i + 1) * singleCount;
                newList = list.subList(startIndex, endIndex);
            } else {
                startIndex = i * singleCount;
                endIndex = listSize;
                newList = list.subList(startIndex, endIndex);
            }
            //创建线程类处理数据
            if (null != newList && !newList.isEmpty()) {
                MyThread<T> myThread = new MyThread(newList, begin, end) {
                    @Override
                    public Object method(List list) {
                        return callBack.method(list);
                    }
                };
                //执行线程
                resultList.add(executorService.submit(myThread));
            }
        }
        //计数器减一
        begin.countDown();
        end.await();
        //关闭线程池
        executorService.shutdown();
        return resultList;
    }

    /**
     * 抽象线程类
     *
     * @param <T>
     */
    public abstract class MyThread<T> implements Callable<Object> {

        private List<T> list;
        private CountDownLatch begin, end;

        public MyThread(List<T> list, CountDownLatch begin, CountDownLatch end) {
            this.list = list;
            this.begin = begin;
            this.end = end;
        }

        @Override
        public Object call() throws Exception {
            Object res = "";
            try {
                // 执行程序
                res = method(list);
                begin.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 计数器减一
                end.countDown();
            }
            return res;
        }

        public abstract Object method(List<T> list);
    }

    /**
     * 回调接口定义
     *
     * @param <T>
     */
    public interface CallBack<T> {
        public Object method(List<T> list);
    }

    public static String getFailTag(String messageId) {
        return messageId + FAIL_TAG;
    }
}
