package builder;

public class UserBuilder {

    private String username;
    private String email;
    private String firstName;
    private String lastName;

    private String phoneNo;
    private String address;
    private String birthday;

    public UserBuilder(String username, String email, String firstName, String lastName) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder phoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public User build() {
        return new User(this.username, this.email, this.firstName, this.lastName,  this.phoneNo, this.address, this.birthday);
    }

}
