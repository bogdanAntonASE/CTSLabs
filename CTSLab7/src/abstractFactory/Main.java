package abstractFactory;

public class Main {

    public static void main(String[] args) {
        /*Factory factory = new Factory();
        IWeapon weapon = factory.getWeapon(201);

        weapon.power();*/

        /*IFactory factory = new CheapFactory();
        IWeapon weapon = factory.getWeapon();
        weapon.power();*/

        Shop shop = new Shop(new MagicFactory());
        shop.createFamilyObjects();
    }
}
