package synchronizedDemo;

public class ThreadSynchronizedClass {

    public static int sum = 0;

    public void add() throws InterruptedException {
        synchronized (ThreadSynchronizedClass.class) {
            Thread.sleep(500);
            sum++;
            System.out.println(Thread.currentThread().getName() + ":add:" + sum);
        }
    }

    public void del() throws InterruptedException {
        synchronized (ThreadSynchronizedClass.class) {
            Thread.sleep(500);
            sum--;
            System.out.println(Thread.currentThread().getName() + ":del:" + sum);
        }
    }

    /** static将synAdd作为类自身成员，所有实例共享，synchronized就能保证每个实例访问同步 */
    public synchronized static void synAdd() throws InterruptedException {
        Thread.sleep(500);
        sum++;
        System.out.println(Thread.currentThread().getName() + ":synAdd:" + sum);
    }

    public synchronized static void synDel() throws InterruptedException {
        Thread.sleep(500);
        sum--;
        System.out.println(Thread.currentThread().getName() + ":synDel:" + sum);
    }

    /**
     * 如果访问外部的静态变量一样具有同步的效果
     * @param name
     * @throws InterruptedException
     */
    public void show(String name) throws InterruptedException {
        synchronized (ThreadSynchronizedClass.class) {
            Thread.sleep(500);
            for (int i = 0; i < name.length(); i++) {
                System.out.println(Thread.currentThread().getName() + ":" + name.charAt(i));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadSynchronizedClass threadSynchronizedClass1 = new ThreadSynchronizedClass();
        ThreadSynchronizedClass threadSynchronizedClass2 = new ThreadSynchronizedClass();


        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {

                @SuppressWarnings("static-access")
                @Override
                public void run() {
                    try {
                        threadSynchronizedClass1.synAdd();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            new Thread(new Runnable() {

                @SuppressWarnings("static-access")
                @Override
                public void run() {
                    try {
                        threadSynchronizedClass2.synDel();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        threadSynchronizedClass2.show("abcdefghijklmn");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        threadSynchronizedClass1.show("abcdefghijklmn");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
}
