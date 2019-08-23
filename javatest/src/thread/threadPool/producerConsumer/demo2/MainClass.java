package thread.threadPool.producerConsumer.demo2;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        int queueSize = 2000;
        int threadSize = 100;
        int startIndex = 0;
        int endIndex = 0;
        int size = queueSize / threadSize;
        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 8, 2,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(1024), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        LinkedBlockingQueue queue = new LinkedBlockingQueue(queueSize);
        List<Person> people = OrignData.genData(queueSize);
        List<Person> newList = null;

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
            if (newList!=null){

            }
        }

        MyProvider.Callback callback = new MyProvider.Callback() {
            @Override
            public void method(List<Person> people, LinkedBlockingQueue queue, String type) {
                for (Person person : people) {
                    System.out.println(type + ":" + person.getId().toString());
                    person.setName(type + ":" + person.getId().toString());
                    queue.add(person);
                }
            }
        };

        MyConsumer myConsumer = new MyConsumer(queue);
        MyConsumer myConsumer2 = new MyConsumer(queue);

        MyProvider myProvider1 = new MyProvider(queue, people1, "p1");
        myProvider1.setCallback(callback);
        MyProvider myProvider2 = new MyProvider(queue, people2, "p2");
        myProvider2.setCallback(callback);
        MyProvider myProvider3 = new MyProvider(queue, people3, "p3");
        myProvider3.setCallback(callback);

        executor.execute(myProvider1);
        executor.execute(myProvider2);
        executor.execute(myProvider3);
        executor.execute(myConsumer);
        executor.execute(myConsumer2);

        Thread.sleep(3000);
//        myProvider1.toStop();
//        myProvider2.toStop();
        while (true) {
            Thread.sleep(1000);
            int activeCount = executor.getActiveCount();
            System.out.println("alive thread count:" + activeCount);
            if (activeCount == 0) {
                System.out.println("executor shutdown");
                executor.shutdown();
                break;
            }
        }
    }
}

