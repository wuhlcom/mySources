package enum_demo;

public class TestSeanson {
    public static void main(String[] args) {
        String summer = "SUMMER";
        //通过valueOf，获取SUMMER的枚举类型
        SeasonEnum season2 = SeasonEnum.valueOf(summer);
        //直接初始化
        SeasonEnum season1 = SeasonEnum.SPRING;
        switch (season2) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
