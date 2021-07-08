package design_pattern.template;

public class User extends Record implements DbObject{

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void beforeSave() {
        System.out.println("User is going to save");
    }

    @Override
    public void afterSave() {
        System.out.println("User is saved");
    }
}
