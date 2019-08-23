package thread.callback;

/**
 * 所谓回调，就是客户程序C调用服务程序S中的某个方法A，然后S又在某个时候反过来调用C中的某个方法B，对于C来说，这个B便叫做回调方法。
 * 下面看一个实际例子来理解：
 * 本示例设置一个提问者，一个回答者，而回答者需要回答提问者一个很深奥的问题时，这时需要很多时间去查找，提问者又开始做其他的事情，
 * 等回答者找到答案后，再把答案告诉提问者。
 * 一.提问者的类
 * 涉及到长时间的思考，要sleep，要继承Thread
 * ---------------------
 * 版权声明：本文为CSDN博主「峥嵘life」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/wenzhi20102321/article/details/52512536
 */

public class XiaoZhang extends Thread {
    // 回答1+1，很简单的问题不需要线程
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // 重写run方法
    @Override
    public void run() {
        // 回答地球为什么是圆的
        askquestion();
        super.run();
    }

    // 回调接口的创建，里面要有一个回调方法
    //回调接口什么时候用呢？这个思路是最重要的
    public static interface CallPhone {
        public void call(String question);
    }

    // 回调接口的对象
    CallPhone callPhone;

    // 回答地球为什么是圆的
    private void askquestion() {
        System.err.println("小张:开始查找资料！");
        try {
            sleep(3000);// 思考3天
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 把答案返回到回调接口的call方法里面
        if (callPhone != null) {//提问者实例化callPhone对象，相当于提问者已经告诉我，我到时用什么方式回复答案
            //这个接口的方法实现是在提问者的类里面
            callPhone.call("小张:我知道了，！！！~~~~百度有啊");
        }
    }

}