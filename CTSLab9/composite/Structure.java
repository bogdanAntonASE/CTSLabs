package composite;

import java.util.ArrayList;
import java.util.List;

public class Structure extends ANode {
    private String name;
    //missing price
    private List<ANode> list = new ArrayList<>();

    public Structure(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        String info = this.getName() + "\n";
        for (var node: this.list) {
            info += node.getInfo() + "\n";
        }
        return info;
    }

    @Override
    public void addNode(ANode element) {
        //super.addNode(element);
        list.add(element);
    }

    @Override
    public void removeNode(ANode elem) {
        //super.removeNode(elem);
        list.remove(elem);
    }

    @Override
    public ANode getNode(int index) {
        //super.removeNode(index);
        return list.get(index);
    }
}
