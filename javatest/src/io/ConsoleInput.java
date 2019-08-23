package io;

import java.io.Console;

public class ConsoleInput {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("please input your name:");
        String name = console.readLine();
        System.out.println("please input password:");
        char[] chars = console.readPassword();
        String password = String.valueOf(chars);
        System.out.println("your name:"+name+" your password:"+password);
    }
}
