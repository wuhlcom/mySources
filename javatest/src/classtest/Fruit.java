package classtest;

public class Fruit {

    public void shape(){
        System.out.println("Fruit is not sure!");
    }

    public void smell(){
        System.out.println("Very Nice!");
    }

    public void appleTree(){
        try {
            System.out.println("Call sub class method");
            Class clazz=Class.forName("classtest.Apple");
            Apple apple =(Apple) clazz.newInstance();
            apple.tree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
