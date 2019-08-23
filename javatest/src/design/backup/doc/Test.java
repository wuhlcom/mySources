package design.backup.doc;


//写文章每写一句备份一句，撤消操作，可以连续撤消，甚至可以恢复到任一步
public class Test {
    public static void main(String[] args) {
        Doc doc =new Doc("《AI的觉醒》");
        Editor editor = new Editor(doc);
        editor.append("第一章 AI的初始");
        editor.append("\n  人类文明时入。。。2W字。。");
        editor.append("\n第二章 AI的进化");
        editor.append("\n  AI Bla bla。。。10W字。。");
        editor.save();

        editor.delete();
        editor.undo();
        editor.undo();
    }
}
