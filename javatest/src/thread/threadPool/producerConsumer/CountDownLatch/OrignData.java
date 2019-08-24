package thread.threadPool.producerConsumer.CountDownLatch;

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
            people.add(person);
        }
        return people;
    }

    public static void main(String[] args) {
        System.out.println(OrignData.genData(10));

    }

}
