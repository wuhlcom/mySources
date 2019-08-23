package design.iterator;

public class Test {
    public static void main(String[] args) {
        System.out.println("---自定义容器类型2--");
        Aggregate<Integer> aggregate =new ConcreteAggregate<>();
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);

        MyIterator<Integer> integerMyIterator = aggregate.iterator();
        while (integerMyIterator.hasNext()){
           Integer i= integerMyIterator.next();
            System.out.println(i);
        }

        System.out.println("---自定义容器类型2--");
        Aggregate<String> aggregateStr =new ConcreteAggregate<>();
        aggregateStr.add("a");
        aggregateStr.add("b");
        aggregateStr.add("c");

        MyIterator<String> integerMyIterator2 = aggregateStr.iterator();
        while (integerMyIterator2.hasNext()){
            String str= integerMyIterator2.next();
            System.out.println(str);
        }

    }
}
