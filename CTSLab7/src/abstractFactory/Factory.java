package abstractFactory;

public class Factory implements IFactory {
    @Override
    public IWeapon getWeapon() {
        return null;
    }

    @Override
    public ICostume getCostume() {
        return null;
    }
    /*@Override
    public IWeapon getWeapon(int price) {
        if (price > 200) {
            return new MagicWeapon();
        }
        else {
            return new CheapWeapon();
        }
    }*/
}
