package streamDemo;

public class Person {


        private String name;
        private int age;
        private String type;

        public Person() {
        }

    public Person(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
