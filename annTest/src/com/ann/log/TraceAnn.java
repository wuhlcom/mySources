package com.ann.log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TraceAnn {

    public static void traceAnnotion(Object object) {
        Class<?> cla = object.getClass();
        useAnn(cla);
    }

    public static void traceAnnotion(String classPath) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(classPath);
        useAnn(clazz);
    }

    //clazz = OperatorLog.class
    //clazz = Class.forName(classPath);
    //clazz = obj.getClass;
    public static void traceAnnotion(Class<?> clazz) {
        useAnn(clazz);
    }

    private static void useAnn(Class<?> clazz) {
        //判断注解类上是否有该注解
        boolean isExist = clazz.isAnnotationPresent(OperatorLog.class);
        if (isExist) {
            //根据指定注解类型获取该注解
            OperatorLog operatorLog = clazz.getAnnotation(OperatorLog.class);
            System.out.println("类注解:" + operatorLog);
            //获取该元素上的所有注解，包含从父类继承
            Annotation[] an = clazz.getAnnotations();
            System.out.println("类上所有注解:" + Arrays.toString(an));
            //获取该元素上的所有注解，但不包含继承！
            Annotation[] an2 = clazz.getDeclaredAnnotations();
            System.out.println("类上非继承的注释:" + Arrays.toString(an2));
        }

        //方法注解
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(OperatorLog.class)) {
                OperatorLog operatorLog=method.getAnnotation(OperatorLog.class);
                System.out.println(operatorLog.id()+operatorLog.title());
            }
        }
    }

}
