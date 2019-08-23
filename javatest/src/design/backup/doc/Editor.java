package design.backup.doc;

import java.util.ArrayList;
import java.util.List;

//编辑器
public class Editor {
     Doc doc;
     List<History> histories;
     private int historyPosion=-1;

    public Editor(Doc doc) {
        System.out.println("<<<打开"+doc.getTitle());
        histories=new ArrayList<>();
        this.doc = doc;
        backup();
    }

    //追加
    public void append(String txt){
        System.out.println("<<<插入操作");
        doc.setBody(doc.getBody()+txt);
        backup();
        show();
    }

    public void save(){
        System.out.println("<<<存盘操作");
    }


    public void delete(){
        System.out.println("<<<删除操作");
        doc.setBody("");
        backup();
        show();
    }

    public void show(){
        System.out.println(doc.getBody());
        System.out.println("文档结束>>>\n");
    }

    public void backup(){
        System.out.println("<<<备份操作");
        histories.add(doc.creatHistory());
        historyPosion++;
    }

    public void undo(){
        System.out.println("<<<撤消操作");
        if (historyPosion==0){
            System.out.println("到头了不能再撤消了");
        }
        historyPosion--; //回滚到上一次

        // doc.setBody(histories.get(historyPosion).getBody());

        History history=histories.get(historyPosion);
        doc.restore(history);
        System.out.println(doc.getBody());
    }
}
