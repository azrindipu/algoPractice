package design_pattern.observer.example01.observable;

import design_pattern.observer.example01.observers.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomImpl implements ChatRoom {

    private List<User> users = new ArrayList<>();
    @Override
    public void add(User user) {
        this.users.add(user);
    }

    @Override
    public void remove(User user) {
        this.users.remove(user);
    }

    @Override
    public void notifyAllObservers(String broadcastedMessage) {
        for(User user : users){
            user.update(broadcastedMessage);
        }
    }

    public void broadcastMessage(String message){
        this.notifyAllObservers(message);
    }
}
