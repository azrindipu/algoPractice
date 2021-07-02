package design_pattern.observer.example01.observable;

import design_pattern.observer.example01.observers.User;

public interface ChatRoom {
    public void add(User user);
    public void remove(User user);
    public void notifyAllObservers(String broacastedMessage);
}
