package design.visitor;

public class Success extends Action {
    @Override
    void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+"时，背后都有一个伟大的女人");
    }

    @Override
    void getManConclusion(Women women) {
        System.out.println(women.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+"时，背后都有一个失败的男人");
    }
}
