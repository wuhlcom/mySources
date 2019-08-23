package design.proxy;

public class TestMain {

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("娇娇");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveDolls();
        proxy.giveRose();

    }
}
