package design.proxy;

public class Proxy implements GiveGift {

    Pursuit pursuit;

    //对于客户端只能看到schoolgirl和proxy，pursuit被隐藏了
    public Proxy(SchoolGirl mm) {
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void giveRose() {
        pursuit.giveRose();
    }

    @Override
    public void giveDolls() {
       pursuit.giveDolls();
    }
}
