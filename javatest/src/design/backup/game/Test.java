package design.backup.game;

//简单的单次备忘
public class Test {

    public static void main(String[] args) {
        PlayerRole playerRole=new PlayerRole(100,2000,3000);
        MementoCaretaker mementoCaretaker=new MementoCaretaker();

        playerRole.display();
        Memento memento=playerRole.createMemento();
        mementoCaretaker.setMemento(memento);

        playerRole.fight();
        playerRole.display();

        System.out.println("要挂了，恢复到挑战之前的状态，提升等级和装备后再来打BOSS");
        playerRole.restore(mementoCaretaker.getMemento());
        playerRole.display();
        System.out.println("恢复成功了!");
    }
}
