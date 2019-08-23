package thread;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> sysDict =null;
        System.out.println(sysDict);
        Optional.of(null);
        Optional.ofNullable(null);
    }
}
