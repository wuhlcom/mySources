package com.ann.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        User user = new User();
        System.out.println(user.sing());

        Foo f = new Foo();
        f.foo();

        // 1使用类加载器
        Class<?> fooClazz = Class.forName("com.ann.test.Foo");
        // 获取类注解
        boolean isClassInfo = fooClazz.isAnnotationPresent(ClassInfo.class);
        System.out.println(isClassInfo);
        if (isClassInfo) {
            ClassInfo classInfo = (ClassInfo) fooClazz.getAnnotation(ClassInfo.class);
            System.out.println("类注解，类名->" + fooClazz.getSimpleName() + ":注解值->" + classInfo.createdBy() + ":" + classInfo.toString());
        }

        try {
            // 1使用类加载器
            Class<?> clazz = Class.forName("com.ann.test.Child");
            // 获取类注解
            boolean isExist = clazz.isAnnotationPresent(Description.class);
            if (isExist) {
                Description d = (Description) clazz.getAnnotation(Description.class);
                System.out.println("类注解,类名->" + clazz.getSimpleName() + ":注解值->" + d.value());
            }

            //反射获取方法
            Method[] ms = clazz.getMethods();
            for (Method m : ms) {
                //判断方法上是否有注解
                boolean isMExist = clazz.isAnnotationPresent(Description.class);
                if (isMExist) {
                    //获取注解
                    Description d = m.getAnnotation(Description.class);
                    System.out.println("方法注解,方法名->" + m.getName() + ":注解值->" + d.value());
                }
            }


            for (Method m : ms) {
                //获取方法上的所有注解
                Annotation[] ans = m.getAnnotations();
                for (Annotation an : ans) {
                    if (an instanceof Description) {
                        Description d = (Description) an;
                        System.out.println("方法注解" + m.getName() + ":" + d.value());
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
