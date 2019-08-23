package design.builder.person;

public class PersonDirector {

     PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildNeck();
        personBuilder.buildHands();
        personBuilder.buildLegs();
     }
}
