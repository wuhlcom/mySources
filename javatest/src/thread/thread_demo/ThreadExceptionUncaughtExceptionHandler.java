package thread.thread_demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


/*
* ��һ������������߳��쳣�������淶�ġ��쳣��������
* ʵ��Thread.UncaughtExceptionHandler�淶
*/
class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    /*
     * Thread.UncaughtExceptionHandler.uncaughtException()�����߳���δ������쳣���ٽ�����ʱ������
     */
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught    "+e);
    }
}
	
	/*
	 * �ڶ����������̹߳���
	 * �̹߳��������������Ÿ��̣߳��������̰߳�һ���쳣������
	 */
	class HanlderThreadFactory implements ThreadFactory{
	    @Override
	    public Thread newThread(Runnable r) {
	        System.out.println(this+"creating new Thread");
	        Thread t = new Thread(r);
	        System.out.println("created "+t);
	        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());//�趨�̹߳������쳣������
	        System.out.println("eh="+t.getUncaughtExceptionHandler());
	        return t;
	    }
	}
	
	/*
	 * �����������ǵ�������ܻ��׳��쳣
	 * ��ʾ���׳�һ��exception
	 */
	class ExceptionThread implements Runnable{
	    @Override
	    public void run() {
	        Thread t = Thread.currentThread();
	        System.out.println("run() by "+t);
	        System.out.println("eh = "+t.getUncaughtExceptionHandler());
	        throw new RuntimeException();
	    }
	}
	
	/*
	 * ���Ĳ���ʹ���̹߳��������̳߳أ���������execute����
	 */
	public class ThreadExceptionUncaughtExceptionHandler{
	    public static void main(String[] args){
	        ExecutorService exec = Executors.newCachedThreadPool(new HanlderThreadFactory());
	        exec.execute(new ExceptionThread());
	    }
	}

