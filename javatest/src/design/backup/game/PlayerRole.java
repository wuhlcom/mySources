package design.backup.game;

//游戏角色
public class PlayerRole {

    private int vitality;
    private int attack;
    private int defense;

    public PlayerRole(int vitality, int attack, int defense) {
        System.out.println(">>>角色战斗前状态");
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void fight() {
        System.out.println(">>>SOLO BOSS");
        this.attack = 1302;
        this.vitality = 2;
        this.defense = 2300;
    }

    public void display() {
        System.out.println("生命力:" + vitality + "%");
        System.out.println("战斗力:" + attack);
        System.out.println("防御力:" + defense);
    }

    public Memento createMemento() {
        System.out.println(">>>备份一下");
        return new Memento(vitality, attack, defense);
    }

    public void restore(Memento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

}
