package design_pattern.template;


public class MainClass {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setUserName("Azrin Dipu");
        user.setDbObject(user);
        user.save();
    }
}
