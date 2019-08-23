package design.compenent;

public class File extends Node {

    public File(String name) {
        super(name);
    }

    @Override
    void add(Node child) {
        System.out.println("末节点不能添加子节点");
    }

    @Override
    public void ls(int space){
        super.ls(space);
    }
}
