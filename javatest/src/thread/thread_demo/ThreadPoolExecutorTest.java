package thread.thread_demo;
//Javaͨ��Executors�ṩ�����̳߳أ��ֱ�Ϊ��
//newCachedThreadPool����һ���ɻ����̳߳أ�����̳߳س��ȳ���������Ҫ���������տ����̣߳����޿ɻ��գ����½��̡߳�
//newFixedThreadPool ����һ�������̳߳أ��ɿ����߳���󲢷������������̻߳��ڶ����еȴ���
//newScheduledThreadPool ����һ�������̳߳أ�֧�ֶ�ʱ������������ִ�С�
//newSingleThreadExecutor ����һ�����̻߳����̳߳أ���ֻ����Ψһ�Ĺ����߳���ִ�����񣬱�֤����������ָ��˳��(FIFO, LIFO, ���ȼ�)ִ��

//�̳߳�Ϊ���޴󣬵�ִ�еڶ�������ʱ��һ�������Ѿ���ɣ��Ḵ��ִ�е�һ��������̣߳�������ÿ���½��̡߳�
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;

public class ThreadPoolExecutorTest {  
 public static void main(String[] args) {  
  ExecutorService cachedThreadPool = Executors.newCachedThreadPool();  
  for (int i = 0; i < 10; i++) {  
   final int index = i;  
   try {  
    Thread.sleep(index * 1000);  
   } catch (InterruptedException e) {  
    e.printStackTrace();  
   }  
   cachedThreadPool.execute(new Runnable() {  
    public void run() {  
     System.out.println(index);  
    }  
   });  
  }  
 }  
}  