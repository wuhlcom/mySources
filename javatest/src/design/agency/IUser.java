package design.agency;

public interface IUser {

    public void login(IChatRoom chatRoom);
    public void talk(String msg);
    public void leave();
    public void listen(IUser user,String msg);
    public String getName();
}
