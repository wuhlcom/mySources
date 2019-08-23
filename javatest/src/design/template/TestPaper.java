package design.template;

//同一个科目考试，多份学生试卷
//考题一样，不同学生的答案不同
//考题是模板
public abstract class TestPaper {

    public void testQuestion1(){
        System.out.println("1 世界最高的山是: a 珠木朗玛 b 黄山 c 秦山  \n answer:"+answer1());
    }

    public abstract String answer1();

    public void testQuestion2(){
        System.out.println("2 世界最长的河是: a 长江 b 黄河 c 心河  \n answer:"+answer2());
    }

    public abstract String answer2();



}
