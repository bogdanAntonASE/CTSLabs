package composite;

public class Node extends ANode {
    private final String name;
    private final float price;

    public Node(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
