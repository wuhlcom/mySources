package thread.threadPool.producerConsumer.demo2;

import java.util.ArrayList;
import java.util.List;

public class OrignData {

    public static List<Person> genData(Integer listSize) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            Person person = new Person();
            person.setId(i);
            person.setName("名字:" + String.valueOf(i));
            person.setAge(i);
        }
        return people;
    }

}
