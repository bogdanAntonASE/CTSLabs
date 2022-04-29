package facade;

public class Airline {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airline(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                '}';
    }

    public Flight flightBooking(String initialLocation, String destination) {
        return new Flight(initialLocation, destination, this);
    }
}
