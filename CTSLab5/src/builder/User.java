package builder;

public class User {

    private String username;
    private String email;
    private String firstName;
    private String lastName;

    private String phoneNo;
    private String address;
    private String birthday;

    public User(String username, String email, String firstName, String lastName, String phoneNo, String address, String birthday) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.birthday = birthday;
    }
}
