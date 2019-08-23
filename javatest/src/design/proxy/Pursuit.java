package design.proxy;
public class Pursuit implements GiveGift {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveRose() {
        System.out.println(mm.getName()+" 送你玫瑰花");
    }

    @Override
    public void giveDolls(){
        System.out.println(mm.getName()+" 送你洋娃娃");
    }
}
