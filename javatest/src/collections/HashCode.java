package collections;

import java.util.HashSet;
import java.util.Set;

public class HashCode {

    public static class   Person{

        private String name;
        private  Integer age;
        public Person() {
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            if (name != null ? !name.equals(person.name) : person.name != null) return false;
            return age != null ? age.equals(person.age) : person.age == null;
        }

        // @Override
        // public int hashCode() {
        //     int result = name != null ? name.hashCode() : 0;
        //     result = 31 * result + (age != null ? age.hashCode() : 0);
        //     return result;
        // }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person p1 =new Person("a",21);
        Person p2 =new Person("a",21);
        Person p3 =new Person("b",22);
        Set pSet= new HashSet();
        pSet.add(p1);
        pSet.add(p2);
        System.out.println(p1.equals(p2));
         System.out.println(p1.equals(p3));
    }


}