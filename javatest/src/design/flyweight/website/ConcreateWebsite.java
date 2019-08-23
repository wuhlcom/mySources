package design.flyweight.website;

public class ConcreateWebsite extends Website {
    private String name;

    public ConcreateWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类:"+name);
    }
}
