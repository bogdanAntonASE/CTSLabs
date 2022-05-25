package classes;

import exceptions.ExceptionMarket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SuperMarketTest {

    static Market m1;
    static Market m2;
    static Market m3;
    static Market m4;
    static Market m5;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("SetupBeforeClass");

        m1 = new Market("Sephora", 20, ETypeMarket.BEAUTY);
        m2 = new Market("Pepco", 100, ETypeMarket.DECORATION);
        m3 = new Market("New Yorker", 80, ETypeMarket.CLOTHES);
        m4 = new Market("Notino", 15, ETypeMarket.BEAUTY);
        m5 = new Market("Dedeman", 1500, ETypeMarket.DECORATION);
    }

    @BeforeEach
    void setUp() {
        System.out.println("SetupSImple");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @AfterClass
    public void tearDownAfterClass() throws Exception {
        System.out.println("teardownafterclass");
    }

    // RIGHT BICEP
    @Test
    void testGetBiggestMarketByArea() throws ExceptionMarket {
        System.out.println("Test RIGHT");
        List<Market> listM = new ArrayList<>();
        listM.add(m1);
        listM.add(m2);
        listM.add(m3);
        listM.add(m4);
        listM.add(m5);

        SuperMarket superMarket = new SuperMarket("SunPlaza", listM);
        Market biggestMarketByArea = superMarket.getBiggestMarketByArea(ETypeMarket.BEAUTY);
        assertEquals(m1, biggestMarketByArea, "It's working");
    }

    @Test
    public void testGetBiggestMarketByAreaBoundary() throws ExceptionMarket {

        System.out.println("Test boundary");
        List<Market> listM = new ArrayList<>();

        listM.add(m1);
        SuperMarket superMarket = new SuperMarket("Mall Bucharest", listM);

        Market market1 = superMarket.getBiggestMarketByArea(ETypeMarket.BEAUTY);
        assertEquals("Sephora", market1.getName(), "It's working");
    }

    @Test
    public void testGetBiggestMarketByAreaException() throws ExceptionMarket {
        List<Market> listM = new ArrayList<>();
        SuperMarket superMarket = new SuperMarket("Mall Bucharest", listM);

        assertThrows(ExceptionMarket.class, () -> superMarket.getBiggestMarketByArea(ETypeMarket.BEAUTY));
    }

    @Test
    public void testGetBiggestMarketByAreaPerformance() throws ExceptionMarket {
        System.out.println("Test Performance");
        List<Market> listM = new ArrayList<>();
        listM.add(m1);
        listM.add(m2);
        listM.add(m3);
        listM.add(m4);
        listM.add(m5);

        SuperMarket superMarket = new SuperMarket("SunPlaza", listM);
        long start = System.currentTimeMillis();
        superMarket.getBiggestMarketByArea(ETypeMarket.BEAUTY);
        long stop = System.currentTimeMillis();

        assertTrue(stop - start < 5, "It's fast");
    }

    public Market getLargestMarket(List<Market> list, ETypeMarket marketType) {
        //?
        return list.stream().filter(e -> e.getTypeMarket().equals(marketType)).max(Comparator.comparing(Market::getArea)).get();
    }

    @Test
    public void testGetBiggestMarketByAreaCrossCheck() throws ExceptionMarket {
        System.out.println("Test CrossCheck");
        List<Market> listM = new ArrayList<>();
        listM.add(m1);
        listM.add(m2);
        listM.add(m3);
        listM.add(m4);
        listM.add(m5);

        SuperMarket superMarket = new SuperMarket("SunPlaza", listM);

        Market expected = getLargestMarket(listM, ETypeMarket.BEAUTY);
        Market actual = superMarket.getBiggestMarketByArea(ETypeMarket.BEAUTY);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetBiggestMarketByAreaInversion() throws ExceptionMarket {
        System.out.println("Test CrossCheck");
        List<Market> listM = new ArrayList<>();
        listM.add(m1);
        listM.add(m2);
        listM.add(m3);
        listM.add(m4);
        listM.add(m5);

        SuperMarket superMarket = new SuperMarket("SunPlaza", listM);
        Market result = superMarket.getBiggestMarketByArea(ETypeMarket.BEAUTY);

        for(var market: listM) {
            if (result.getName().equals(market)) {
                // maxArea
                // save the position
            }
        }
        // check if the position is between [0, listM.size())
    }
}