package classes;

import exceptions.ExceptionMarket;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SuperMarket {
    private String name;
    //private int area;

    private List<Market> listOfMarkets = new ArrayList<>();

    public SuperMarket(String name, List<Market> listOfMarkets) {
        this.name = name;
        this.listOfMarkets = listOfMarkets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Market> getListOfMarkets() {
        return listOfMarkets;
    }

    public void setListOfMarkets(List<Market> listOfMarkets) {
        this.listOfMarkets = listOfMarkets;
    }

    public Market getBiggestMarketByArea(ETypeMarket typeMarket) throws ExceptionMarket {
        if (this.listOfMarkets == null || this.listOfMarkets.isEmpty()) {
            throw new ExceptionMarket();
        }

//        Market maxMarket = this.listOfMarkets.get(0);
        Market maxMarket = null;
        int maxArea = -1;
        for(var market: this.listOfMarkets/*.stream().filter(e -> e.getTypeMarket().equals(typeMarket)).collect(Collectors.toList())*/) {
            if (market.getArea() > maxArea && market.getTypeMarket().equals(typeMarket)) {
                maxMarket = market;
                maxArea = market.getArea();
            }
        }

        if (maxMarket == null) {
            throw new ExceptionMarket();
        }

        return maxMarket;
    }
}
