package design.compenent;

public abstract class Node {

    private String name;

    public Node(String name) {
        this.name = name;
    }

    abstract void add(Node child);

    protected void ls(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");//先循环输出n个空格；
        }
        System.out.println(name);//然后再打印自己的名字。
    }

    //无参重载方法，默认从第0列开始显示。
    protected void ls() {
        this.ls(0);
    }
}
