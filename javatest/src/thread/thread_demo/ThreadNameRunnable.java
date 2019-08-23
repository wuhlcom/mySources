package thread.thread_demo;

//增加Runnable线程
//设置线程名
public class ThreadNameRunnable implements Runnable {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("hello " + name);
	}

	public static void main(String[] args) {
		ThreadNameRunnable myThread = new ThreadNameRunnable();
		myThread.setName("world");
		Thread thread = new Thread(myThread);
		thread.start();
	}
}