package io;

import java.io.IOException;

public class CharInput {
    public static void main(String [] args) throws IOException {
        System.out.print("Enter a Char:");
        char i = (char) System.in.read();
        System.out.println("your char is :"+i);
    }
}
