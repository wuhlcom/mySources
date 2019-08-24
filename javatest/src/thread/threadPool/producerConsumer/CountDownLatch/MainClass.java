package thread.threadPool.producerConsumer.CountDownLatch;

import java.util.List;
import java.util.concurrent.*;

public class MainClass {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int queueSize = 20;
        int threadSize = 10;
        int startIndex = 0;
        int endIndex = 0;
        int size = queueSize / threadSize;
        System.out.println("生产者线程数:" + size);


        //初始化线程池对象
        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 8, 2,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(1024), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //初始化一个队列
        LinkedBlockingQueue<Person> queue = new LinkedBlockingQueue(queueSize);
        List<Person> people = OrignData.genData(queueSize);
        System.out.println(people.size());
        List<Person> newList = null;

        //实现回调函数
//        MyProvider.Callback<Person> callback = new MyProvider.Callback<Person>() {
//            @Override
//            public Object method(LinkedBlockingQueue<Person> queue, List<Person> people, String type) {
//                for (Person person : people) {
//                    person.setName(type + ":" + person.getId().toString());
//                    queue.add(person);
//                }
//                return people;
//            }
//        };


        //主线程操作完成后再进行子线程操作
        CountDownLatch begin = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(size);

        //将
        for (int i = 0; i < size; i++) {
            //计算每个线程对应的数据
            if (i < (size - 1)) {
                startIndex = i * threadSize;
                endIndex = (i + 1) * threadSize;
                newList = people.subList(startIndex, endIndex);
            } else {
                startIndex = i * threadSize;
                endIndex = queueSize;
                newList = people.subList(startIndex, endIndex);
            }
            if (newList != null && newList.size() > 0) {
                System.out.println(newList);
//                MyProvider<Person> myProvider = new MyProvider(queue, newList, "p1", begin, end) {
//                    @Override
//                    public Object method(LinkedBlockingQueue queue, List entityList, String type) {
//                        return callback.method(queue, entityList, type);
//                    }
//                };
                MyProvider<Person> myProvider =new MyProvider<Person>(queue,newList,"p1",begin,end) ;
                FutureTask<Object> futureTask = new FutureTask<Object>(myProvider);
                executor.submit(futureTask);
            }
        }

        MyConsumer<Person> myConsumer = new MyConsumer(queue,queueSize);
        FutureTask<Object> futureTask = new FutureTask<Object>(myConsumer);
        MyConsumer myConsumer2 = new MyConsumer(queue,queueSize);
        Thread.sleep(5000);
        executor.submit(futureTask);

        //计数器减一
        begin.countDown();
        end.await();
        executor.shutdown();
//        myProvider1.toStop();
//        myProvider2.toStop();
//        Object o = futureTask.get();
//        System.out.println(o);
//        futureTask.cancel(false);
        while (true) {
            int activeCount = executor.getActiveCount();
            System.out.println("executor.getTaskCount():" + executor.getTaskCount());
            System.out.println("executor.getCompletedTaskCount():" + executor.getCompletedTaskCount());
            System.out.println("alive thread count:" + activeCount);
            if (activeCount == 0) {
                System.out.println("executor shutdown");
                executor.shutdown();
                break;
            }
        }

    }
}

