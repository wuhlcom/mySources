package design.template;

public class TestMain {
    public static void main(String[] args) {
        TestPaper studentA =new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();

        TestPaper studentB =new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();

        Drinker drinker=new Tea();
        Drinker drinker2=new Coffee();
        drinker.prepareRecipe();
        drinker2.prepareRecipe();
    }
}
