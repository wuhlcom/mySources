package design.visitor;

public class Failure extends Action {
    @Override
    void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+"时，闷头喝酒");
    }

    @Override
    void getManConclusion(Women women) {
        System.out.println(women.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+"时，低头哭泣");
    }
}
