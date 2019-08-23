package design.builder.person;

public class FatPersonBuilder implements PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("胖子的头");
    }

    @Override
    public void buildNeck() {
        System.out.println("胖子的脖子");
    }

    @Override
    public void buildBody() {
        System.out.println("胖子的身体");
    }

    @Override
    public void buildHands() {
        System.out.println("胖子的双手");
    }

    @Override
    public void buildLegs() {
        System.out.println("胖子的双脚");
    }
}
