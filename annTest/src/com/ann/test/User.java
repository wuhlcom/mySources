package com.ann.test;

public class User {
    /*
     * 忽略警告
     */
    @SuppressWarnings("deprecation")
    public String sing() {
        Person person = new Child();
        String sing = person.sing();
        return sing;
    }
}
