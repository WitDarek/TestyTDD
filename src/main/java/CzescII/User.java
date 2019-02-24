package CzescII;

public class User {

    String name;
    String mail;
    UserType userType;

    public User(String name, String mail, UserType userType) {
        this.name = name;
        this.mail = mail;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public UserType getUserType() {
        return userType;
    }
}
