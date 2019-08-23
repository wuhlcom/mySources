package design.agency;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IChatRoom {
    private List<IUser> users = new ArrayList<>();

    @Override
    public void connect(IUser user) {
        System.out.println(">>>>"+user.getName()+"加入聊天室");
        users.add(user);
    }

    @Override
    public void sendMsg(IUser fromUser, String msg) {
        users.stream().filter(user -> !user.equals(fromUser)).forEach(toUser -> toUser.listen(fromUser, msg));
    }

    @Override
    public void remove(IUser user) {
        System.out.println("<<<<"+user.getName()+"离开聊天室");
        users.remove(user);
    }


}
