package enumDemo;

public class TestDemo {


    public static void main(String[] args) throws Exception {
        // TrafficLight trafficLight = new TrafficLight();
        // trafficLight.change();
        //
        // //返回所有枚举对象数组
        // System.out.println(Signal.values());
        // System.out.println(Signal.values()[0]);
        // System.out.println(Signal.values()[1]);
        // System.out.println(Signal.values()[2]);
        // //打印出实例名
        // System.out.println(Signal.RED.toString());
        // System.out.println(Signal.RED);
        // //将Sigal的RED实例赋值给signal
        // Signal signal = Enum.valueOf(Signal.class, "RED");
        // System.out.println(signal.getClass());
        // System.out.println(signal);

       // String n = EnumDemo.SINGLE.name();
       //  System.out.println(n);
        String a ="a";
        String[] as =a.split(",");
        System.out.println(as);
        for (String s : as) {
            System.out.println(s);
        }
        System.out.println(1/10);

    }
}
