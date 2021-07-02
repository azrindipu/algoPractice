package design_pattern.observer.example01;
import design_pattern.observer.example01.observable.ChatRoomImpl;
import design_pattern.observer.example01.observers.User;
import design_pattern.observer.example01.observers.UserImpl;

public class MainClass {
    public static void main(String[] args){
        ChatRoomImpl chatRoom = new ChatRoomImpl();
        User user01 = new UserImpl("user01");
        User user02 = new UserImpl("user02");
        User user03 = new UserImpl("user03");
        User user04 = new UserImpl("user04");
        User user05 = new UserImpl("user05");
        chatRoom.add(user01);
        chatRoom.add(user02);
        chatRoom.add(user03);
        chatRoom.add(user04);
        chatRoom.add(user05);
        chatRoom.broadcastMessage("Hi... I am a new user");
        chatRoom.remove(user05);
        chatRoom.broadcastMessage("Hi... I am a new user");
    }
}
