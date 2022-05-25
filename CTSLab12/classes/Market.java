package classes;

public class Market {
    private String name;
    private int area;
    private ETypeMarket typeMarket;

    public Market(String name, int area, ETypeMarket typeMarket) {
        this.name = name;
        this.area = area;
        this.typeMarket = typeMarket;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ETypeMarket getTypeMarket() {
        return typeMarket;
    }

    public void setTypeMarket(ETypeMarket typeMarket) {
        this.typeMarket = typeMarket;
    }
}
