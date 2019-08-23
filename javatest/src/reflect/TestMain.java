package reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestMain {
    public TestMain() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        A a = new A();
        Class cls = a.getClass();
        System.out.println(cls);
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());

        Class clsB = B.class;
        System.out.println(clsB);
        System.out.println(clsB.getName());
        System.out.println(clsB.getSimpleName());


        try {
            // 通过类的全路径名获取Class
            Class clsC = Class.forName("reflect.C");
            System.out.println(clsC);
            System.out.println(clsC.getName());
            System.out.println(clsC.getSimpleName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            // 通过类的全路径名获取Class
            Class clsD = Class.forName("reflect.D");
            System.out.println(clsD);
            System.out.println(clsD.getName());
            System.out.println(clsD.getSimpleName());
            Constructor[] constructors = clsD.getConstructors();
            Arrays.stream(constructors).forEach(constructor -> System.out.println(constructor));
            Constructor[] constructors1 = clsD.getDeclaredConstructors();
            //获取公有，无参构造
            Constructor constructor=clsD.getConstructor(null);
            //获取公有，有参构造
            System.out.println(constructor);
            Constructor constructor2=clsD.getConstructor(new Class[]{Integer.class,String.class});
            System.out.println(constructor2);

            Field[] fields =clsD.getFields();
            Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));

            Field[] dfields =clsD.getDeclaredFields();
            Arrays.stream(dfields).forEach(field -> System.out.println(field.getName()));

            Field field=clsD.getDeclaredField("name");
            Object object =constructor.newInstance();
            field.setAccessible(true);
            field.set(object,"李四");
            D d =(D)object;
            System.out.println(d);


            Field field1=clsD.getField("age");
            // Object af =constructor.newInstance();
            field1.set(object,1);
            D d1 =(D)object;
            System.out.println(d1);

            Method[] methods =clsD.getMethods();
            Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
