package streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {


    public static void main(String[] args) {
        List<Person> pList = new ArrayList<Person>();
        pList.add(new Person("xiaoming", 3,"1"));
        pList.add(new Person("xiaoming2", 4,"2"));
        pList.add(new Person("xiaoming3", 5,"2"));
        pList.add(new Person("xiaoming4", 5,"3"));

        Map<String,List<Person>> map = pList.stream().collect(Collectors.groupingBy(Person::getType));
        System.out.println(map);

        System.out.println(pList);
        List<String> newList = pList.stream().map(Person::getName).sorted().limit(10).collect(Collectors.toList());
        System.out.println(newList);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        stream.map(i -> i + 1).forEach(System.out::println);


        Stream<String> language = Stream.of("java", "python", "node");
        //Convert a Stream to List
        List<String> result = language.collect(Collectors.toList());
        result.forEach(System.out::println);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表: " + filtered);

        List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // 获取空字符串的数量
        long count = strings2.parallelStream().filter(string -> string.isEmpty()).count();

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
        System.out.println("================================================================");
        Base.base();

    }
}
