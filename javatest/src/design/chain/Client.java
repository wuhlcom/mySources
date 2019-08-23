package design.chain;

public class Client {

    public static void main(String[] args) {
        Manager common = new CommonManager("经理");
        Manager majordomo = new Majordomo("总监");
        Manager general = new GeneralManager("CEO");

        common.setManager(majordomo);
        majordomo.setManager(general);
        common.manage(800);
        common.manage(1100);
        common.manage(5100);
        common.manage(13000);

        Manager common2 = new CommonManager("张飞");
        common2.setMana(new Majordomo("关羽")).setMana(new GeneralManager("刘备"));
        common2.manage(800);
        common2.manage(1100);
        common2.manage(5100);
        common2.manage(13000);
    }
}
