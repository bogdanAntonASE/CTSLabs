package proxy;

public class LoginModule implements ILoginModule {

    private String user;
    private String password;

    public LoginModule(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        if (user.equals(username)) {
            if (this.password.equals(password)) {
                return true;
            }
            else {
                System.out.println("Password incorrect");
            }
        }
        else {
            System.out.println("Username not present in database");
        }
        return false;
    }
}
