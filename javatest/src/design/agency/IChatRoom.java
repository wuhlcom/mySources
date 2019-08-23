package design.agency;

public interface IChatRoom {


    public void connect(IUser user);

    public void sendMsg(IUser user,String msg);

    public void remove(IUser user);
}
