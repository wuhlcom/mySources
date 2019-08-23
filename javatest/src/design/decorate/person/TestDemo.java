package design.decorate.person;

public class TestDemo {
    public static void main(String[] args) {
        Person p=new Person("小菜");
        TShirts tShirts=new TShirts(p);
        BitTrouser bitTrouser=new BitTrouser(tShirts);
        bitTrouser.show();
    }
}
