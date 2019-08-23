package com.sp.client.protocol.event.monitor;

public class TestListener {

    public static void main(String[] args) {
        Person person=new Person();
        person.registerListener(new MyPersonListener());
        person.run();
        person.eat();
    }
}
