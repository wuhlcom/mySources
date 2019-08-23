package design.builder.person;

public class TestMain {
    public static void main(String[] args) {
        ThinPersonBuilder thinPersonBuilder=new ThinPersonBuilder();
        PersonDirector personDirector=new PersonDirector(thinPersonBuilder);
        personDirector.createPerson();
        System.out.println("----------------------------------------------------");
        FatPersonBuilder fatPersonBuilder=new FatPersonBuilder();
        PersonDirector personDirector1=new PersonDirector(fatPersonBuilder);
        personDirector1.createPerson();
    }
}
