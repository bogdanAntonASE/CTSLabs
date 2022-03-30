package builder;

public class Main {
    public static void main(String[] args) {

        User user = new UserBuilder("bogdan", "bogdan@gmail", "bogdan", "anton")
                .address("address")
                .phoneNo("phoneNo")
                .birthday("birth")
                .build();

        System.out.println(user);
    }
}
