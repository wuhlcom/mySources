package design.singleton.CSDN;

// 解法三：加同步锁时，前后两次判断实例是否存在（可行）
// 注解：只有当instance为null时，需要获取同步锁，创建一次实例。当实例被创建，则无需试图加锁。
// 缺点：用双重if判断，复杂，容易出错。
public class Singleton3 {
    private static Singleton3 instance=null;
    private Singleton3(){

    }
    public static Singleton3 getInstance(){
        if(instance==null){
            synchronized(Singleton3.class){
                if(instance==null){
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }
}