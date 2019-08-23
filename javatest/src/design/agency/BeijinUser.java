package design.agency;

public class BeijinUser implements IUser {

    private String name;

    private IChatRoom chatRoom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeijinUser(String name) {
        this.name = name;
    }

    @Override
    public void login(IChatRoom chatRoom) {
        chatRoom.connect(this);
        this.chatRoom=chatRoom;
    }

    @Override
    public void talk(String msg) {
         this.chatRoom.sendMsg(this,msg);
    }

    @Override
    public void leave() {
         this.chatRoom.remove(this);
    }

    @Override
    public void listen(IUser fromUser, String msg) {
        System.out.print("【"+this.name+"的对话框】");
        System.out.println(fromUser.getName() + " 说： " + msg);
    }
}
