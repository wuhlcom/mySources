package design.agency;

public class Test {

    public static void main(String[] args) {
        BeijinUser zhangsan=new BeijinUser("张三");
        BeijinUser lisi=new BeijinUser("李四");
        BeijinUser wanger=new BeijinUser("王二");
        ChatRoom chatRoom=new ChatRoom();

        zhangsan.login(chatRoom);
        lisi.login(chatRoom);
        wanger.login(chatRoom);

        String zhangsanTalk="你们好，伙计们";
        String zhangsanTalk2="王二别走";
        String zhangsanTalk3="他怎么走了？掉线了吗？";
        String lisiTalk="你也好";

        zhangsan.talk(zhangsanTalk);
        lisi.talk(lisiTalk);
        zhangsan.talk(zhangsanTalk2);
        wanger.leave();
        zhangsan.talk(zhangsanTalk3);

    }
}
