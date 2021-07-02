package design_pattern.observer.example01.observers;

public class UserImpl implements User{

    private String userName;

    public UserImpl(String userName){
        this.userName=userName;
    }
    @Override
    public void update(String broadcastedMessage) {
        System.out.println("Dear "+userName+"\n"+"You have a message and the message is: "+broadcastedMessage);
    }
}
