package thread.threadPool.callableFuture;

import java.util.concurrent.*;
//Future就是对于具体的Runnable或者Callable任务的执行结果进行取消、查询是否完成、获取结果。必要时可以通过get方法获取执行结果，该方法会阻塞直到任务返回结果。
//        　　Future类位于java.util.concurrent包下，它是一个接口
// public interface Future<V> {
//    boolean cancel(boolean mayInterruptIfRunning);
//    boolean isCancelled();
//    boolean isDone();
//    V get() throws InterruptedException, ExecutionException;
//    V get(long timeout, TimeUnit unit)
//            throws InterruptedException, ExecutionException, TimeoutException;
//}
// 　　在Future接口中声明了5个方法，下面依次解释每个方法的作用：
//
//         cancel方法用来取消任务，如果取消任务成功则返回true，如果取消任务失败则返回false。参数mayInterruptIfRunning表示是否允许取消正在执行却没有执行完毕的任务，如果设置true，则表示可以取消正在执行过程中的任务。如果任务已经完成，则无论mayInterruptIfRunning为true还是false，此方法肯定返回false，即如果取消已经完成的任务会返回false；如果任务正在执行，若mayInterruptIfRunning设置为true，则返回true，若mayInterruptIfRunning设置为false，则返回false；如果任务还没有执行，则无论mayInterruptIfRunning为true还是false，肯定返回true。
//         isCancelled方法表示任务是否被取消成功，如果在任务正常完成前被取消成功，则返回 true。
//         isDone方法表示任务是否已经完成，若任务完成，则返回true；
//         get()方法用来获取执行结果，这个方法会产生阻塞，会一直等到任务执行完毕才返回；
//         get(long timeout, TimeUnit unit)用来获取执行结果，如果在指定时间内，还没获取到结果，就直接返回null。
//         　　也就是说Future提供了三种功能：
//
//         　　1）判断任务是否完成；
//
//         　　2）能够中断任务；
//
//         　　3）能够获取任务执行结果。
//
//         　　因为Future只是一个接口，所以是无法直接用来创建对象使用的，因此就有了下面的FutureTask。
//如果为了可取消性而使用 Future 但又不提供可用的结果，则可以声明 Future<?> 形式类型、并返回 null 作为底层任务的结果
public class Test {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executor.submit(task);
        executor.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try {
            System.out.println("task运行结果"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }
}
