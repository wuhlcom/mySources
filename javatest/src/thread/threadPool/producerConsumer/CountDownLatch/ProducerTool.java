//package thread.threadPool.producerConsumer.demo2;
//
//import java.util.List;
//import java.util.concurrent.*;
//
////
//public class ProducerTool {
//
//    public void excute(ThreadPoolExecutor executor) {
//        int queueSize = 2000;
//        int threadSize = 100;
//        int startIndex = 0;
//        int endIndex = 0;
//        int size = queueSize / threadSize;
//
//        LinkedBlockingQueue queue = new LinkedBlockingQueue(queueSize);
//
//        List<Person> people = OrignData.genData(queueSize);
//
//        List<Person> newList = null;
//
//        MyProvider.Callback<Person> callback = new MyProvider.Callback<Person>() {
//            @Override
//            public Object method(LinkedBlockingQueue queue, List<Person> people, String type) {
//                for (Person person : people) {
//                    System.out.println(type + ":" + person.getId().toString());
//                    person.setName(type + ":" + person.getId().toString());
//                    queue.add(person);
//                }
//                return people;
//            }
//        };
//
//        for (int i = 0; i < size; i++) {
//            //计算每个线程对应的数据
//            if (i < (size - 1)) {
//                startIndex = i * threadSize;
//                endIndex = (i + 1) * threadSize;
//                newList = people.subList(startIndex, endIndex);
//            } else {
//                startIndex = i * threadSize;
//                endIndex = queueSize;
//                newList = people.subList(startIndex, endIndex);
//            }
//            if (newList != null) {
//                MyProvider<Person> myProvider = new MyProvider(queue, newList, "p1") {
//                    @Override
//                    public Object method(LinkedBlockingQueue queue, List entityList, String type) {
//                        return callback.method(queue, entityList, type);
//                    }
//                };
//                FutureTask<Object> futureTask = new FutureTask<Object>(myProvider);
//                executor.submit(myProvider);
//            }
//        }
//    }
//
//}
