package synchronizedDemo;

import java.util.concurrent.TimeUnit;

// 在并发环境下，解决共享资源冲突问题时，可以考虑使用锁机制。
//
// 1.对象的锁
// 所有对象都自动含有单一的锁。
// JVM负责跟踪对象被加锁的次数。如果一个对象被解锁，其计数变为0。在任务（线程）第一次给对象加锁的时候，计数变为1。每当这个相同的任务（线程）在此对象上获得锁时，计数会递增。
// 只有首先获得锁的任务（线程）才能继续获取该对象上的多个锁。
// 每当任务离开一个synchronized方法，计数递减，当计数为0的时候，锁被完全释放，此时别的任务就可以使用此资源。
// 2.synchronized同步块
// 2.1同步到单一对象锁
// 当使用同步块时，如果方法下的同步块都同步到一个对象上的锁，则所有的任务（线程）只能互斥的进入这些同步块。
// Resource1.java演示了三个线程（包括main线程）试图进入某个类的三个不同的方法的同步块中，虽然这些同步块处在不同的方法中，
// 但由于是同步到同一个对象（当前对象 synchronized (this)），所以对它们的方法依然是互斥的。
// 这样三者会按顺序执行
public class Resource1 {
    public void f() {
        // other operations should not be locked...
        System.out.println(Thread.currentThread().getName()  + ":not synchronized in f()");
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()  + ":synchronized in f()");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void g() {
        // other operations should not be locked...
        System.out.println(Thread.currentThread().getName() + ":not synchronized in g()");
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ":synchronized in g()");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void h() {
        // other operations should not be locked...
        System.out.println(Thread.currentThread().getName()
                + ":not synchronized in h()");
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()
                        + ":synchronized in h()");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        final Resource1 rs = new Resource1();

        new Thread() {
            public void run() {
                rs.f();
            }
        }.start();

        new Thread() {
            public void run() {
                rs.g();
            }
        }.start();

        rs.h();
    }
}