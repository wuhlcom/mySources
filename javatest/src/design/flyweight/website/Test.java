package design.flyweight.website;

public class Test {
    public static void main(String[] args) {
        WebsiteFacotry websiteFacotry = new WebsiteFacotry();
        Website ws1 = websiteFacotry.getInstance("产品展示");
        ws1.use();
        Website ws2 = websiteFacotry.getInstance("产品展示");
        ws2.use();
        Website ws3 = websiteFacotry.getInstance("博客");
        ws3.use();
        Website ws4 = websiteFacotry.getInstance("博客");
        ws4.use();
    }
}
