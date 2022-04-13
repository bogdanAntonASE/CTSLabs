package abstractFactory;

public class Shop {
    private IFactory factory;

    public Shop(IFactory factory) {
        this.factory = factory;
    }

    public void createFamilyObjects() {
        ICostume costume = factory.getCostume();
        IWeapon weapon = factory.getWeapon();

        weapon.power();
        costume.protection();
    }
}
