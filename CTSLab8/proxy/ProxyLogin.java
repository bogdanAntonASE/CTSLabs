package proxy;

public class ProxyLogin implements ILoginModule {

    ILoginModule iLoginModule;
    int counter;

    public ProxyLogin(ILoginModule iLoginModule) {
        this.iLoginModule = iLoginModule;
    }

    @Override
    public boolean login(String username, String password) {
        if (counter >= 3) {
            System.out.println("Bruteforce attack");
            return false;
        }

        boolean isValidLogin = this.iLoginModule.login(username, password);
        if (!isValidLogin) {
            counter++;
        }
        else {
            counter = 0;
        }
        return isValidLogin;
    }
}
