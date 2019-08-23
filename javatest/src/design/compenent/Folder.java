package design.compenent;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {

    List<Node> nodes=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    void add(Node child) {
        nodes.add(child);
    }

    @Override
    public void ls(int space){
        super.ls(space);
        space++;
        for (Node node : nodes) {
            node.ls(space);
        }
    }

}
