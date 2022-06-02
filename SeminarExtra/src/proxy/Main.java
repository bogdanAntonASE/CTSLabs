package proxy;

public class Main {

    public static void main(String[] args) {
        ILoginModule loginModule = new LoginModule("admin", "password");

        String[] dictionarPassword = new String[]{"12345678", "123456", "234", "abc", "savsdb", "password"};
        for (var pass: dictionarPassword) {
            if (loginModule.login("admin", pass)) {
                System.out.println("Pass found = " + pass);
            }
        }

        System.out.println("===========");
        ProxyLogin proxyLogin = new ProxyLogin(loginModule);
        for (var pass: dictionarPassword) {
            if (proxyLogin.login("admin", pass)) {
                System.out.println("Pass found = " + pass);
            }
        }
    }
}
